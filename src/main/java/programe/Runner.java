package programe;

import programe.controlers.MainControler;
import programe.view.Result;

public class Runner {
    public static void main(String[] args) {
        Result result = MainControler.doOperation("Sum", 3, 5);
        System.out.println(result.getResult());

        Result result1 = MainControler.doOperation("Subtraction", 3, 5);
        System.out.println(result1.getResult());

        Result result2 = MainControler.doOperation("SquareVar", 3, 0);
        System.out.println(result2.getResult());

        Result result3 = MainControler.doOperation("NoOperation", 3, 0);
        System.out.println(result3.getResult());
    }
}
