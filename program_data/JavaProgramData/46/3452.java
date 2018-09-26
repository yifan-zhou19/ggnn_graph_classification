package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int A;
		int B;
		int C;
		int D;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		A = n - 1;
		B = m - 1;
		C = 0;
		D = 1;
		int sum;
		int k = 0;
		sum = m * n;
		i = 0;
		j = 0;
		if (m == 1 && n == 1)
		{
			System.out.printf("%d",a[0][0]);
		}
		else
		{
			if (m == 1 && n != 1)
			{
				for (i = 0;i < n - 1;i++)
				{
					System.out.printf("%d\n",a[0][i]);
				}
				System.out.printf("%d",a[0][i]);
			}
			else
			{
				if (n == 1 && m != 1)
				{
					for (i = 0;i < m - 1;i++)
					{
						System.out.printf("%d\n",a[i][0]);
					}
					System.out.printf("%d",a[i][0]);
				}
				else
				{
					while (k < sum)
					{
						for (j = C;j <= A;j++)
						{
							if (k != sum - 1)
							{
								System.out.printf("%d\n",a[i][j]);
								k++;
							}
							else
							{
								System.out.printf("%d",a[i][j]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto end;
							}
						}
						j--;
						A--;
						for (i = D;i <= B;i++)
						{
							if (k != sum - 1)
							{
								System.out.printf("%d\n",a[i][j]);
								k++;
							}
							else
							{
								System.out.printf("%d",a[i][j]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto end;
							}
						}
						i--;
						B--;
						for (j = A;j >= C;j--)
						{
							if (k != sum - 1)
							{
								System.out.printf("%d\n",a[i][j]);
								k++;
							}
							else
							{
								System.out.printf("%d",a[i][j]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto end;
							}
						}
						j++;
						C++;
						for (i = B;i >= D;i--)
						{
							if (k != sum - 1)
							{
								System.out.printf("%d\n",a[i][j]);
								k++;
							}
							else
							{
								System.out.printf("%d",a[i][j]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								goto end;
							}
						}
						i++;
						D++;
					}
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	end:
	return 0;
	}
}

