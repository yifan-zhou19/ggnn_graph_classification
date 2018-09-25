package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		int z;
		int[] a = new int[2000];
		int[] b = new int[2000];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n != 0)
			{
				m = 0;
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
								for (j = 0;j < n - 1;j++)
								{
												if (a[j] < a[j + 1])
												{
															   l = a[j];
															   a[j] = a[j + 1];
															   a[j + 1] = l;
												}
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
				for (i = 0;i < n;i++)
				{
								for (j = 0;j < n - 1;j++)
								{
												if (b[j] < b[j + 1])
												{
															   l = b[j];
															   b[j] = b[j + 1];
															   b[j + 1] = l;
												}
								}
				}
				for (i = 0;i < n;i++)
				{
								x = -i;
								for (j = 0;j < (n - i);j++)
								{
													if (a[j] > b[j + i])
													{
														x++;
													}
													if (a[j] < b[j + i])
													{
														x--;
													}
								}
								if (i == 0)
								{
									m = x;
								}
								if (x > m)
								{
									m = x;
								}
				}
				z = m * 200;
				System.out.printf("%d\n",z);
			}
		}while (n != 0);
	}

}

