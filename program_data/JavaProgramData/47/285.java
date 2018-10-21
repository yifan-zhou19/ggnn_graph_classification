package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50];
		int n;
		int i;
		int j;
		int med;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (j = 0;j < n / 2;j++)
		{
			med = a[j];
			a[j] = a[n - j - 1];
			a[n - j - 1] = med;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(' ');
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}



}

