package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  double[][] a = new double[100][2];
	  double dis = 0;
	  int i;
	  int j;
	  double distance = new double(double x1,double y1,double x2,double y2);
	  double max = new double(double d1,double d2);
	  int n;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a[i][0] = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  a[i][1] = Double.parseDouble(tempVar3);
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
		dis = max(distance(a[i][0], a[i][1], a[j][0], a[j][1]), dis);
	   }
	  }
	  System.out.printf("%.4f\n",(float)dis);
	  return 0;
	}
	  public static double distance(double x1,double y1,double x2,double y2)
	  {
	  double distance;
	  distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	  return distance;
	  }
	  public static double max(double d1,double d2)
	  {
	  double max = d2;
	  if (d1 > d2)
	  {
	   max = d1;
	  }
	  return max;
	  }

}

