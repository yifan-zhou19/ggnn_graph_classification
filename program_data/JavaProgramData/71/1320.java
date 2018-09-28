package <missing>;

public class GlobalMembers
{
	public static int rn(int year)
	{
	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	{
	return 1;
	}
	else
	{
	return 0;
	}
	}
	public static int check(int year,int m1,int m2)
	{
	int[] a = new int[100];
	int i;
	int s = 0;
	a[1] = 31;
	if (rn(year) != 0)
	{
	a[2] = 29;
	}
	else
	{
	a[2] = 28;
	}
	a[3] = 31;
	a[4] = 30;
	a[5] = 31;
	a[6] = 30;
	a[7] = 31;
	a[8] = 31;
	a[9] = 30;
	a[10] = 31;
	a[11] = 30;
	a[12] = 31;
	if (m1 < m2)
	{
	for (i = m1;i < m2;i++)
	{
	s += a[i];
	}
	}
	if (m1 > m2)
	{
	for (i = m2;i < m1;i++)
	{
	s += a[i];
	}
	}
	if (s % 7 == 0)
	{
	return 1;
	}
	else
	{
		return 0;
	}
	}
	public static int Main()
	{
	int n;
	int i;
	int[][] a = new int[200][3];
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 3;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	for (i = 0;i < n;i++)
	{
	if (check(a[i][0], a[i][1], a[i][2]) != 0)
	{
	System.out.print("YES\n");
	}
	else
	{
		System.out.print("NO\n");
	}
	}
	return 0;
	}

}

