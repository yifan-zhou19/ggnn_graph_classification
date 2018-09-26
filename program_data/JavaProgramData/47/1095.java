package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int[] a = new int[100];
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int j = 0;
		int b = n / 2;
		int t;
		for (j = 0;j <= b;j++)
		{
			t = a[j];
			a[j] = a[n - j];
			a[n - j] = t;
		}
		int x = 1;
		for (i = 0;i < n;i++)
		{
			if (x == 1)
			{
				System.out.print(a[0]);
				x = 0;
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}

		}
		return 0;
	}

}

