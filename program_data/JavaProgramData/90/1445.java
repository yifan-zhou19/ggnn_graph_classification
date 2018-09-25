package <missing>;

public class GlobalMembers
{
	public static int kk(int m,int n)
	{
		if (m == 0)
		{
		return 1;
		}
		else
		{
		if (n == 1)
		{
		return 1;
		}
		else
		{
	   if (m < n)
	   {
	   return kk(m, m);
	   }
	   if (m >= n)
	   {
	   return kk(m, n - 1) + kk(m - n, n);
	   }
		}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] aa = new int[t + 1];
		for (i = 1;i <= t;i++)
		{
		 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 aa[i] = kk(m, n);
		}
		for (i = 1;i <= t;i++)
		{
		System.out.print(aa[i]);
		System.out.print("\n");
		}

		return 0;
	}



}

