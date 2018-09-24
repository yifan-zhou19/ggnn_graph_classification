package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n - 1;i++) //????
		{
			System.out.print(a[n - 1 - i]);
			System.out.print(' ');
		}
		System.out.print(a[0]);
		return 0;
	}

}

