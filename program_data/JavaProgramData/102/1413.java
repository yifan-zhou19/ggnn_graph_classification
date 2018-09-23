package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????   **
	//*?????? 1300012713 **
	//*???2014.1.3  **
	//********************************
	public static int Main()
	{
		int i;
		int j;
		int n;
		int a0 = 0;
		int b0 = 0;
		double[] a = new double[40];
		double[] b = new double[40];
		String str = new String(new char[10]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(str,"male") == 0)
			{
				a0++;
				a[a0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				b0++;
				b[b0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 1; j <= a0;j++)
		{
			for (i = 1; i <= a0 - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					double a1 = a[i];
					a[i] = a[i + 1];
					a[i + 1] = a1;
				}
			}
		}
		for (j = 1; j <= b0;j++)
		{
			for (i = 1;i <= b0 - 1;i++)
			{
				if (b[i] < b[i + 1])
				{
					double b1 = b[i];
					b[i] = b[i + 1];
					b[i + 1] = b1;
				}
			}
		}
		for (i = 1;i <= a0;i++)
		{
			System.out.printf("%.2f ",a[i]);
		}
		for (i = 1;i <= b0 - 1;i++)
		{
			System.out.printf("%.2f ",b[i]);
		}
		System.out.printf("%.2f",b[b0]);
		return 0;
	}

}

