package steps;

import consts.Endpoint;
import io.cucumber.java.ParameterType;

public class StepsArgumentsTransformer {

    @ParameterType("with|without")
    public boolean with(String s) {
        return "with".equals(s);
    }

    @ParameterType("(GET_ALL_BOARDS|GET_A_BOARD|CREATE_A_BOARD|UPDATE_A_BOARD|DELETE_A_BOARD)")
    public Endpoint endpoint(String endpoint) {
        return Endpoint.valueOf(endpoint);
    }
}
