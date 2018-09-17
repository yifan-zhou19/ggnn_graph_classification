package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int f;
		int i;
		int j;
		m = f = 0;
		char[][] sex = new char[50][10];
		double[] hm = new double[40];
		double[] hf = new double[40];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sex[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (sex[i][0] == 'm')
			{
				hm[m] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				m++;
			}
			else
			{
				hf[f] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				f++;
			}
		}
		for (i = 0; i <= m - 1; i++)
		{
		for (j = 0; j <= m - i - 2; j++)
		{
			if (hm[j] < hm [j + 1])
			{
				t = hm[j + 1];
				hm[j + 1] = hm[j];
				hm[j] = t;
			}
		}
		}
		for (i = 0; i <= f - 1; i++)
		{
		for (j = 0; j <= f - i - 2; j++)
		{
			if (hf[j] < hf[j + 1])
			{
				t = hf[j + 1];
				hf[j + 1] = hf[j];
				hf[j] = t;
			}
		}
		}
		for (int k = m - 1; k >= 0; k--)
		{
			System.out.printf("%.2f", hm[k]);
			System.out.printf("%.2f", " ");
		}
		for (int l = 0; l < f - 1; l++)
		{
			System.out.printf("%.2f", hf[l]);
			System.out.printf("%.2f", " ");
		}
		System.out.printf("%.2f", hf[f - 1]);
		System.out.printf("%.2f", "\n");

		return 0;
	}

}

