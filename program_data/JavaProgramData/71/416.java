package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int i;
		int[] t = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] q = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] y = new int[1000];
		int w;
		int k;
		int z;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 if (b[i] > c[i])
						 {
									  w = b[i];
									  b[i] = c[i];
									  c[i] = w;
						 }
						 y[i] = 0;
		}
		for (i = 1;i <= n;i++)
		{
		if (b[i] == c[i])
		{
			y[i] = 0;
		}
		else
		{
			if ((a[i] % 4 == 0 && a[i] % 100 != 0) || (a[i] % 400 == 0))
			{
						 for (k = b[i];k <= c[i] - 1;k++)
						 {
												y[i] = y[i] + t[k];
						 }
			}
		 else
		 {
			  for (k = b[i];k <= c[i] - 1;k++)
			  {
												y[i] = y[i] + q[k];
			  }
		 }
		}
		}
		for (i = 1;i <= n - 1;i++)
		{
						 if (y[i] % 7 == 0)
						 {
							 System.out.print("YES");
							 System.out.print("\n");
						 }
						 else
						 {
							 System.out.print("NO");
							 System.out.print("\n");
						 }
		}
		if (y[n] % 7 == 0)
		{
						  System.out.print("YES");
						  System.out.print("\n");
		}
		else
		{
			System.out.print("NO");
			System.out.print("\n");
		}

		z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

