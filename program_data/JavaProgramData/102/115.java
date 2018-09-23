package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int m;
	public static int f;
	public static char[][] c = new char[41][10];
	public static double[] h = new double[41];
	public static double[] hm = new double[41];
	public static double[] hf = new double[41];

	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = 0;
		f = 0;
		for (i = 1;i <= n;i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (c[i][0] == 'm')
			{
				hm[m] = h[i];
				m++;
			}
			else
			{
				hf[f] = h[i];
				f++;
			}
		}
		sort(hm,hm + m);
		sort(hf,hf + f);
		System.out.printf("%.2f",hm[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf("%c%.2f",' ',hm[i]);
		}
		for (i = f - 1;i >= 0;i--)
		{
			System.out.printf("%c%.2f",' ',hf[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

