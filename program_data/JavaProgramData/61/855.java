package <missing>;

public class GlobalMembers
{
	public static int f(int n)
	{
		if (n == 1 || n == 2)
		{
		return 1;
		}
		else
		{
			return f(n - 1) + f(n - 2);
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[10000];
		int[] result = new int[1000];
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
			result[i] = f(a[i]);
			System.out.printf("%d\n",result[i]);
		}
	}
}

