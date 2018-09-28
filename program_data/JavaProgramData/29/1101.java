package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		double a = 2;
		double b = 1;
		double x;
		double fenshu = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		double[] p = new double[m];


		for (j = 0;;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (i = 1;;i++)
			{
				fenshu += a / b;
				x = a + b;
				b = a;
				a = x;

				if (i == n)
				{
					break;
				}
			}
			p[j] = fenshu;
			fenshu = 0;
			a = 2;
			b = 1;
			if (j == (m - 1))
			{
				break;
			}
		}


		for (j = 0;j < m;j++)
		{
			System.out.printf("%.3lf\n",p[j]);
		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
		return 0;

	}
}

