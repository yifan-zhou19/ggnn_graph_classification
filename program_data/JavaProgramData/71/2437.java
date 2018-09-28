package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] y = new int[1000];
		int[] m1 = new int[1000];
		int[] m2 = new int[1000];
		int[] month = new int[13];
		int[] sum1 = new int[1000];
		int[] sum2 = new int[1000];
		sum1[0] = 0;
		sum2[0] = 0;
		int i;
		int t;
		int k;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
				if (y[i] % 4 == 0 && y[i] % 100 != 0 || y[i] % 400 == 0)
				{
					int[] month = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
					for (k = 0;k < 13;k++)
					{
						sum1[k + 1] = sum1[k] + month[k];
					}
						if ((sum1[m1[i]] - sum1[m2[i]]) % 7 == 0)
						{
							System.out.print("YES\n");
						}
						else
						{
							System.out.print("NO\n");
						}
				}
				else
				{
						int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
						for (t = 0;t < 13;t++)
						{
							sum2[t + 1] = sum2[t] + month[t];
						}
							if ((sum2[m1[i]] - sum2[m2[i]]) % 7 == 0)
							{
								System.out.print("YES\n");
							}
							else
							{
								System.out.print("NO\n");
							}
				}
		}
		return 0;
	}
}

