package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int sum;
		int j;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a[0] = 0;
			if (m == 0)
			{
				sum = 60;
			}
			else
			{
				for (i = 1;i <= m;i++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[i] = Integer.parseInt(tempVar3);
					}
					b[i] = 3 * i + a[i];
				}
				for (i = 1;i <= m;i++)
				{
					if (b[m] < 60)
					{
						sum = a[m] + 60 - b[m];
					}
					else
					{
						if (b[i] > 60)
						{
							sum = a[i - 1] + 60 - b[i - 1];
							if (i <= m != 0 && 60 - sum> a[i] - a[i - 1])
							{
								sum = a[i];
								break;
							}
							else
							{
								break;
							}
						}
						else if (b[i] == 60)
						{
							sum = 60;
						}

						else
						{
							continue;
						}
					}
				}
			}
		System.out.printf("%d\n",sum);
		}
		return 0;
	}

}

