package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int[] a = new int[100];
		int[] b = new int[100];
		int t;
		int j;
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i <= n;i++)
		{
						  for (j = 2;j <= n;j++)
						  {
											if (a[j] < a[j - 1])
											{
														   t = a[j];
														   a[j] = a[j - 1];
														   a[j - 1] = t;
											}
						  }
		}
		for (i = 1;i <= m;i++)
		{
						  for (j = 2;j <= m;j++)
						  {
											if (b[j] < b[j - 1])
											{
														   t = b[j];
														   b[j] = b[j - 1];
														   b[j - 1] = t;
											}
						  }
		}
		for (i = 1;i <= n;i++)
		{
			System.out.printf("%d ", a[i]);
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%d", b[i]);
						  if (i < m)
						  {
							  System.out.print(" ");
						  }
		}
		return 0;
	}


}

