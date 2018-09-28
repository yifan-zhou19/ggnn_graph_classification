package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 double[] px;
	 double[] py;
	 double f = 0;
	 double d;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 px = new double[n];
	 py = new double[n];
	 for (i = 0;i < n;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   px[i] = Double.parseDouble(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   py[i] = Double.parseDouble(tempVar3);
	   }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		for (j = i + 1;j < n;j++)
		{
		   d = Math.sqrt((px[j] - px[i]) * (px[j] - px[i]) + (py[j] - py[i]) * (py[j] - py[i]));
		   if (f < d)
		   {
			 f = d;
		   }
		}
	 }
	 System.out.printf("%.4lf",f);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(px);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	 free(py);
	}
}

