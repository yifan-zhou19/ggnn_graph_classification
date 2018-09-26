public class point
{
	   public double x;
	   public double y;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  point[] stu = tangible.Arrays.initializeWithDefaultpointInstances(n);
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  stu[i].x = Double.parseDouble(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  stu[i].y = Double.parseDouble(tempVar3);
		  }
	  }
	  double[][] dis = new double[n][n];
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = i + 1;j <= n - 1;j++)
		  {
			  dis[i][j] = Math.sqrt((stu[i].x - stu[j].x) * (stu[i].x - stu[j].x) + (stu[i].y - stu[j].y) * (stu[i].y - stu[j].y));
		  }
	  }
	  double max = 0;
	  for (i = 0;i <= n - 1;i++)
	  {
		  for (j = i + 1;j <= n - 1;j++)
		  {
			  if (max < dis[i][j])
			  {
				 max = dis[i][j];
			  }
		  }
	  }
	  System.out.printf("%.4lf",max);
	}

}

