package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[n - i + 1] = a[i];
		}
		for (j = 1;j < n;j++)
		{
			System.out.print(b[j]);
			System.out.print(" ");
		}
		System.out.print(b[j]);
		System.out.print("\n");
		return 0;
	}
}

