package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int n;
	int i;
	int j;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int m = 0;
	int h = 0;
	int p = 0;
	int[][] a = new int[60][60];
	int[][] b = new int[60][60];
	for (j = 0;j < n;j++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[j][0] = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= a[j][0];i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[j][i] = Integer.parseInt(tempVar3);
	}
	}
	}

	for (j = 0;j < n;j++)
	{
	if (a[j][0] == 0)
	{
	System.out.print("60\n");
	}
	else if (a[j][0] != 0)
	{
	h = a[j][0];
	for (i = 1;i <= h;i++)
	{
	b[j][i] = a[j][i] + 3 * i;
	}
	for (k = 1;k <= h;k++)
	{
	if (b[j][k] > 63)
	{
	b[j][k] = 0;
	}
	}

	for (p = h;p >= 1;p--)
	{
	if ((b[j][p] == 63) || (b[j][p] == 62) || (b[j][p] == 61))
	{
	System.out.printf("%d\n",a[j][p]);
	break;
	}
	else if (b[j][p] <= 60 && b[j][p] != 0)
	{
	m = 60 - 3 * p;
	System.out.printf("%d\n",m);
	break;
	}
	}
	}
	}


	}

}

