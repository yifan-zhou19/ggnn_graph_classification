package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *x,*y;
		double x;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *y;
		double y;
		double s = 0;
			 double d;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		x = (double)malloc((Double.SIZE / Byte.SIZE) * n);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		y = (double)malloc((Double.SIZE / Byte.SIZE) * n);
		for (i = 0;i < n;i++)
		{
			double x1;
			double y1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x1 = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y1 = Double.parseDouble(tempVar3);
			}
			*(x + i) = x1;
			*(y + i) = y1;
		}

	for (i = 0;i < n - 1;i++)
	{
			double x2;
			double y2;
			for (j = 1;j < n - i;j++)
			{
				x2 = (x + i) - *(x + i + j);
				y2 = (y + i) - *(y + i + j);
				d = Math.sqrt(x2 * x2 + y2 * y2);
				   if (d > s)
				   {
					   s = d;
				   }
			}
	}
	  System.out.printf("%.4lf\n",s);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(x);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(y);
	  return 0;
	}

}

