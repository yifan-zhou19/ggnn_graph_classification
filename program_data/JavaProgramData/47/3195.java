package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[105];
		int i = 0;
		int b;
		while (i < n)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			i++;
		}
		int c = n - 1;
		while (c >= 1 && c <= (n - 1))
		{
			System.out.print(a[c]);
			System.out.print(" ");
			c--;
		}
		System.out.print(a[0]);
		return 0;
	}
}

