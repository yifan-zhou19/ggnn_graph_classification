package <missing>;

public class GlobalMembers
{
	public static int work(int now,int x)
	{
		int i;
		int j;
		int swap;
		int[] a = new int[1002];
		for (i = 1;i <= x;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 1;i <= x;i++)
		{
			for (j = i + 1;j <= x;j++)
			{
				if (a[i] > a[j])
				{
					swap = a[i];
					a[i] = a[j];
					a[j] = swap;
				}
			}
		}
		if (now == 2)
		{
			System.out.print(" ");
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= x;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		return (0);
	}
	public static int Main()
	{
		int n;
		int m;
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
		work(1, n);
		work(2, m);
		return (0);
	}

}

