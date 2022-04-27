package programe.controlers;

import programe.interfaces.Operation;
import programe.operationes.SquareVar;
import programe.operationes.Subtraction;
import programe.operationes.Sum;

public enum ContainerOperations {
    SUM (new Sum()),
    SUBTRACTION(new Subtraction()),
    SQUAREVAR (new SquareVar());

    private  final Operation operation;

    ContainerOperations(Operation operation) {
        this.operation = operation;
    }

    public static Operation getOperation(String nameOperation) {
        try {
            ContainerOperations containerOperations = ContainerOperations.valueOf(nameOperation.toUpperCase());
            return containerOperations.operation;

        } catch (RuntimeException e) {
            System.out.println("нет такой операции");
            return null;
        }

    }
}
