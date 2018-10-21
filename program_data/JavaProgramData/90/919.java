package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (n == 1 || m == 0)
		{
			return 1;
		}
	 else if (m < 0)
	 {
		 return 0;
	 }
	 else
	 {
		 return (f(m, n - 1) + f(m - n, n));
	 }


	}
	public static int Main()
	{
	int x;
	int i;
	int m;
	int n;
	int[] a = new int[100];
	x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= x;i++)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i] = f(m, n);
	}
	for (i = 1;i <= x;i++)
	{
		System.out.print(a[i]);
		System.out.print("\n");
	}



	 return 0;
	}
}

