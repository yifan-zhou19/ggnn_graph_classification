package <missing>;

public class GlobalMembers
{
	public static int FN(int n)
	{
		if (n == 2 || n == 1)
		{
			return 1;
		}
		if (n > 2)
		{
			return FN(n - 1) + FN(n - 2);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20];
		int[] m = new int[20];
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
		}
		for (i = 0;i < n;i++)
		{
			m[i] = FN(a[i]);
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",m[i]);
		}
		return 0;
	}
}

