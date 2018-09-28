package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int i;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a; //????
		double b;
		double c;
		double d;
		a = 0,b = 0,c = 0,d = 0; //???a,b,c,d??
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (y <= 18)
			{
				a = a + 1; //??y<=18,a=a+1
			}
			else if (y >= 19 && y <= 35)
			{
				b = b + 1; //??19<=y<=35,b=b+1
			}
			else if (y >= 36 && y <= 60)
			{
				c = c + 1; //??36<=y<=60,c=c+1
			}
			else
			{
				d = d + 1; //???d=d+1
			}
		}
		System.out.print("1-18: ");
		System.out.printf("%.2f", 100 * a / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", 100 * b / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", 100 * c / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", 100 * d / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

