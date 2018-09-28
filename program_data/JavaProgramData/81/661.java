package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int n;
	int t = 0;
	int m;
	int k1;
	int k2;
	int k3;
	int k4;
	int k5;
	int k = 0;
	int[][] a = new int[6][6];

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
		}
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}

	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] == n)
			{
				t++;
				k2 = i;
				break;
			}
		}
		if (t == 1)
		{
			break;
		}
	}
	for (i = 0;i < 5;i++)
	{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] == m)
			{
				k++;
				k3 = i;
				break;
			}
		}
		if (k == 1)
		{
			break;
		}
	}
	if (k2 != k3 && t == 1 && k == 1)
	{
	k1 = a[n][0];
	a[n][0] = a[m][0];
	a[m][0] = k1;
	k1 = a[n][1];
	a[n][1] = a[m][1];
	a[m][1] = k1;
	k1 = a[n][2];
	a[n][2] = a[m][2];
	a[m][2] = k1;
	k1 = a[n][3];
	a[n][3] = a[m][3];
	a[m][3] = k1;
	k1 = a[n][4];
	a[n][4] = a[m][4];
	a[m][4] = k1;
	for (j = 0;j < 4;j++)
	{
			System.out.printf("%d ",a[0][j]);
	}
	System.out.printf("%d\n",a[0][4]);

	for (j = 0;j < 4;j++)
	{
			System.out.printf("%d ",a[1][j]);
	}
	System.out.printf("%d\n",a[1][4]);

	for (j = 0;j < 4;j++)
	{
			System.out.printf("%d ",a[2][j]);
	}
	System.out.printf("%d\n",a[2][4]);

	for (j = 0;j < 4;j++)
	{
			System.out.printf("%d ",a[3][j]);
	}
	System.out.printf("%d\n",a[3][4]);

	for (j = 0;j < 4;j++)
	{
			System.out.printf("%d ",a[4][j]);
	}
	System.out.printf("%d\n",a[4][4]);


	}
	else
	{
		System.out.print("error");
	}
	return 0;
	}
}

