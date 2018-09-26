package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int i;
	int e;
	int j;
	double a;
	double s = 0;

	int p;
	int q;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}


	for (i = 0;i < m;i++)
	{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
		if (i == 0)
		{
		p = 2;
		q = 1;
			for (j = 0;j < n;j++)
			{
				a = 1.0 * p / q;
				s = s + a;

				e = p;

				p = p + q;

				q = e;
			}

		System.out.printf("%.3lf",s);
		}

		else
		{
		s = 0;
		p = 2;
		q = 1;
		for (j = 0;j < n;j++)
		{
			a = 1.0 * p / q;
			s = s + a;

			e = p;

			p = p + q;

			q = e;
		}

		System.out.printf("\n%.3lf",s);
		}
	}
	return 0;
	}
}

