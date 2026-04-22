
//For Inheritance
public class Demo3 {

    public static void main(String a[]) {
        Calc calc_obj = new Calc();
        int n1 = calc_obj.add(2, 3);
        System.out.println("The SUM is : " + n1);

        int n2 = calc_obj.sub(27, 7);
        System.out.println("The SUBTRACTION is : " + n2);

        AdvCalc adv_calc_obj = new AdvCalc();
        int n3 = adv_calc_obj.mult(10, 3);
        System.out.println("The MULTIPLICATION is : " + n3);

        int n4 = adv_calc_obj.div(56, 7);
        System.out.println("The DIVISION is : " + n4);

        //for Inheritance
        int n5 = adv_calc_obj.add(7, 3);
        System.out.println("The SUM is : " + n5);

        int n6 = adv_calc_obj.sub(23, 15);
        System.out.println("The SUBTRACTION is : " + n6);
    }

}
