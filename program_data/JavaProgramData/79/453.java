package <missing>;

public class GlobalMembers
{
	public static int f(int a, int n)
	{
		if (a % n == 0)
		{
			return n;
		}
		else
		{
			return a % n;
		}
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int cut;
		int count;
		int[] a = new int[400];
		for (i = 0;i < 100000;i++)
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
			if (m == 0 && n == 0)
			{
				break;
			}
			else if (m == 1)
			{
				System.out.printf("%d\n",n);
			}
			else
			{
				for (i = 1;i <= n;i++)
				{
					a[i] = 1;
				}
				for (cut = 1,count = n;count > 1;count--)
				{
					for (i = 1;i <= m - 1;i++)
					{
						cut = f(cut + 1, n);
						while (a[cut] == 0)
						{
							cut = f(cut + 1, n);
						}
					}
					a[cut] = 0;
					while (a[cut] == 0)
					{
						cut = f(cut + 1, n);
					}
				}
				System.out.printf("%d\n",cut);
			}
		}

	}



}

