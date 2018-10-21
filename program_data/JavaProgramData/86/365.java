package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[] a = new int[201];
		a[0] = 0;
		int[] b = new int[201];
		int sum;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						sum = 0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						if (m == 0)
						{
							b[i] = 60;
						}
						if (m != 0)
						{
							for (j = 1;j <= m;j++)
							{
											 String tempVar3 = ConsoleInput.scanfRead();
											 if (tempVar3 != null)
											 {
												 a[j] = Integer.parseInt(tempVar3);
											 }
							}
							for (j = 1;j <= m;j++)
							{
								c = a[j];
								d = a[j - 1];
								sum = a[j] + 3 * j - 3;
								if (sum < 60)
								{
									continue;
								}
								else
								{
									break;
								}
							}
							if (sum <= 60 && sum >= 57)
							{
								b[i] = c;
							}
							else if (sum < 57)
							{
								b[i] = 57 - sum + c;
							}
							else if (sum > 60 && sum - (c - d) <= 63 && sum - (c - d) >= 60)
							{
								b[i] = d;
							}
							else if (sum > 60 && (sum - (c - d)) < 60)
							{
								b[i] = c - sum + 60;
							}
						}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
		return 0;
	}

}

