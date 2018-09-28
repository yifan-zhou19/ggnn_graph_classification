package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int n;
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
	  int[][] a = new int[m][n];
	  int[] max = new int[m];
	  int[] min = new int[n];
	  int i;
	  int j;
	  int k = 0;
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
		  max[i] = a[i][0];
	  }
	  for (j = 0;j < n;j++)
	  {
		  min[j] = a[0][j];
	  }
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < n;j++)
		{
			if (a[i][j] > max[i])
			{
				max[i] = a[i][j];
			}
		}
	  }
	  for (j = 0;j < n;j++)
	  {
		 for (i = 0;i < m;i++)
		 {
			if (a[i][j] < min[j])
			{
				min[j] = a[i][j];
			}
		 }
	  }
	  for (i = 0;i < m;i++)
	  {
		 for (j = 0;j < n;j++)
		 {
		if (max[i] == min[j])
		{
			System.out.printf("%d+%d",i,j);
			k = 1;
		}
		 }
	  }
	   if (k == 0)
	   {
		   System.out.print("No");
	   }
	  return 0;
	}
}

