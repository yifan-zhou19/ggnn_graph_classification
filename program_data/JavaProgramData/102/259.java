package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[40][8];
		double height;
		double[] female = new double[40];
		double[] male = new double[40];
		int n;
		double temp;
		int j;
		int k;
		int femalecount = 0;
		int malecount = 0;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			 a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			 height = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			 if (a[i][0] == 'f')
			 {
				 female[femalecount] = height;
				 femalecount++;
			 }
			 else
			 {
				 male[malecount] = height;
				 malecount++;
			 }
		}
		for (j = 0; j < malecount; j++)
		{
			for (k = 0; k < malecount - j - 1; k++)
			{
				if (male[k] > male[k + 1])
				{
					temp = male[k + 1];
					male[k + 1] = male[k];
					male[k] = temp;
				}
			}
		}
		for (j = 0; j < femalecount; j++)
		{
			for (k = 0; k < femalecount - j - 1; k++)
			{
				if (female[k] < female[k + 1])
				{
					temp = female[k + 1];
					female[k + 1] = female[k];
					female[k] = temp;
				}
			}
		}
		for (j = 0; j < malecount; j++)
		{
			System.out.printf("%.2f", male[j]);
			System.out.printf("%.2f", " ");
		}
		for (j = 0; j < femalecount - 1; j++)
		{
			System.out.printf("%.2f", female[j]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", female[femalecount - 1]);
		return 0;
	}
}

