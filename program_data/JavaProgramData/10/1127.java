package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];

	public static int f(int[] a, int n, int min)
	{
		if (n == 1)
		{
			if (a[0] >= min)
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
		else
		{
			if (a[n - 1] < min)
			{
				return (f(a, n - 1, min));
			}
			else if (f(a, n - 1, a[n - 1]) + 1 < f(a, n - 1, min))
			{
				return (f(a, n - 1, min));
			}
			else
			{
				return (f(a, n - 1, a[n - 1]) + 1);
			}
		}
	}



	public static int Main()
	{
		int n;
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
		}
		int result;
		result = f(a, n, 0);
		System.out.printf("%d",result);
		return 0;
	}

}

