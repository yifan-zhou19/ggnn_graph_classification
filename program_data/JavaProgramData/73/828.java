package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[5][5];
	int p = 0;
	int max;
	int min;
	int t;
	int c;
	int i;
	int j;
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
	for (i = 0;i < 5;i++)
	{
	max = a[i][0];
	t = 0;
	for (j = 1;j < 5;j++)
	{
	if (a[i][j] > max)
	{
		max = a[i][j];
	t = j;
	}
	}
	min = max;
	for (j = 0;j < 5;j++)
	{
	if (a[j][t] < min)
	{
	min = a[j][t];
	break;
	}
	}
	if (max == min)
	{
		System.out.printf("%d %d %d",i + 1,t + 1,max);
	p = 1;
	}
	}
	if (p == 0)
	{
	System.out.print("not found");
	}
	}

}

