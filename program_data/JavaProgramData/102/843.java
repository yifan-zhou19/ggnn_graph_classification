package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double[] a = new double[40];
		double[] c = new double[40];
		double k;
		double temp;
		String b = new String(new char[40]);
		int len1 = 0;
		int len2 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		//cout<<n<<"m"<<endl;
		for (int i = 0;i < n;i++)
		{
			b = ConsoleInput.readToWhiteSpace(true).charAt(0);
			k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (b.charAt(0) == 'f')
			{
				a[len1++] = k;
			}
			else
			{
				c[len2++] = k;
			}
		}
		for (int i = 0;i < len1 - 1;i++)
		{
			for (int j = 0;j < len1 - 1 - i;j++)
			{
					if (a[j] < a[j + 1])
					{
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}
			}
		}
		for (int i = 0;i < len2 - 1;i++)
		{
					for (int j = 0;j < len2 - 1 - i;j++)
					{
						if (c[j] > c[j + 1])
						{
							temp = c[j];
							c[j] = c[j + 1];
							c[j + 1] = temp;
						}
					}
		}

		for (int i = 0;i < len2;i++)
		{
			System.out.printf("%.2f", c[i]);
			System.out.printf("%.2f", " ");
		}
		for (int i = 0;i < len1;i++)
		{
				if (i == 0)
				{
				System.out.printf("%.2f", a[i]);
				}
			else
			{
				System.out.printf("%.2f", " ");
				System.out.printf("%.2f", a[i]);
			}
		}
		return 0;
	}

}

