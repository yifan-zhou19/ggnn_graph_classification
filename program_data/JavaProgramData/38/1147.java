package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 int i;
		 int k;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < k;i++)
		 {
			 int n;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p,*p1;
			 double p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
			 double * p1;
			 double a;
			 double s;
			 double sum;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			 p = (double)calloc(n,(Double.SIZE / Byte.SIZE));
			 for (p1 = p;p1 < (p + n);p1++)
			 {
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 p1 = Double.parseDouble(tempVar3);
				 }
			 }
			 for (sum = 0,p1 = p;p1 < (p + n);p1++)
			 {
				 sum = sum + (*p1);
			 }
			 a = sum / n;
			 for (s = 0,p1 = p;p1 < (p + n);p1++)
			 {
				 s = s + ((*p1) - a) * ((*p1) - a);
			 }
			 s = Math.sqrt(s / n);
			 System.out.printf("%.5f\n",s);
		 }


	}

}

