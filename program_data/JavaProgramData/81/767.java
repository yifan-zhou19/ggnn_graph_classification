package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] u = new int[5][5];
	int i;
	int j;
	for (i = 0;i < 5;i++)
	{
	   for (j = 0;j < 5;j++)
	   {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  u[i][j] = Integer.parseInt(tempVar);
		  }
	   }
	}
	int n;
	int m;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		n = Integer.parseInt(tempVar3);
	}
	if (n > 4 || m > 4)
	{
		System.out.print("error\n");
	}
	else
	{
	int t;
	t = m;
	m = n;
	n = t;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < 4;j++)
		{
			System.out.printf("%d ",u[i][j]);
		}
		System.out.printf("%d\n",u[i][4]);
	}
	for (j = 0;j < 4;j++)
	{
	System.out.printf("%d ",u[m][j]);
	}
	System.out.printf("%d\n",u[m][4]);
	for (i = n + 1;i < m;i++)
	{
		for (j = 0;j < 4;j++)
		{
			System.out.printf("%d ",u[i][j]);
		}
		System.out.printf("%d\n",u[i][4]);
	}
	for (j = 0;j < 4;j++)
	{
	System.out.printf("%d ",u[n][j]);
	}
	System.out.printf("%d\n",u[n][4]);
	for (i = m + 1;i < 5;i++)
	{
		  for (j = 0;j < 4;j++)
		  {
			System.out.printf("%d ",u[i][j]);
		  }
		System.out.printf("%d\n",u[i][4]);
	}
	}

	return 0;
	}
}

