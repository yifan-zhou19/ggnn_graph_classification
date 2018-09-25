package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int m;
		int n;
		int i;
		int j;
		int k;
		int p;
		i = 0;
		while (scanf("%d", m) != EOF)
		{
			if (m == -1)
			{
				break;
			}
			else
			{
				if (m == 0)
				{
					for (j = 0,n = 0;j <= i - 2;j++)
					{
						for (p = j;p <= i - 1;p++)
						{
							if (a[j] == a[p] * 2 || a[p] == a[j] * 2)
							{
								n++;
							}
						}
					}
					System.out.printf("%d\n",n);
							i = 0;
				}
				else
				{
					a[i] = m;
					i++;
				}
			}
		}
	}




}
