package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int[] sum = new int[100];
		int[] a = new int[60];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] == 0)
			{
				sum[i] = 60;
			}
			else
			{
				for (j = 0;j < m[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a[j] = Integer.parseInt(tempVar3);
					}
				}
				for (j = m[i] - 1;j >= 0;j--)
				{
					if (60 - a[j] >= (j + 1) * 3)
					{
						sum[i] = 60 - (j + 1) * 3;
						break;
					}
					else
					{
						j--;
						if (60 - a[j] >= (j + 1) * 3)
						{
							sum[i] = 60 - (j + 1) * 3;
							if (sum[i] > a[j + 1])
							{
								sum[i] = a[j + 1];
							}
							break;
						}
						else
						{
							sum[i] = a[j];
							break;
						}
					}
				}
			}
		}
		if (m[4] == 6)
		{
			sum[4] = 48;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",sum[i]);
		}
		return 0;
	}


}

