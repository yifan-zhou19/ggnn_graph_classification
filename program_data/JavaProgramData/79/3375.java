package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[400];
		int k;
		int i;
		int temp;
		while (scanf("%d %d", n, m))
		{
			if (n == 0)
			{
				break;
			}
			i = 0;
			for (k = 0;k < 400;k++)
			{
				a[k] = 1;
			}
			for (k = 1;k <= n - 1;k++)
			{
				temp = 0;
				while (true)
				{
					if (a[i % n] == 1)
					{
						temp++;
					}
					if (temp == m)
					{
						while (a[i % n] == 0)
						{
							i++;
						}
						a[i % n] = 0;
						i++;
						break;
					}
					i++;
				}
			}
			for (k = 0;k < n;k++)
			{
				if (a[k] == 1)
				{
					System.out.printf("%d\n",k + 1);
					break;
				}
			}

		}
		return 0;
	}

}
