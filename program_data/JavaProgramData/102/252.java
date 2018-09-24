package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] sex = new char[41][7];
		char[] flag = {'m', 'a', 'l', 'e', '\0', '\0', '\0'};
		double[] maleheight = new double[40];
		double[] femaleheight = new double[40];
		double t;
		int n;
		int i;
		int j;
		int m = 1;
		int f = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (strcmp(sex[i], flag) == 0)
			{
				maleheight[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				m++;
			}
			else
			{
				femaleheight[f] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				f++;
			}
		}
		m--;
		f--;
		for (i = 1; i < m; i++)
		{
			for (j = i + 1; j <= m; j++)
			{
				if (maleheight[i] > maleheight[j])
				{
					t = maleheight[i];
					maleheight[i] = maleheight[j];
					maleheight[j] = t;
				}
			}
		}
		for (i = 1; i < f; i++)
		{
			for (j = i + 1; j <= f; j++)
			{
				if (femaleheight[i] < femaleheight[j])
				{
					t = femaleheight[i];
					femaleheight[i] = femaleheight[j];
					femaleheight[j] = t;
				}
			}
		}
		for (i = 1; i <= m; i++)
		{
			System.out.printf("%.2f", maleheight[i]);
			System.out.printf("%.2f", " ");
		}
		for (i = 1; i <= f; i++)
		{
			System.out.printf("%.2f", femaleheight[i]);
			if (i != f)
			{
				System.out.printf("%.2f", " ");
			}
			else
			{
				System.out.printf("%.2f", "\n");
			}
		}
		return 0;
	}
}

