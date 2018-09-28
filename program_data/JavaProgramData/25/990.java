package <missing>;

public class GlobalMembers
{
	//***************************************
	//??2?N??
	public static int Main()
	{
		int n;
		double[] a = new double[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[999] = 2;
		if (n == 0)
		{
			System.out.print(1);
		}
		else
		{
			for (int i = 0;i < n - 1;i++)
			{
				for (int j = 999;j >= 0;j--)
				{
					if (a[j] + a[j] < 10)
					{
						a[j] = a[j] * 2;
					}
					else
					{
						a[j] = a[j] * 2 - 10;
						a[j - 1] = 0.5 + a[j - 1];
					}
				}
			}
			int m = 0;
			for (int i = 0;i < 1000;i++)
			{
				if (a[i] != 0)
				{
					System.out.print(a[i]);
					m = i;
					break;
				}
			}
			for (int i = m + 1;i < 1000;i++)
			{
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

