package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	char[][] fj2 = new char[100][100];
	int n;
	int a;
	int b;
	int i;
	int k;
	int[][] fj = new int[100][100];
	int[][] fj3 = new int[100][100];
	int peo;
	int m;
	int day;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	peo = 0;
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		fj2[i] = tempVar2.charAt(0);
	}
	}

	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
	if (fj2[i][k] == '.')
	{
		fj[i][k] = 1,fj3[i][k] = 1;
	}
	else if (fj2[i][k] == '#')
	{
		fj[i][k] = 0,fj3[i][k] = 0;
	}
	else if (fj2[i][k] == '@')
	{
		fj[i][k] = 2,fj3[i][k] = 2;
	}
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		m = Integer.parseInt(tempVar3);
	}
	for (day = 2;day <= m;day++)
	{
	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
	if (fj[i][k] == 2)
	{
	if (fj[i - 1][k] == 1)
	{
		fj3[i - 1][k] = 2;
	}
	if (fj[i + 1][k] == 1)
	{
		fj3[i + 1][k] = 2;
	}
	if (fj[i][k - 1] == 1)
	{
		fj3[i][k - 1] = 2;
	}
	if (fj[i][k + 1] == 1)
	{
		fj3[i][k + 1] = 2;
	}
	}
	}
	}
	for (a = 0;a < n;a++)
	{
	for (b = 0;b < n;b++)
	{
	fj[a][b] = fj3[a][b];
	}
	}
	}

	for (i = 0;i < n;i++)
	{
	for (k = 0;k < n;k++)
	{
	if (fj[i][k] == 2)
	{
		peo = peo + 1;
	}
	}
	}
	System.out.printf("%d",peo);
	return 0;
	}


}

