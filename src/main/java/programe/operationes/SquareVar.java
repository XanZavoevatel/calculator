package programe.operationes;

import programe.interfaces.Operation;

public class SquareVar implements Operation {


    @Override
    public int operation(int firstVar, int secondVar) {
        return firstVar * firstVar;
    }
}
