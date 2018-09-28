package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		a[1] = a[2] = 1;
		int i;
		for (i = 3;i <= 20;i++)
		{
		a[i] = a[i - 1] + a[i - 2];
		}
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[n];
		for (i = 1;i <= n;i++)
		{
		b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
		System.out.print(a[b[i]]);
		System.out.print("\n");
		}
	}

}

