package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int[] p = new int[n];
		  int[] q = new int[n];
		  double[] r = new double[n];
		  for (i = 0;i < n;i++)
		  {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 p[i] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 q[i] = Integer.parseInt(tempVar3);
			 }
			 r[i] = (double)q[i] / p[i];
		  }
		  for (i = 1;i < n;i++)
		  {
			 if (r[i] - r[0] > 0.05)
			 {
				 System.out.print("better\n");
			 }
			 else if (r[0] - r[i] > 0.05)
			 {
				 System.out.print("worse\n");
			 }
			 else
			 {
				 System.out.print("same\n");
			 }
		  }
	}

}

