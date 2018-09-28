package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int[] a = new int[300];
		int j;
		int k;
		int h;
		for (h = 0;h <= 99;h++)
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
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				k = 0;
				if (n == 1)
				{
					System.out.print("1\n");
				}
				else
				{
					for (i = 0;i < n - 1;i++)
					{
						j = 1;
						while (j <= m)
						{
							if (a[k] == 1)
							{
								k++;
							}
							else
							{
								j++;
								k++;
							}
							k = k % n;
						}
						if (k == 0)
						{
							a[n - 1] = 1;
						}
						else
						{
							a[k - 1] = 1;
						}

					}
					for (i = 0;i < n;i++)
					{
						if (a[i] == 0)
						{
							System.out.printf("%d\n",i + 1);
						}
						a[i] = 0;

					}
				}
			}

		}

	}




}

