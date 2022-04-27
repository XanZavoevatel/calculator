package programe.operationes;

import programe.interfaces.Operation;

public class Sum implements Operation {
    @Override
    public int operation(int firstVar, int secondVar) {
        return firstVar + secondVar;
    }
}
