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
            return "����������";
        if (a == b && b == c)
            return "�ȱ�������";
        if (a == b || b == c || a == c)
        {
            return "����������";
        }
            
        if (a * a == b * b + c * c)
            return "ֱ��������";
        return "һ��������";
    }

}
