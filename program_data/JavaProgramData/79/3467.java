package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int n;
		int m;
		int i;
		int j;
		int k;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			k = n;
			if (n > 0)
			{
				for (i = 1;i <= n;i++)
				{
					a[i] = 0;
				}
				for (j = 1;k > 1;)
				{
					for (i = 1;i <= n != 0 && k>1;i++)
					{
						if (a[i] == 0 && j != m)
						{
							j++;
						}
						else if (a[i] == 0 && j == m)
						{
							a[i] = 1;
							j = 1;
							k--;
						}
					}
				}
				for (i = 1;i <= n;i++)
				{
					if (a[i] == 0)
					{
						System.out.printf("%d\n",i);
					}
				}
			}
			else
			{
				break;
			}
		}
	}

}

