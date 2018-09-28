package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100000];
		int n;
		int m;
		int o = 0;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		double k;
		k = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n - o;i++)
		{
			if (a[i] == k)
			{
				m = i;
				for (int j = m;j < n - o - 1;j++)
				{
					a[j] = a[j + 1];
				}
				o++;
				i--;
			}
		}
			for (l = 0;l < n - o - 1;l++)
			{
				System.out.print(a[l]);
				System.out.print(" ");
			}
			System.out.print(a[l]);
					return 0;

	}

}

