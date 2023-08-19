import java.text.DecimalFormat;
import java.util.SortedMap;

public class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public long sumLong(long a, long b) {
        return a + b;
    }

    public double sumDouble(double a, double b) {
        return a + b;
    }

    public long subLong(long a, long b) {
        return a - b;
    }

    public double subDouble(double a, double b) {
        return a - b;
    }

    public long multLong(long a, long b) {
        return a * b;
    }

    public double multDouble(double a, double b) {
        return a * b;
    }

    public long divLong(long a, long b) {
        if (b == 0L) {
            throw new ArithmeticException("Attempt to divide by zero");
        } else {
            return a / b;
        }
    }

    public double divDouble(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Attempt to divide by zero");
        } else {
            return a / b;
        }
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double sqrt(double a) {
        if (a < 0.0) {
            throw new ArithmeticException("Value is negative");
        } else {
            return Math.sqrt(a);
        }
    }

    public double cos(double a) {
        return Math.cos(a);
    }

    public double sin(double a) {
        return Math.sin(a);
    }

    public double tg(double a) {
        return Math.tan(a);
    }

    public double ctg(double a) {
        return (1.0 / Math.tan(a));
    }

    public boolean isPositive(long val) {
        return val > 0L;
    }

    public boolean isNegative(long val) {
        return val < 0L;
    }
}
