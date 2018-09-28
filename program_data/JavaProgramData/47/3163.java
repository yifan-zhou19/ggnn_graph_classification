package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int t;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		if (n / 2 == 1)
		{
			for (i = 0;i < (n - 1) / 2;i++)
			{
					a[n - 1 - i] = t;
					a[n - 1 - i] = a[i];
					a[i] = t;
			}
		}
		else
		{
			for (i = 0;i <= (n - 1) / 2;i++)
			{
				t = a[i];
				a[i] = a[n - 1 - i];
				a[n - 1 - i] = t;
			}

		}
		for (i = 0;i <= n - 2;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
			System.out.print(a[n - 1]);
	return 0;
	}




}

