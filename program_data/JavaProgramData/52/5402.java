package <missing>;

public class GlobalMembers
{
	//????

	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int m;
		int b;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;++i)
	{
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[(i + m) % n] = b; //??
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

