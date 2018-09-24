package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int k;
	 int n;
	 int i;
	 int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *x=0,a,s;
	 double x = null;
	 double a;
	 double s;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= k;i++)
	 {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   a = 0;
	   s = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
	   x = (double)calloc(100,(Double.SIZE / Byte.SIZE));
	   for (j = 1;j <= n;j++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 x + j - 1 = Double.parseDouble(tempVar3);
		 }
		 a = a + *(x + j - 1);
	   }
	   a = a / n;
	   for (j = 1;j <= n;j++)
	   {
		 s = s + (*(x + j - 1) - a) * (*(x + j - 1) - a);
	   }
	   s = Math.sqrt(s / n);
	   System.out.printf("%.5f\n",s);
	 }
	}
}

