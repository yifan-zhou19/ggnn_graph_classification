package <missing>;

public class GlobalMembers
{
	public static void nixu(int[] a, int n)
	{
		for (int i = n - 1;i > 0;i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
		}
		nixu(a, n);
		return 0;
	}

}

