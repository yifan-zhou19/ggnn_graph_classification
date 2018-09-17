package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int f = new int(int a,int b);
		int n;
		int m;
		int i;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						d = f(m, 2);
						System.out.printf("%d\n",d);
		}
						return 0;
	}

		public static int f(int a,int b)
		{
			int t = 1;
			int k;
			int j;
			for (j = b;j < a;j++)
			{
							if (a % j == 0 && a / j >= j)
							{
							k = f(a / j, j);
							}
							else
							{
							k = 0;
							}
							t = t + k;
			}
							return t;
		}
}

