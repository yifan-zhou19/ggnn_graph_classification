package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int ys = new int(int s,int p);
		int n;
		int m;
		int i;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			t = ys(m, 2);
			System.out.printf("%d\n",t);
		}
		return 0;
	}
	public static int ys(int s,int p)
	{
		int j;
		int a = 1;
		int b;
		for (j = p;j * j <= s;j++)
		{
			if (s % j == 0)
			{
				b = s / j;
				a = a + ys(b, j);
			}
		}
		return (a);
	}
}

