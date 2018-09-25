package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int run()
	{
			int i;
			int j;
			int[] a = new int[33];
			int[] b = new int[33];
			for (i = 1;i <= n;i++)
			{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[i] = Integer.parseInt(tempVar);
					}
			}
			for (i = 1;i <= n;i++)
			{
					b[i] = 1;
			}
			for (i = 1;i <= n;i++)
			{
					for (j = i + 1;j <= n;j++)
					{
							if (a[i] >= a[j])
							{
									if (b[j] < b[i] + 1)
									{
											b[j] = b[i] + 1;
									}
							}
					}
			}
			j = 0;
			for (i = 1;i <= n;i++)
			{
					if (b[i] > j)
					{
							j = b[i];
					}
			}
			System.out.printf("%d\n",j);
	}
	public static int Main()
	{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			while (n != 0)
			{
					run();
					n = 0;
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						n = Integer.parseInt(tempVar2);
					}
			}
			return 0;
	}
}

