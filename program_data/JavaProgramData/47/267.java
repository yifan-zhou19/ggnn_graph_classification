package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = a;
		for (i = n - 1;i >= 0;i--)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (p = a;p < a + n - 1;p++)
		{
		System.out.print(p);
		System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.in.read();
		System.in.read();
		return 0;
	}


}

