package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[n - i - 1] = a[i];
		}
		for (int j = 0;j < n - 1;j++)
		{
			System.out.print(b[j]);
			System.out.print(" ");
		}
		System.out.print(b[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

