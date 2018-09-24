package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		for (i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int k;
		int p = 0;
		int j = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			if (a[i] != k)
			{
				System.out.print(a[i]);
				p = i;
				break;
			}
		}
		for (j = p + 1; j <= n - 1; j++)
		{
			if (a[j] != k)
			{
				System.out.print(" ");
				System.out.print(a[j]);
			}
		}
		System.out.print("\n");

		return 0;
	}

}

