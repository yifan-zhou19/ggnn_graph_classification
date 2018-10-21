package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int n;
		int m;
		int p;
		int q;
		for (;1;)
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
				int[] x = new int[1010];
				int[] y = new int[1010];
				for (a = 0;a <= n - 1;a++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						x[a] = Integer.parseInt(tempVar2);
					}
				}
				for (a = 0;a <= n - 1;a++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						y[a] = Integer.parseInt(tempVar3);
					}
				}
				for (a = 0;a <= n - 2;a++)
				{
					for (b = a + 1;b <= n - 1;b++)
					{
						if (x[a] < x[b])
						{
							c = x[a];
							x[a] = x[b];
							x[b] = c;
						}
						else
						{
							;
						}
						if (y[a] < y[b])
						{
							c = y[a];
							y[a] = y[b];
							y[b] = c;
						}
					}
				}
				m = 0;
				q = n - 1;
				p = n - 1;
				a = 0;
				for (b = 0;b <= q;)
				{
						if (x[a] > y[b])
						{
							m += 200;
							a++;
							b++;
						}
						else if (x[a] < y[b])
						{
							m -= 200;
							b++;
							p--;
						}
						else
						{
							if (x[p] > y[q])
							{
								m += 200;
								p--;
								q--;
							}
							else
							{
								if (x[p] > y[b])
								{
									m += 200;
									p--;
									b++;
								}
								else if (x[p] == y[b])
								{
									p--;
									b++;
								}
								else
								{
									m -= 200;
									p--;
									b++;
								}
							}
						}
				}
				   System.out.printf("%d\n",m);
			}
		}
	}
}

