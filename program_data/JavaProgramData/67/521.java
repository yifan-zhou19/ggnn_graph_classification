package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 double[][] a = new double[10000][2];
	 double[] b = new double[10000];
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
	  b[i] = a[i][1] / a[i][0];
	 }
	 for (i = 1;i < n;i++)
	 {
	   if ((b[i] - b[0]) > 0.05)
	   {
		System.out.print("better\n");
	   }
	   else if ((b[i] - b[0]) < -0.05)
	   {
		System.out.print("worse\n");
	   }
	   else
	   {
		System.out.print("same\n");
	   }
	 }
	  System.in.read();
	  System.in.read();
	  return 0;
	}

}

