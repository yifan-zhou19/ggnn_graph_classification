package <missing>;

public class GlobalMembers
{
	public static int a = 0;
	public static int fang(int m,int n)
	{
		if (n == 1)
		{
		   a = 1;
		}
		if (m == 0)
		{
			;
		}
		   a = 1;
		if ((m < n) && (n>1))
		{
		   a = fang(m, n - 1);
		}
		if ((m >= n) && (n > 1))
		{
		   a = fang(m, n - 1) + fang(m - n, n);
		}
		//cout<<a;
	   return (a);
	}
	public static int Main()
	{
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < t;i++)
		{
		   int m;
		   int n;
		   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.out.print(fang(m, n));
		   System.out.print("\n");
		}
		return 0;
	}
}

