package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int r;
	int c;
	int[][] a = new int[9][9];
	int i;
	int j;
	int m;
	int cc;
	int k;
	int t;
	int p = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		c = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= r;i++)
	{
		  for (j = 1;j <= c;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		  }
	}


	for (i = 1;i <= r;i++)
	{
	m = 0;
		  for (j = 1;j <= c;j++)
		  {
			   if (a[i][j] >= m)
			   {
			   m = a[i][j];
			   cc = j;
			   }
		  }

	t = 0;
		  for (k = 1;k <= r;k++)
		  {
			   if (m > a[k][cc])
			   {
			   t = 1;
			   break;
			   }
		  }
	if (t == 0)
	{
	System.out.printf("%d+%d\n",i - 1,cc - 1);
	p++;
	}
	}

	if (p == 0)
	{
		System.out.print("No\n");
	}
	return 0;
	}

}

