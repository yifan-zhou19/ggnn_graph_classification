package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i = 0;
		for (i = 2;i <= 20;i++)
		{
			a[i] = a[i - 1] + a[i - 2]; //?20?
		}
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] b = new int[100]; //????
		for (i = 0;i <= n - 1;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 1;i++)
		{
			System.out.print(a[b[i] - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

