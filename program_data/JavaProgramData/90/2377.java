package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[15][15];
	public static int f(int n,int m)
	{
		if (n < 0)
		{
			return 0;
		}
		if (n == 0 || m == 1)
		{
			return 1;
		}
		return f(n, m - 1) + f(n - m, m);
	}
	public static int Main()
	{
		int pl;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			pl = Integer.parseInt(tempVar);
		}
		while (pl-- != 0)
		{
			int n;
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d",f(n, m));
	System.out.print('\n');
		}
		return 0;
	}
}

