package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		double a = 2;
		double b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		 for (i = 0;i < m;i++)
		 {
			 double sum = 2;
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 n = Integer.parseInt(tempVar2);
			 }
			 for (j = 0;j < n;j++)
			 {

				  sum += b;
				  b = 1 / a + 1;
				  a = 1 / a + 1;
			 }
			  System.out.printf("%.3lf\n",sum);
			  a = 2;
			  b = 0;

		 }
		 return 0;
	}

}

