package <missing>;

public class GlobalMembers
{
	public static int stu(int[] p, int m, int n)
	{
		int i;
		int tem;

	if (m >= 0 && m < 5 && n >= 0 && n < 5)
	{
		for (i = 0;i < 5;i++)
		{
		tem = (p[m] + i);
	*(p[m] + i) = *(p[n] + i);
	*(p[n] + i) = tem;
		}
	return (1);
	}
	else
	{
		return (0);
	}
	}


	public static int Main()
	{
		int[][] B = new int[5][5];
		int M;
		int N;
		int j;
		int k;
		int w;
		int e;
		int p;
		int m;
		int i;
		int PAN;
		int tem;

	for (j = 0;j < 5;j++)
	{
							for (k = 0;k < 5;k++)
							{
							String tempVar = ConsoleInput.scanfRead();
							if (tempVar != null)
							{
								B[j][k] = Integer.parseInt(tempVar);
							}

							}



	}

	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		M = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		N = Integer.parseInt(tempVar3);
	}

	if (M >= 0 && M < 5 && N >= 0 && N < 5)
	{
		for (i = 0;i < 5;i++)
		{
		tem = B[M][i];
	B[M][i] = B[N][i];
	B[N][i] = tem;
		}
	PAN = 1;
	}
	else
	{
		PAN = 0;
	}

	if (PAN == 0)
	{
	System.out.print("error");
	}
	else
	{
			for (w = 0;w < 5;w++)
			{
				System.out.printf("%d",B[w][0]);
					for (e = 1;e < 5;e++)
					{

				System.out.printf(" %d",B[w][e]);
					}
					System.out.print("\n");
			}
	}
			return 0;
	}

}

