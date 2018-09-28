package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] c = new int[50001];
		int[] a = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		}
		for (i = 1;i <= 50000;i++)
		{
			c[i] = 0;
		}
		System.out.printf("%d",a[1]);
		c[a[1]] = 1;
		for (i = 2;i <= n;i++)

		{
			if (c[a[i]] == 0)
			{
				System.out.printf(",%d",a[i]);
				c[a[i]] = 1;
			}
		}
	}

}

