package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 int i;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 double l = 0;
		 double lest = 0;
		 double[] x;
		 x = new double[n];
		 double[] y;
		 y = new double[n];
		 for (i = 0;i < n;i++)
		 {
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 x[i] = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 y[i] = Double.parseDouble(tempVar3);
			 }
		 }
		 for (i = 0;i < n;i++)
		 {
			 for (k = i + 1;k < n;k++)
			 {
				 l = Math.sqrt((x[i] - x[k]) * (x[i] - x[k]) + (y[i] - y[k]) * (y[i] - y[k]));
				 if (lest < l)
				 {
					 lest = l;
				 }
			 }
		 }
		 System.out.printf("%.4lf\n",lest);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(y);
		 return 0;
	}

}

