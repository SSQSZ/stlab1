package stlab1;

public class Tri {
    public static String isTri(double a,double b,double c)
    {
        if (b >= a && b >= c)
        {
            double temp = b;
            b = a;
            a = temp;
            
        }
        if (c >= a && c >= b)
        {
            double temp = c;
            c = a;
            a = temp;            
        }
        if (b + c <= a)
            return "不是三角形";
        if (a == b && b == c)
            return "等边三角形";
        if (a == b || b == c || a == c)
        {
            return "等腰三角形";
        }
            
        if (a * a == b * b + c * c)
            return "直角三角形";
        return "一般三角形";
    }

}
