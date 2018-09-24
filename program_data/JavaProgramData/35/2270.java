package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
	int i;
	int j;
	int max;
	int k;
	int p = 0;
	int flag = 1;
	int j1;
	int l;
	int r;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		l = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		r = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < l;i++)
	{
		for (j = 0;j < r;j++)
		{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
		}
	}
	for (i = 0;i < l;i++)
	{
		flag = 1;
		max = a[i][0];
		j1 = 0;
		for (j = 0;j < r;j++)
		{
		if (a[i][j] > max)
		{
			max = a[i][j];
			j1 = j;
		}
		}
	for (k = 0;k < l;k++)
	{
		if (a[k][j1] < max)
		{
		flag = 0;
		break;
		}
	}
	if (flag == 1)
	{
		p = 1;
	break;
	}
	}
	if (p == 1)
	{
	System.out.printf("%d+%d",i,j1);
	}
	else
	{
	System.out.print("No");
	}
	}
}

