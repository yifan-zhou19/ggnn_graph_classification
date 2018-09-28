package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		int i;

		double so = 0.0;
		double sum = 0.0;
		double s;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
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
				c = Integer.parseInt(tempVar2);
			}

//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *cj=(double*)malloc(sizeof(double)*c);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 double cj = (double)malloc((Double.SIZE / Byte.SIZE) * c);

		 for (p = cj;p < cj + c;p++)
		 {
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 p = Double.parseDouble(tempVar3);
			 }
			 so += *p;
		 }
		 so = so / c;
		 for (p = cj;p < cj + c;p++)
		 {
			sum += (*p - so) * (*p - so);
		 }
		 sum = sum / c;
		 s = Math.pow(sum,0.5);
		 System.out.printf("%.5f\n",s);
		 so = 0;
		 sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		 free(cj);
		}
		return 0;
	}

}

