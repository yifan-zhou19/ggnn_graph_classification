package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{

			if (i == n)
			{
				System.out.print(a[1]);
			}
			else
			{
				System.out.print(a[n - i + 1]);
				System.out.print(' ');
			}
		}
		return 0;
	}
}

