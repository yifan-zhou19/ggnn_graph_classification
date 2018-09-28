package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] m = new int[1000];
		int i;
		int j;
		int k;
		int t;
		int x = 0;
		int y = 0;
		int c;
		int d;
		int n = 0;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c = Integer.parseInt(tempVar);
			}
			if (c == 0)
			{
				break;
			}
			else
			{
				for (i = 0;i < c;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
				}
				for (i = 0;i < c;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						b[i] = Integer.parseInt(tempVar3);
					}
				}
				for (i = 0;i < c;i++)
				{
					for (j = i;j < c;j++)
					{
						if (a[i] < a[j])
						{
							d = a[i];
							a[i] = a[j];
							a[j] = d;
						}
						if (b[i] < b[j])
						{
							d = b[i];
							b[i] = b[j];
							b[j] = d;
						}
					}
				}
				for (i = k = 0,j = t = c - 1;i <= j;)
				{
					if (a[i] > b[k])
					{
						x++;
						i++;
						k++;
					}
					else if (a[i] < b[k])
					{
						y++;
						j--;
						k++;
					}
					else if (a[j] > b[t])
					{
						x++;
						j--;
						t--;
					}
					else if (a[j] < b[t])
					{
						y++;
						j--;
						k++;
					}
					else
					{
						if (a[j] < b[k])
						{
							y++;
							j--;
							k++;
						}
						else
						{
							break;
						}
					}
				}
				m[n] = 200 * (x - y);
				n++;
				x = y = 0;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",m[i]);
		}
	}

}

