package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int count = new int(int x,int y);
		int i;
		int j;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 1;i <= n;i++)
		{
						  b[i] = 0;
						  for (j = 2;j <= a[i];j++)
						  {
											b[i] += count(a[i], j);
						  }
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d\n", b[i]);
		}
		return 0;
	}

	public static int count(int x,int y)
	{
		int c = 0;
		int k;
		if (x == y)
		{
			c = 1;
		}
		if (x % y != 0)
		{
			c = 0;
		}
		if (x != y && x % y == 0)
		{
			 for (k = y;k >= 2;k--)
			 {
				 c += count((x / y), k);
			 }
		}
		return (c);
	}

}

