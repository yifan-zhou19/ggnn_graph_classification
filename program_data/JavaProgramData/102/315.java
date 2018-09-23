package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		String sex = new String(new char[10]);
		double h;
		double[] maleH = new double[40];
		double[] femaleH = new double[40];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int numM = 0;
		int numF = 0;
		for (k = 0 ; k < n ; k++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
				maleH[numM] = h;
				numM++;
			}
			else if (sex.charAt(0) == 'f')
			{
				femaleH[numF] = h;
				numF++;
			}
		}
		double t = 0;
		for (i = 0 ; i < numF - 1 ; i++)
		{
			for (j = 0 ; j < numF - i - 1 ; j++)
			{
				if (femaleH[j] < femaleH[j + 1])
				{
					t = femaleH[j];
					femaleH[j] = femaleH[j + 1];
					femaleH[j + 1] = t;
				}
			}
		}
		for (i = 0 ; i < numM - 1 ; i++)
		{
			for (j = 0 ; j < numM - i - 1 ; j++)
			{
				if (maleH[j] > maleH[j + 1])
				{
					t = maleH[j];
					maleH[j] = maleH[j + 1];
					maleH[j + 1] = t;
				}
			}
		}

		for (i = 0 ; i < numM ; i++)
		{
			System.out.printf("%.2f", maleH[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 0 ; i < numF ; i++)
		{
			if (i == numF - 1)
			{
				System.out.printf("%.2f", femaleH[i]);
			}
			else
			{
				System.out.printf("%.2f", femaleH[i]);
				System.out.printf("%.2f", " ");
			}
		}
		return 0;
	}

}

