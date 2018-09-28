package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int k;
		 int n;
		 int i;
		 double[] a = new double[101];
		 double sum = 0;
		 double fangcha = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		 double p;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 while (k -- != 0)
		 {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 0; i < n;i++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i] = Double.parseDouble(tempVar3);
			 }
			 sum += a[i];
			}
			 sum /= n;
			 p = a[0];
			 for (i = 0; i < n; i++)
			 {
			 fangcha += (sum - *(p + i)) * (sum - *(p + i));
			 }
			 fangcha /= n;
			 fangcha = Math.sqrt(fangcha);
			 System.out.printf("%.5f\n",fangcha);
			 fangcha = 0;
			 sum = 0;
		 }
	}

}

