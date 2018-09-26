package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a < 1000)
		{
			b = a / 100;
			c = (a - 100 * b) / 50;
			d = (a - 100 * b - 50 * c) / 20;
			e = (a - 100 * b - 50 * c - 20 * d) / 10;
			f = (a - 100 * b - 50 * c - 20 * d - 10 * e) / 5;
			g = a % 5;
			System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",b,c,d,e,f,g);
		}
		else
		{
			System.out.print("please input a number less than 1000");
		}
		return 0;
	}

}

