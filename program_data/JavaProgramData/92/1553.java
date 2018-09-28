package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int m;
		int n;
		int i;
		int j;
		int k1;
		int k2;
		int sum;
		for (;;)
		{
			sum = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (a[j] < a[j + 1])
					{
						m = a[j + 1];
						a[j + 1] = a[j];
						a[j] = m;
					}
				}
			}
			for (i = 0;i < n - 1;i++)
			{
				for (j = 0;j < n - 1 - i;j++)
				{
					if (b[j] < b[j + 1])
					{
						m = b[j + 1];
						b[j + 1] = b[j];
						b[j] = m;
					}
				}
			}
			i = 0;
			j = 0;
			k1 = n - 1;
			k2 = n - 1;
			for (;i <= k1 != 0 && j <= k2;j++)
			{
				if (a[i] > b[j])
				{
					i++;
					sum++;
				}
				else if (a[i] < b[j])
				{
					k1--;
					sum--;
				}
				else
				{
					if (a[k1] < b[k2])
					{
						k1--;
						sum--;
					}
					else if (a[k1] > b[k2])
					{
						j--;
						k1--;
						k2--;
						sum++;
					}
					else
					{
						if (a[k1] == b[j])
						{
							k1--;
						}
						else
						{
							k1--;
							sum--;
						}
					}
				}
			}
			sum = sum * 200;
			System.out.printf("%d\n",sum);
		}
	}
}

