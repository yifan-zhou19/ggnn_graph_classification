package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] b = new int[101];
		int i;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[20001];

		for (i = 1;i <= n;i++)
		{
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 b[a[i]] = b[a[i]] + 1;
		}
		System.out.print(a[1]);
		b[a[1]] = 0;
		for (i = 2;i <= n;i++)
		{
						 if (b[a[i]] != 0)
						 {
						 System.out.print(" ");
						 System.out.print(a[i]);
						 }
						 b[a[i]] = 0;
		}
		return 0;
	}
}

