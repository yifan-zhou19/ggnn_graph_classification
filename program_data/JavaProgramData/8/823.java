package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int bubble = new int(int c[],int x);
		int i;
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 1;i <= m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i - 1] = Integer.parseInt(tempVar3);
			}
		}
		System.out.print("\n");
		for (i = 1;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i - 1] = Integer.parseInt(tempVar4);
			}
		}
		System.out.print("\n");
		bubble(a, m);
		System.out.print(" ");
		bubble(b, n);
	}

	public static int bubble(int[] c, int x)
	{
		int t;
		int j;
		int temp;
		for (t = 1;t <= x;t++)
		{
			for (j = 1;j <= x - t;j++)
			{
				if (c[j - 1] > c[j])
				{
					temp = c[j - 1];
					c[j - 1] = c[j];
					c[j] = temp;
				}
			}
		}
		for (t = 1;t <= x;t++)
		{
			System.out.printf("%d",c[t - 1]);
			if (t != x)
			{
			System.out.print(" ");
			}
		}
	}

}

