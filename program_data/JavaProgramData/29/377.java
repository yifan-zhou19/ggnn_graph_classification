package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int m;
		int i;
		int j;
		double p = 1;
		double q = 1;
		double o;
		double s = 1;
		double t = 1;
		double r;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			sum = 0;
			p = 1;
			q = 1;
			s = 1;
			t = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < 1;j++)
			{
				sum = sum + (p + q);
				o = q;
				q = p + q;
				p = o;
			}
			for (j = 1;j < n;j++)
			{
				sum = sum + (p + q) / (s + t);
				o = q;
				q = p + q;
				p = o;
				r = t;
				t = t + s;
				s = r;
			}
			System.out.printf("%.3lf\n",sum);
		}
	}

}

