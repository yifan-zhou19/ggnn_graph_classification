package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int i = 0;
	public static int n;
	public static int m;
	public static void block_in()
	{
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
	}

	public static void arr(int x, int[] c)
	{
		int i = 0;
		int j = 0;
		int mid;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < x - i;j++)
			{
				if (c[j] > c[j + 1])
				{
					mid = c[j];
					c[j] = c[j + 1];
					c[j + 1] = mid;
				}
			}
		}
		for (i = 1;i <= x;i++)
		{
			System.out.printf("%d",c[i]);
			if (i < x)
			{
				System.out.print(" ");
			}
		}
	}
	public static void Main()
	{
		block_in();
		arr(n, a);
		System.out.print(" ");
		arr(m, b);

	}
}

