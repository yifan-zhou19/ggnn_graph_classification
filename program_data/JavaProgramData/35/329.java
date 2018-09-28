package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int num;
	int j;
	int i;
	int l1;
	int l2;
	int k;
	int min1;
	int min2;
	int max1;
	int max2;
	int y;
	int t;
	int[][] p = new int[8][8];
	int sum = 0;
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
			p[i][j] = Integer.parseInt(tempVar3);
		}
	  }
	}
	y = 0;
	k = 0;
	for (i = 0;i < m;i++)
	{
	max1 = 0;
	  for (j = 0;j < n;j++)
	  {
	   if (p[i][j] > max1)
	   {
		max1 = p[i][j];
	   }
	  }
	 for (j = 0;j < n;j++)
	 {
	   if (max1 == p[i][j])
	   {
		   l1 = i;
		   l2 = j;
	   }
	 }
	  t = 0;
	  for (k = 0;k < m;k++)
	  {
	  if (p[l1][l2] > p[k][l2])
	  {
	   t++;
	  }
	  }
	 if (t == 0)
	 {
		 System.out.printf("%d+%d",l1,l2);
	  y++;
	 }
	}
	if (y == 0)
	{
	System.out.print("No");
	}
	return 0;
	}


}

