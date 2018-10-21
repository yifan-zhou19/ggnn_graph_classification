package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
			int n;
			int m = 1;
			int s = 0;
			int g = 1;
			int u = 0;
			int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (m = 1;m <= n;m = m + 1)
		{
			g = m % 10;
		 s = (m - g) / 10;
		if (s == 7 || g == 7 || m % 7 == 0)
		{
			  k = m * 0;
		}
		 else
		 {
			 k = m * m;
		 }
	u = u + k;
		}
	System.out.print(u);
		return 0;
		}
}

