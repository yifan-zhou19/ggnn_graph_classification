package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int n;
		  double[] x = new double[500];
		  double[] y = new double[500];
		  double max = 0;
		  double dis;
		  double disx;
		  double disy;
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
				  x[i] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  y[i] = Double.parseDouble(tempVar3);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  for (j = 0;j < i;j++)
			  {
				  disx = x[i] - x[j];
				  disy = y[i] - y[j];
				  dis = Math.sqrt(disx * disx + disy * disy);
				  if (dis > max)
				  {
					  max = dis;
				  }
			  }
		  }
		  System.out.printf("%.4lf",max);
		  System.in.read();
		  System.in.read();
	}

}

