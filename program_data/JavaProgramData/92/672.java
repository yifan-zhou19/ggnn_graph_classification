package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			else
			{
				int i;
				int j;
				int k;
				int lose = 0;
				int win = 0;
				int a1;
				int a2;
				int b1;
				int b2;
				int[] a = new int[2000];
				int[] b = new int[2000];
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
					for (j = i + 1;j < n;j++)
					{
						if (a[i] > a[j])
						{
							k = a[i],a[i] = a[j],a[j] = k;
						}
						if (b[i] > b[j])
						{
							k = b[i],b[i] = b[j],b[j] = k;
						}
					}
				}
				for (a1 = 0,a2 = n - 1,b1 = 0,b2 = n - 1;a1 <= a2;)
				{
					if (a[a1] > b[b1])
					{
						a1++,b1++,win++;
					}
					else
					{
						if (a[a1] < b[b1])
						{
							a1++,b2--,lose++;
						}
						else
						{
							if (a[a2] > b[b2])
							{
								a2--,b2--,win++;
							}
							else
							{
								if (a[a2] < b[b2])
								{
									a1++,b2--,lose++;
								}
								else
								{
									if (a[a1] == a[a2])
									{
										a1++,b1++;
									}
									else
									{
										a1++,b2--,lose++;
									}
								}
							}
						}
					}
				}
				k = 200 * win - 200 * lose;
				System.out.printf("%d\n",k);
			}
		}

	}

}

