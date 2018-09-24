package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int[] b = new int[20];
		int i;
		int n;
		a[0] = 0,a[1] = 1,a[2] = 1;
		for (i = 0;i <= 20;i++)
		{
			a[i + 2] = a[i + 1] + a[i];
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.print(a[b[i]]);
			System.out.print("\n");
		}
		return 0;
	}


}

