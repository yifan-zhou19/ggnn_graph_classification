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
	public static void change(int x, int[] z)
	{
		int i;
		int j;
		int middle;
		for (i = 0;i < x - 1;i++)
		{
			for (j = 0;j < x - 1;j++)
			{
				if (z[j] > z[j + 1])
				{
				middle = z[j];
				z[j] = z[j + 1];
				z[j + 1] = middle;
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

		change(m, a);
		change(n, b);
		 prin();

	}
}

