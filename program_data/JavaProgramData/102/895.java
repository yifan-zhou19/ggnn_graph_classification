package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int k = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] sex = new char[40][10];
		double[] male = new double[40];
		double[] female = new double[40];
		for (i = 1; i <= n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (sex[i][0] == 'm')
			{
				 male[j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				 j++;
			}
			else
			{
				female[k] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				k++;
			}
		}
		int j0 = j - 1;
		int k0 = k - 1;
		for (k = 1; k <= j0; k++)
		{
			for (i = 1; i <= j0 - k; i++)
			{
				if (male[i] > male[i + 1])
				{
					male[0] = male[i];
					male[i] = male[i + 1];
					male[i + 1] = male[0];
				}
			}
		}
		for (k = 1; k <= k0; k++)
		{
			for (j = 1; j <= k0 - k; j++)
			{
				if (female[j] < female[j + 1])
				{
					female[0] = female[j];
					female[j] = female[j + 1];
					female[j + 1] = female[0];
				}
			}
		}
		for (i = 1; i <= j0; i++)
		{
			System.out.printf("%.2f", male[i]);
			System.out.printf("%.2f", " ");
		}
		for (j = 1; j < k0; j++)
		{
			System.out.printf("%.2f", female[j]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[j]);

	return 0;
	}
}

