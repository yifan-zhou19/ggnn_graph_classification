package <missing>;

public class GlobalMembers
{
	// ??????.cpp : Defines the entry point for the console application.
	//

	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int i;
		int sa = 0;
		int m = 0;
		int j;
		int[] s = new int[1000];
		double max = 0;
		double[] cha = new double[1000];
		double t;
		double sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sa += a[i];
		}
		sum = (double)sa / (double)n;
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs((double)a[i] - sum);
			if (Math.abs((double)a[i] - sum) >= max)
			{
				max = Math.abs((double)a[i] - sum);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				s[m] = a[i];
				m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = 0;j < m - 1 - i;j++)
			{
				if (s[j] > s[j + 1])
				{
					t = s[j];
					s[j] = s[j + 1];
					s[j + 1] = t;
				}
			}
		}
			System.out.print(s[0]);
			for (i = 1;i < m;i++)
			{
				System.out.print(",");
				System.out.print(s[i]);
			}
			return 0;
	}





}

