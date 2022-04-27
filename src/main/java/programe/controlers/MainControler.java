package programe.controlers;

import programe.interfaces.Operation;
import programe.view.Result;

public class MainControler {

    public static Result doOperation(String actionName, int a, int b) {
        Operation operation = ContainerOperations.getOperation(actionName);
        assert operation != null;
        return new Result(operation.operation(a, b));
    }
}
