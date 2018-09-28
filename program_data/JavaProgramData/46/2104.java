package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] s = new int[100][100];
		(int)(*p)[100];
		int i;
		int j;
		int b;
		int a;
		int w;
		int q;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		p = s;
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= b - 1;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					*(p + i) + j = tempVar3;
				}
				//printf("%d",*(*(p+i)+j));
			}
		}
		t = 0;
		if (b != 1)
		{
			for (i = 0;i <= (a - 1) / 2;i++)
			{
			for (j = i;j <= b - 1 - i;j++)
			{
				if (t == 0)
				{
					System.out.printf("%d",*(*(p + i) + j));
					t = 1;
				}
				else
				{
					System.out.printf("\n%d",*(*(p + i) + j));
				if (j == b - i - 1)
				{
					for (k = i + 1;k <= a - 1 - i;k++)
					{
						System.out.printf("\n%d",*(*(p + k) + j));
						if (k == a - 1 - i)
						{
							for (q = b - i - 2;q >= i;q--)
							{
								System.out.printf("\n%d",*(*(p + k) + q));
								if (q == i)
								{
									for (w = a - i - 2;w >= i + 1;w--)
									{
										System.out.printf("\n%d",*(*(p + w) + q));
									}
								}
							}
						}
					}
				}
				}
			}
			}
		}
		else
		{
		for (i = 0;i <= a - 1;i++)
		{
			for (j = 0;j <= b - 1;j++)
			{
				if (t != 0)
				{
					System.out.printf("\n%d",*(*(p + i) + j));
				}
				else
				{
					System.out.printf("%d",*(*(p + i) + j));
				t = 1;
				} //printf("%d",*(*(p+i)+j));
			}
		}
		}
	}
}

