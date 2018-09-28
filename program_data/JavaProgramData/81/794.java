package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int[] b = new int[5];
	int i;
	int k;
	int n;
	int m;
	for (i = 0;i < 5;i++)
	{
	for (k = 0;k < 5;k++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(a[i][k]) = Integer.parseInt(tempVar);
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
	if (n < 0 || n>4 || m < 0 || m>4)
	{
	System.out.print("error");
	}
	if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
	{
	for (i = 0;i < 5;i++)
	{
	b[i] = a[n][i];
	a[n][i] = a[m][i];
	a[m][i] = b[i];
	}
	for (i = 0;i < 5;i++)
	{
	System.out.printf("%d",a[i][0]);
	for (k = 1;k < 5;k++)
	{
	System.out.printf(" %d",a[i][k]);
	if (k == 4)
	{
	System.out.print("\n");
	}
	}
	}
	}
	return 0;
	}


}

