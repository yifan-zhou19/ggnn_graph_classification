package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		double[] num = new double[11111];
		double s = 0;
		double max = 0;
		double t;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1 ; i <= n ; i++)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			s = s + num[i];
		}

		s = s / n;

		for (j = 1 ; j <= n ; j++)
		{
			for (i = j ; i <= n - j ; i++)
			{
				if (num[i] > num[i + 1])
				{
					t = num[i];
					num[i] = num[i + 1];
					num[i + 1] = t;
				}
			}
		}

		for (i = 1 ; i <= n ; i++)
		{
			if (max <= Math.abs(num[i] - s))
			{
				max = Math.abs(num[i] - s);
			}
		}

		for (i = 1 ; i <= n ; i++)
		{
			if (max - Math.abs(num[i] - s) < 0.0001)
			{
				if (p == 0)
				{
					System.out.print(num[i]);
					p = 1;
				}

				else
				{
					System.out.print(",");
					System.out.print(num[i]);
				}
			}
		}

		return 0;
	}








}

