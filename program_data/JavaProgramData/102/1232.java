package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] a = new double[41];
		double[] b = new double[41];
		String str = new String(new char[7]);
		int p;
		int q;
		double temp;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = 0;
		q = 0;
		for (int i = 1; i <= n; i++)
		{
			System.in.read();
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (str.charAt(0) == 'm')
			{
				p++;
				a[p] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				q++;
				b[q] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= p - 1; i++)
		{
			for (int j = 1; j <= p - i; j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i <= q - 1; i++)
		{
			for (int j = 1; j <= q - i; j++)
			{
				if (b[j] < b[j + 1])
				{
					temp = b[j];
					b[j] = b[j + 1];
					b[j + 1] = temp;
				}
			}
		}
		for (int i = 1; i <= p; i++)
		{
			System.out.printf("%.2f", a[i]);
			System.out.printf("%.2f", " ");
		}
		for (int i = 1; i <= q - 1; i++)
		{
			System.out.printf("%.2f", b[i]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", b[q]);
		return 0;
	}
}

