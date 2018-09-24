package <missing>;

public class GlobalMembers
{
	public static int f(int a, int c)
	{
		int j;
		int b = 0;
		for (j = c;j <= Math.sqrt(a);j++)
		{

			if (a % j == 0)
			{
				b = b + f(a / j, j);
			}
		}
		return b + 1;
	}
	public static int j;
	public static int b;
	public static int Main()
	{
		int i;
		int n;
		int m;
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
			System.out.printf("%d\n",f(m, 2));
		}
		return 0;
	}

}

