package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] str = new char[41][7];
		double[] a = new double[41];
		for (i = 1; i <= n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double temp1 = 0;
		String temp2 = new String(new char[7]);
		for (i = 1; i < n; i++)
		{
			for (j = 1; j <= n - i; j++)
			{
				if (String.valueOf(str[j]).length() > 5 && String.valueOf(str[j + 1]).length() < 5)
				{
					temp2 = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp2;
					temp1 = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp1;
				}
			}
		}
			int m = 0;
			for (i = 1; i <= n; i++)
			{
				if (String.valueOf(str[i]).length() > 5)
				{
					break;
				}
			}
			m = i - 1;
			for (i = 1; i < m; i++)
			{
				for (j = 1; j <= m - i; j++)
				{

					if (a[j] > a[j + 1])
					{
						temp1 = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp1;
					}
				}
			}
				for (i = m + 1; i < n; i++)
				{
					for (j = m + 1; j <= (n - i + m); j++)
					{
						if (a[j] < a[j + 1])
						{
							temp1 = a[j];
							a[j] = a[j + 1];
							a[j + 1] = temp1;
						}
					}
				}
					System.out.printf("%.2f", a[1]);
					for (i = 2; i <= n; i++)
					{
						System.out.printf("%.2f", ' ');
						System.out.printf("%.2f", a[i]);
					}
					System.out.printf("%.2f", "\n");
					return 0;
	}




}

