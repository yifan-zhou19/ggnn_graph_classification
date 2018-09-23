package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[4];
		if (n == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (n / 10 == 0)
		{
			j = 0;
		}
		else if (n / 100 == 0)
		{
			j = 1;
		}
		else if (n / 1000 == 0)
		{
			j = 2;
		}
		else
		{
			j = 3;
		}
		for (i = j;i >= 0;i--)
		{
				a[i] = n / Math.pow(10,(double)i);
			 n = n - Math.pow(10,(double)i) * a[i];
		}
		for (k = 0;k <= j;k++)
		{
			System.out.print(a[k]);
		}
		return 0;
	}
}

