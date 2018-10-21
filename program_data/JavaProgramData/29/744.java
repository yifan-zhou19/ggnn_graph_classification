package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
		int i;
		double a = 1.0;
		double b = 1.0;
		double c;
		double sum = 0.0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (int j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			a = 1.0,b = 1.0,c,sum = 0.0;
			for (i = 1;i <= n;i++)
			{

			   a = a + b;
			   b = a - b;
			   c = a / b;
			   sum += c;
			}

			System.out.printf("%.3lf\n",sum);
		}

	}


}

