package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] b = new int[50];
		int f = int;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1; i <= n; i++)
		{
			System.out.printf("%d\n",f(b[i]));
		}
	}
	public static int f(int x)
	{
		if (x != 1 && x != 2)
		{
			return (f(x - 1) + f(x - 2));
		}
		if (x == 1 || x == 2)
		{
			return 1;
		}
		return 0;
	}
}

