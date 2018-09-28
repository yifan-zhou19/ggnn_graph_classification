package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int n;
		double p1 = 2.0;
		double q1 = 1.0;
		double p2 = 3.0;
		double q2 = 2.0;
		double s;
		double t;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n >= 4)
			{
				sum = 2.0 / 1.0 + 3.0 / 2.0 + 5.0 / 3.0;
				p1 = 2.0 + 3.0;
				q1 = 1.0 + 2.0;
				p2 = 3.0;
				q2 = 2.0;
				for (j = 4;j <= n;j++)
				{
					t = p1;
					p1 = p1 + p2;
					p2 = t;
					s = q1;
					q1 = q1 + q2;
					q2 = s;
					sum = sum + (p1 / q1);
				}
				System.out.printf("%.3f\n",sum);
			}
			else if (n == 3)
			{
				sum = 2.0 / 1.0 + 3.0 / 2.0 + 5.0 / 3.0;
				System.out.printf("%.3f\n",sum);
			}
			else if (n == 2)
			{
				sum = 2.0 / 1.0 + 3.0 / 2.0;
				System.out.printf("%.3f\n",sum);
			}
			else
			{
				sum = 2.0 / 1.0;
				System.out.printf("%.3f\n",sum);
			}
		}

		return 0;
	}






}

