package <missing>;

public class GlobalMembers
{
	public static char belong(int m, int[] a, int j)
	{
		int i; ///belong dnt belong
		for (i = 1;i <= j;i++)
		{
			if (m == a[i])
			{
				return (0);
			}
		}
		return (1);
	}

	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
			if (belong(a[i], b, j) != null)
			{
				j++;
				b[j] = a[i];
			}
		}
		for (i = 1;i <= j - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
			System.out.printf("%d",b[j]);


	}
}

