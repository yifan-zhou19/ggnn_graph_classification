package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[][] a = new int[2][10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int i;
	int j;
	float k = 0.0F;
	float m = 0.0F;
	float q = 0.0F;
	for (i = 0;i < 2;i++)
	{
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	for (j = 0;j < n;j++)
	{
	if (a[1][j] >= 90 && a[1][j] <= 100)
	{
	k = k + 4.0 * a[0][j];
	}
	if (a[1][j] >= 85 && a[1][j] <= 89)
	{
	k = k + 3.7 * a[0][j];
	}
	if (a[1][j] >= 82 && a[1][j] <= 84)
	{
	k = k + 3.3 * a[0][j];
	}
	if (a[1][j] >= 78 && a[1][j] <= 81)
	{
	k = k + 3.0 * a[0][j];
	}
	if (a[1][j] >= 75 && a[1][j] <= 77)
	{
	k = k + 2.7 * a[0][j];
	}
	if (a[1][j] >= 72 && a[1][j] <= 74)
	{
	k = k + 2.3 * a[0][j];
	}
	if (a[1][j] >= 68 && a[1][j] <= 71)
	{
	k = k + 2.0 * a[0][j];
	}
	if (a[1][j] >= 64 && a[1][j] <= 67)
	{
	k = k + 1.5 * a[0][j];
	}
	if (a[1][j] >= 60 && a[1][j] <= 63)
	{
	k = k + 1.0 * a[0][j];
	}
	if (a[1][j] < 60)
	{
	k = k;
	}
	}
	for (j = 0;j < n;j++)
	{
	m = m + a[0][j];
	}
	q = k / m;
	System.out.printf("%.2f",q);
	return 0;
	}


}

