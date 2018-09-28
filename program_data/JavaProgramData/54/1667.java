package <missing>;

public class GlobalMembers
{
	//************************************************************************
	//?????????
	//???  ???
	//???  12-4
	//************************************************************************


	public static int n;
	public static int k;
	public static int[] a = new int[10000];


	public static int Main()
	{
		int t = 1;
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n - 1; i++)
		{
			t *= (n - 1);
		}

		for (a[n] = n + k ; (a[n] + k * (n - 1)) % t != 0; a[n] += n)
		{
			;
		}

		for (i = n - 1; i >= 1; i--)
		{
			a[i] = (a[i + 1] * n) / (n - 1) + k;
		}

		System.out.print(a[1]);


		return 0;
	}


}

