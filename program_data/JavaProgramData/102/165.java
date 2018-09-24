package <missing>;

public class GlobalMembers
{
	public static int max(double[] n, int m)
	{
		double max_num = n[0];
		int maxn = 0;
		for (int i = 1;i < m;i++)
		{
			if (n[i] > max_num)
			{
				max_num = n[i];
				maxn = i;
			}
		}
		return maxn;
	}
	public static int min(double[] n, int m)
	{
		double max_num = n[0];
		int maxn = 0;
		for (int i = 1;i < m;i++)
		{
			if (n[i] < max_num)
			{
				max_num = n[i];
				maxn = i;
			}
		}
		return maxn;
	}
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int maxn;
		String s = new String(new char[10]);
		double[] mt = new double[40];
		double[] ft = new double[40];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			t = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (strcmp(s,"male") == 0)
			{
				mt[j] = t;
				j++;
			}
			else if (strcmp(s,"female") == 0)
			{
				ft[k] = t;
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			maxn = max(mt, j - i);
			double temp = mt[j - i - 1];
			mt[j - i - 1] = mt[maxn];
			mt[maxn] = temp;
		}
		for (i = 0;i < k;i++)
		{
			maxn = min(ft, k - i);
			double temp = ft[k - i - 1];
			ft[k - i - 1] = ft[maxn];
			ft[maxn] = temp;
		}

		for (i = 0;i < j;i++)
		{

			System.out.printf("%0.2f ",mt[i]);
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%0.2f ",ft[i]);
		}
		System.out.printf("%0.2f",ft[k - 1]);
		return 0;

	}
}

