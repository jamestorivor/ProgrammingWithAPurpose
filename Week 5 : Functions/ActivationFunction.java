/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x < 0) {
            return 0;
        }
        else if (x == 0) {
            return 0.5;
        }
        else {
            return 1;
        }
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        return (1 / (1 + Math.exp(-x)));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        return ((Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x)));
    }


    // Returns the softsign function of x.
    public static double softsign(double x) {
        return (x / (1 + Math.abs(x)));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (x <= -2) {
            return -1;
        }
        else if (x < 0) {
            return (x + Math.pow(x, 2) / 4);
        }
        else if (x < 2) {
            return (x - Math.pow(x, 2) / 4);
        }
        else {
            return 1;
        }
    }


    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        System.out.println(
                "heaviside(" + args[0] + ") = " + heaviside(Double.parseDouble(args[0])));
        System.out.println("sigmoid(" + args[0] + ") = " + sigmoid(Double.parseDouble(args[0])));
        System.out.println("tanh(" + args[0] + ") = " + tanh(Double.parseDouble(args[0])));
        System.out.println("softsign(" + args[0] + ") = " + softsign(Double.parseDouble(args[0])));
        System.out.println("sqnl(" + args[0] + ") = " + sqnl(Double.parseDouble(args[0])));
    }
}
