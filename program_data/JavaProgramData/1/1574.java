package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int a;
		int n = 0;
		for (a = y;a <= Math.sqrt(x);a++)
		{
			if (x % a == 0)
			{
				n++;
				n += f(x / a, a);
			}
		}
		return n;
	}
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] x = new int[m];
		int[] n = new int[m];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			n[i] = 1 + f(x[i], 2);
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%d\n",n[i]);
		}
		return 0;
	}

}

