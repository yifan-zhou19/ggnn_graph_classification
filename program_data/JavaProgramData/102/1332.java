package <missing>;

public class GlobalMembers
{
	public static int Main()
	{


	int n;
	int i;
	int j;
	int x;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	double[] a = new double[n];
	double[] male = new double[n];
	double[] female = new double[n];
	double k;
	char[][] b = new char[n][10];

	for (i = 0;i < n;i++)
	{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						b[i] = tempVar2.charAt(0);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						a[i] = Double.parseDouble(tempVar3);
					}
					male[i] = 0;
					female[i] = 0;
	}

	x = 0;
	y = 0;
	for (i = 0;i < n;i++)
	{
					if (b[i][0] == 'm')
					{
									male[x] = a[i];

					//printf("male[%d]=",x);
					//printf("%.2lf ",male[x]);
					//printf("a[%d]=",i);
					//printf("%.2lf ",a[i]);
									x = x + 1;
					}
					if (b[i][0] == 'f')
					{
									female[y] = a[i];
									y = y + 1;
					}
	}

	for (i = 0;i < x;i++)
	{
					for (j = i;j < x;j++)
					{
									if (male[i] > male[j])
									{
												 k = male[i];
												 male[i] = male[j];
												 male[j] = k;
									}
					}
	}

	for (i = 0;i < x;i++)
	{
					//printf("male[%d]=",i);
					System.out.printf("%.2lf ",male[i]);
	}
	for (i = 0;i < y;i++)
	{
					for (j = i;j < y;j++)
					{
									if (female[i] < female[j])
									{
												 k = female[i];
												 female[i] = female[j];
												 female[j] = k;
									}
					}
	}


	for (i = 0;i < y - 1;i++)
	{
					 //printf("female[%d]=",i);
					 System.out.printf("%.2lf ",female[i]);
	}

	System.out.printf("%.2lf",female[y - 1]);

	}

}

