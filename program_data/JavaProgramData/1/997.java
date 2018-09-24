package <missing>;

public class GlobalMembers
{
	public static int factors(int n,int min)
	{
		 int varieties = 0;
		 int i;
		 if (n == 1)
		 {
			 return 1;
		 }
		 else
		 {
				for (i = min;i <= n;i++)
				{
					if (n % i == 0)
					{
						varieties += factors(n / i, i);
					}
				}
		 }
			return varieties;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = factors(a[i], 2);
		}
		for (i = 0;i < n;i++)
		{
		System.out.print(b[i]);
		System.out.print("\n");
		}
		return 0;
	}

}

