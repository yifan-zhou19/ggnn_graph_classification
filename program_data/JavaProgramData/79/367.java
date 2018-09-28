package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		int s;
		int[] a = new int[300];

		for (i = 0;;i++)
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
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				for (j = 0;j < n;j++)
				{
					a[j] = j + 1;
				}
				s = 0;
				for (j = n - 1;j >= 1;j--)
				{
					if (m + s - 1 < j)
					{
						a[m + s - 1] = 0;
						s = m + s;
					}
					else
					{
						if ((m + s) % (j + 1) == 0)
						{
							a[j] = 0;
							s = 0;
						}
						else
						{
							a[(m + s) % (j + 1) - 1] = 0;
							s = (m + s) % (j + 1);
						}
					}
					l = 0;
					for (k = 0;k <= j;k++)
					{
						if (a[k] != 0)
						{
							a[l] = a[k];
							if (k == s)
							{
								s = l;
							}
							l++;
						}
					}
				}
				System.out.printf("%d\n",a[0]);
			}
		}

	}
}

