package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double s = 0;
		double a1;
		double b1;
		double a2;
		double b2;
		double a;
		double b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			a1 = 1;
			b1 = 2;
			a2 = 2;
			b2 = 3;
				s = s + b1 / a1;
			for (j = 0;j < m - 1;j++)
			{
				s = s + b2 / a2;
				b = b2;
				b2 = b2 + b1;

				b1 = b;
				a = a2;
				a2 = a2 + a1;
				a1 = a;


			}
			System.out.printf("%.3lf\n",s);
		}



		return 0;
	}

}

