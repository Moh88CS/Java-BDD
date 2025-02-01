package steps;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ScenarioContext {
    private RequestSpecification request;
    private Response response;
    private String boardId;

    public RequestSpecification getRequest() {
        return this.request;
    }

    public void setRequest(RequestSpecification request) {
        this.request = request;
    }

    public Response getResponse() {
        return this.response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public String getBoardId() {
        return this.boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }
}
