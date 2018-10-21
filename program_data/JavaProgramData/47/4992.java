package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0;j < n / 2;j++)
		{
			temp = a[j];
			a[j] = a[n - 1 - j];
			a[n - 1 - j] = temp;
		}
		for (int i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}
}

