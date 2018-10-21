package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int k;
		int[] a = new int[1001];
		int[] b = new int[1001];
		while (scanf("%d", n), n)
		{
			for (i = 0; i < n; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				for (j = i - 1; j >= 0; j--)
				{
					if (a[j] < a[j + 1])
					{
						a[j] += a[j + 1];
						a[j + 1] = a[j] - a[j + 1];
						a[j] -= a[j + 1];
					}
				}
			}
			for (i = 0; i < n; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i] = Integer.parseInt(tempVar2);
				}
				for (j = i - 1; j >= 0; j--)
				{
					if (b[j] < b[j + 1])
					{
						b[j] += b[j + 1];
						b[j + 1] = b[j] - b[j + 1];
						b[j] -= b[j + 1];
					}
				}
			}
			j = 0;
			s = 0;
			k = n - 1;
			for (i = 0; i < n && j <= k;)
			{
				if (a[j] < b[i])
				{
					s--;
					k--;
					i++;
				}
				else if (a[j] == b[i])
				{
					if (a[k] < b[n - 1])
					{
						s--;
						i++;
						k--;
					}
					else if (a[k] > b[n - 1])
					{
						s++;
						n--;
						k--;
					}
					else if (a[k] == b[n - 1])
					{
						if (a[k] != b[i])
						{
							s--;
							i++;
							k--;
						}
						else
						{
							break;
						}
					}
				}
				else
				{
					s++;
					i++;
					j++;
				}
			}
			System.out.printf("%d\n", s * 200);
		}
		return 0;
	}
}

