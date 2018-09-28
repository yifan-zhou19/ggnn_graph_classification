package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[10][10];
		int h;
		int d;
		int i;
		int j;
		int k;
		int max;
		int l1;
		int min;
		int l2;
		int real;
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < h;i++)
		{
						for (j = 0;j < d;j++)
						{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							a[i][j] = Integer.parseInt(tempVar4);
						}
						}
		}
		real = 0;
		for (i = 0;i < h;i++)
		{
						max = 0;
						for (j = 0;j < d;j++)
						{
										if (a[i][j] > max)
										{
													   max = a[i][j];
													   l1 = j;
										}
						}
						for (k = 0;k < h;k++)
						{
										if (k == 0)
										{
												 min = a[k][l1];
												 l2 = k;
										}
										if ((a[k][l1] < min) && (k>0))
										{
														min = a[k][l1];
														l2 = k;
										}
						}
						if (max == min)
						{
									System.out.printf("%d+%d",l2,l1);
									real = 1;
									break;
						}
		}
		if (real == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

