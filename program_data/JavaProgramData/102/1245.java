package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int w;
		int j;
		double height;
		double temp;
		double[] man = new double[50];
		double[] woman = new double[50];
		String xb = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 0;
		w = 0;
		for (i = 1; i <= n; i++)
		{
			xb = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (xb.charAt(0) == 'm')
			{
				m++;
				man[m] = height;
			}
			else
			{
				w++;
				woman[w] = height;
			}
		}
		for (i = 1; i <= m - 1; i++)
		{
			for (j = 1; j <= m - i; j++)
			{
				if (man[j] > man[j + 1])
				{
					temp = man[j];
					man[j] = man[j + 1];
					man[j + 1] = temp;
				}
			}
		}
		for (i = 1; i <= w - 1; i++)
		{
			for (j = 1; j <= w - i; j++)
			{
				if (woman[j] < woman[j + 1])
				{
					temp = woman[j];
					woman[j] = woman[j + 1];
					woman[j + 1] = temp;
				}
			}
		}
		System.out.printf("%.2f", man[1]);
		for (i = 2; i <= m; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", man[i]);
		}
		for (i = 1; i <= w; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", woman[i]);
		}
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

