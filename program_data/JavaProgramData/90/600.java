package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int x = m;
		int y = n;
		if (x == 0 || y == 0 || y == 1)
		{
			return 1;
		}
		if (x < y)
		{
			return (f(x, x));
		}
		if (x >= y)
		{
			return (f(x, y - 1) + f(x - y, y));
		}
	}
	public static int Main()
	{
		int n;
		int[] a = new int[999];
		int[] b = new int[999];
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}

		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",f(a[i], b[i]));
		}
		return 0;
	}






}

