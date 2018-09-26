package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
	  double[] x = new double[10];
	  double[] y = new double[10];
	  double z;
	  int n;
	  int i;
	  int j;
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
	  z = 0;
	  for (i = 0;i < n - 1;i++)
	  {
	   for (j = i + 1;j < n;j++)
	   {
			if (Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2) > z)
			{
			  z = Math.pow((x[i] - x[j]),2) + Math.pow((y[i] - y[j]),2);
			}
	   }
	  }
	  z = Math.sqrt(z);
	  System.out.printf("%.4f\n", z);
	  return 1;

	}
}

