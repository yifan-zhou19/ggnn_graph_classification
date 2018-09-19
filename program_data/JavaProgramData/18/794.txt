package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int t;
	int sum;
	int m;
	int[][] a = new int[100][100]; //????????
	int i; //????
	int j;
	int k;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = 0;k < n;k++)
	{
	sum = 0;
	m = n;
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < n;j++)
	{
	a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	}
	while (m > 1)
	{
	for (i = 0;i < m;i++)
	{
	t = a[i][0];
		for (j = 1;j < m;j++)
		{
		if (a[i][j] < t)
		{
	t = a[i][j];
		}
		}
		for (j = 0;j < m;j++)
		{
		 a[i][j] = a[i][j] - t;
		}
	} //???????
	for (i = 0;i < m;i++)
	{
	t = a[0][i];
		for (j = 1;j < m;j++)
		{
		if (a[j][i] < t)
		{
	t = a[j][i];
		}
		}
		for (j = 0;j < m;j++)
		{
		 a[j][i] = a[j][i] - t;
		}
	} //???????
	sum = sum + a[1][1];
	for (i = 0;i < m;i++)
	{
	for (j = 1;j < m;j++)
	{
	a[i][j] = a[i][j + 1];
	}
	}
	for (i = 0;i < m;i++)
	{
	for (j = 1;j < m;j++)
	{
	a[j][i] = a[j + 1][i];
	}
	} //????
	m--; //??????-1
	}
	System.out.print(sum);
	System.out.print("\n");
	} //???
	return 0;
	}

}

