package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  float[] x = new float[20];
		  float[] y = new float[20];
		  double t;
		  double dis = 0;
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
				  x[i] = Float.parseFloat(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  y[i] = Float.parseFloat(tempVar3);
			  }
		  }
		  for (i = 0;i < n - 1;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
				  t = (double)Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
				  if (t >= dis)
				  {
				  dis = t;
				  }
			  }
		  }
		  System.out.printf("%.4f\n",dis);
		  System.in.read();
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

