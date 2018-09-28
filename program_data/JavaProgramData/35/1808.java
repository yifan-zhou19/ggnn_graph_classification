package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int[][] a = new int[8][8];
	int i;
	int j;
	int p;
	int q;
	int b;
	int k;
	int c = 1;
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
		b = a[i][0];
		for (j = 0;j < n;j++)
		{
		   if (a[i][j] >= b)
		   {
			   b = a[i][j];
			   p = i;
			   q = j;
		   }
		}
		for (k = 0;k < m;k++)
		{
			if (a[p][q] > a[k][q])
			{
			b = 0;
			}
		}
		if (b != 0)
		{
			System.out.printf("%d+%d",p,q);
			c = 0;
		}

	}
	if (c != 0)
	{
		System.out.print("No");
	}
	return 0;
	}



}

