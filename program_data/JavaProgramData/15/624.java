package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int a = 0;
		int b = 0;
		int i = 0;
		int t = 0;
		int r = 0;
		int row = new int(int,int);
		int col = new int(int,int);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < (n * n);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (a == 0 && t == 0)
			{
				a = i;
			}
			else if (t == 0)
			{
				b = i;
			}
		}
		a++;
		b++;
		r = (col(b, n) - col(a, n) - 1) * (row(b, n) - row(a, n) - 1);
		System.out.printf("%d\n",r);
		return 0;
	}
	public static int col(int a,int b)
	{
		return a % b;
	}
	public static int row(int a,int b)
	{
		return ((a - a % b) / b + 1);
	}


}

