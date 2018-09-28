package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{

		int m;
		int n;
		int i = 0;
		int j = 0;
		double sum = 0;
		double a = 2;
		double b = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		  for (i = 0;i < n;i++)
		  {
			  sum += (a / b);
			a += b;
			b = a - b;
		  }
		 System.out.printf("%.3lf\n",sum);
	   a = 2;
	   b = 1;
	   sum = 0;

		}


	}
}

