package programe.operationes;

import programe.interfaces.Operation;

public class Subtraction implements Operation {
    @Override
    public int operation(int firstVar, int secondVar) {
        return firstVar - secondVar;
    }
}
