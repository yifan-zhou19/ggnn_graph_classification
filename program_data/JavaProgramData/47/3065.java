package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int i = 0;
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < Math.floor(n * 0.5);i++)
		{
			temp = a[n - 1 - i];
			a[n - 1 - i] = a[i];
			a[i] = temp;
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.print(a[i]);
				System.out.print(' ');
			}
			else
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

