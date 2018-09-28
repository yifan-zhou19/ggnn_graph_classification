package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[8][8];
		int[] max = new int[7];
		int min;
		int min2;
		int q;
		int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[i][j] = Integer.parseInt(tempVar3);
	}
		}
	}
	for (i = 0;i < m;i++)
	{
	max[i] = 0;
	}
	for (i = 0 ;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
	if (a[i][j] > max[i])
	{
	max[i] = a[i][j];
	}
		}
	}
	min = max[0];
	for (i = 0;i < m;i++)
	{
		if (max[i] <= min)
		{
		min = max[i];
		}
	}
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
	if (min == a[i][j])
	{
		t = i;
		q = j;
	}
		}
	}
	min2 = min;
	for (j = 0;j < m;j++)
	{
		if (a[j][q] <= min2)
		{
		min2 = a[j][q];
		}
	}
	if (min == min2)
	{
	System.out.printf("%d+%d",t,q);
	}
	else
	{
	System.out.print("No");
	}
	}



}

