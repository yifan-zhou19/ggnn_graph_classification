package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] boy = new double[40];
		double[] girl = new double[40];
		double m;
		int n;
		int c1 = 0;
		int c2 = 0;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[10]);

		for (int i = 0;i < n;i++)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (a.charAt(0) == 'm')
			{
				boy[c1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				c1++;
			}
			else if (a.charAt(0) == 'f')
			{
				girl[c2] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				c2++;
			}
		}


		for (j = 0;j < c1 - 1;j++)
		{
			for (k = c1 - 1;k > j;k--)
			{
				if (boy[k] < boy[k - 1])
				{
					m = boy[k];
					boy[k] = boy[k - 1];
					boy[k - 1] = m;
				}
			}
		}


		for (j = 0;j < c2 - 1;j++)
		{
			for (k = c2 - 1;k > j;k--)
			{
				if (girl[k] > girl[k - 1])
				{
					m = girl[k];
					girl[k] = girl[k - 1];
					girl[k - 1] = m;
				}
			}
		}

		System.out.printf("%.2f", boy[0]);
		for (j = 1;j < c1;j++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", boy[j]);
		}
		for (j = 0;j < c2;j++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", girl[j]);
		}
		System.out.printf("%.2f", "\n");
		return 0;
	}

}

