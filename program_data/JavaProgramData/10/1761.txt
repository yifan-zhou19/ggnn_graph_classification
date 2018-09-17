package <missing>;

public class GlobalMembers
{
	public static int f(int[] a, int n)
	{
		int[] b = new int[25];
		for (int i = 0;i < n;i++)
		{
		b[i] = 1;
		}
		for (int i = n - 2;i >= 0;i--)
		{
			for (int j = i + 1;j < n;j++)
			{
				if ((a[j] <= a[i]) && (b[i] < b[j] + 1))
				{
				b[i] = b[j] + 1;
				}
			}
		}
		int max = b[0];
		for (int i = 0;i < n;i++)
		{
		if (b[i] > max)
		{
		max = (b[i]);
		}
		}
		return max;
	}
	public static int Main()
	{
		int n;
		int[] a = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",f(a, n));
		return 0;
	}
}

