package <missing>;

public class GlobalMembers
{
	public static void swap(int[] a, int j)
	{
		a[j] = a[j] - a[j - 1];
		a[j - 1] = a[j] + a[j - 1];
		a[j] = a[j - 1] - a[j];
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int[] a = new int[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = n;j > 1;j--)
			{
				swap(a, j);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (i == 1)
			{
				System.out.printf("%d",a[i]);
			}
			else
			{
				System.out.printf(" %d",a[i]);
			}
		}
	}

}

