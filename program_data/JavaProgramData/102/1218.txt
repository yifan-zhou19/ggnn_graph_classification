package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double x;
		double[] a = new double[40];
		double[] b = new double[40];
		int counta = 0;
		int countb = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
			String ch = new String(new char[10]);

			ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
			x = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));

			if (ch.charAt(0) == 'm')
			{
				a[counta] = x;
				counta++;
			}
			else
			{
				b[countb] = x;
				countb++;
			}
		}




		for (int i = 0; i < counta - 1; i++)
		{
		for (int j = 0; j < counta - 1 - i; j++)
		{
			if (a[j] > a[j + 1])
			{
				x = a[j];
				a[j] = a[j + 1];
				a[j + 1] = x;
			}
		}
		}

		for (int i = 0; i < countb - 1; i++)
		{
		for (int j = 0; j < countb - 1 - i; j++)
		{
			if (b[j] < b[j + 1])
			{
				x = b[j];
				b[j] = b[j + 1];
				b[j + 1] = x;
			}
		}
		}


		System.out.printf("%.2f", a[0]);

		for (int i = 1; i < counta ; i++)
		{
		System.out.printf("%.2f", " ");
		System.out.printf("%.2f", a[i]);
		}

		for (int i = 0; i < countb ; i++)
		{
		System.out.printf("%.2f", " ");
		System.out.printf("%.2f", b[i]);
		}


		return 0;
	}
}

