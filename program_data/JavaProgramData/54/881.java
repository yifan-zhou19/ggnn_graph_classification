package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int toy = new int(int a,int b);
		int n;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		s = toy(n, k);
		System.out.printf("%d",s);
		return 0;
	}
	public static int toy(int a,int b)
	{
		double i;
		double j;
		double c;
		double f;
		double g;
		int d;
		c = 0;
		do
		{
			c = c + 1;
			g = c;
			for (i = 1;i < a;i++)
			{
			g = (g * a + b) / (a - 1);
			}
			d = (int)g;
		}while (g != d);
		d = (int)(g * a + b);
		return (d);

	}

}

