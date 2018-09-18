package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[4];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}

		if (n / 10 == 0)
		{
			i = 1;
		}
		else if (n / 100 == 0)
		{
			i = 2;
		}
		else if (n / 1000 == 0)
		{
			i = 3;
		}
		else if (n / 10000 == 0)
		{
			i = 4;
		}

		for (j = i;j >= 1;j--)
		{
				a[j - 1] = n / (Math.pow(10,(double)(j - 1)));
			n = n - Math.pow(10,(double)(j - 1)) * a[j - 1];
		}
		for (k = 0;k <= i - 1;k++)
		{
			System.out.print(a[k]);
		}
		return 0;
	}

}

