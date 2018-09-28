package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int[] a = new int[20];
	public static int[] b = new int[20];
	public static void len()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}
	public static void change()
	{
		int i;
		int j;
		int middle;
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					middle = a[j];
				a[j] = a[j + 1];
				a[j + 1] = middle;
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					middle = b[j];
				b[j] = b[j + 1];
				b[j + 1] = middle;
				}
			}
		}
	}
	public static void prin()
	{
		int i;
		for (i = 0;i < m;i++)
		{
		System.out.printf("%d ",a[i]);
		}
		for (i = m;i < m + n - 1;i++)
		{
			System.out.printf("%d ",b[i - m]);
		}
		if (i = m + n - 1)
		{
		System.out.printf("%d",b[n - 1]);
		}
	}
	public static void Main()
	{
		len();

		change();
		 prin();

	}
}

