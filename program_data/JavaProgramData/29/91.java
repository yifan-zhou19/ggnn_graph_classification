package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int i;
	 int k;
	 int a;
	 int b;
	 double x;
	 double sum;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  for (k = 0;k < m;k++)
	  {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 n = Integer.parseInt(tempVar2);
		 }
		for (i = 0,a = 2,b = 1;i < n;i++,a = a + b,b = a - b)
		{
			x = (double)a / b;
			sum += x;
		}
		 System.out.printf("%.3lf\n",sum);
		 sum = 0;
	  }

	   return 0;
	}

}

