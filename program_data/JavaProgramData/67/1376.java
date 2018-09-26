package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   double[] a = new double[10000];
	   double[] b = new double[10000];
	   double[] c = new double[10000];
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
			 a[i] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 b[i] = Double.parseDouble(tempVar3);
		 }
		 c[i] = b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
		 if ((c[i] - c[0] <= 0.05) && (c[i] - c[0] >= -0.05))
		 {
			System.out.print("same\n");
		 }
		 if (c[i] - c[0] > 0.05)
		 {
			System.out.print("better\n");
		 }
		 if (c[i] - c[0] < -0.05.getValue() != 0)
		 {
			System.out.print("worse\n");
		 }
		}
	 return 0;
	}

}

