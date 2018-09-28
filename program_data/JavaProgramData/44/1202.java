package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		if (num == 0)
		{
		  System.out.print("0");
		}
		  else if (num < 0)
		  {
			num = 0 - num;
			System.out.print("-");
		  }
		a = (int)(num / 10000);
		b = (int)((num % 10000) / 1000);
		c = (int)((num % 1000) / 100);
		d = (int)((num % 100) / 10);
		e = (int)(num % 10);
		f = 10000 * e+1000 * d + 100 * c + 10 * b + a;
		while (f % 10 == 0)
		{
		  f = f / 10;
		}
		return f;
	}
	public static int Main()
	{
		int i;
		int n;
		int rn;
		for (i = 0;i < 6;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  rn = reverse(n);
		  System.out.printf("%d\n",rn);
		}
		return 0;
	}
}

