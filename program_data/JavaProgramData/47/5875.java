package <missing>;

public class GlobalMembers
{
	//????

	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = n - 1;i >= 0;--i)
	{
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[i] = b; //???
	}
	for (int i = 0;i < n - 1;++i)
	{
		System.out.print(a[i]);
		System.out.print(" ");
	}
			System.out.print(a[n - 1]);
		return 0;
	}
}

