package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int i;
		int j;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 1;j <= (n / 2);j++)
		{
				m = a[j];
				a[j] = a[n - j + 1];
				a[n - j + 1] = m;

		}
		for (i = 1;i < n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n]);
		return 0;
	}




}

