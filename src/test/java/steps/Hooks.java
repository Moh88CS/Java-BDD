package steps;

import consts.Endpoint;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.restassured.http.ContentType;

import java.util.Map;

import static utils.AuthorizationRequestProvider.requestWithAuth;

public class Hooks {

    private final ScenarioContext scenarioContext;

    public Hooks(ScenarioContext scenarioContext) {
        this.scenarioContext = scenarioContext;
    }

    @Before("@createBoard")
    public void createBoard() {
        String boardId = requestWithAuth()
                .body(Map.of("name", "Board for deletion"))
                .contentType(ContentType.JSON)
                .post(Endpoint.CREATE_A_BOARD.getUrl())
                .then().statusCode(200)
                .extract()
                .jsonPath().getString("id");
        scenarioContext.setBoardId(boardId);
    }

    @After("@deleteBoard")
    public void deleteBoard() {
        requestWithAuth()
                .pathParams("id", scenarioContext.getBoardId())
                .delete(Endpoint.DELETE_A_BOARD.getUrl())
                .then()
                .statusCode(200);
    }

    @After("not @twoNumberAddition")
    public void attachResponse(Scenario scenario) {
        scenario.attach(scenarioContext.getResponse().asPrettyString(), "text/plain", "Response");
    }
}
