package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;;i++)
		{
			int p;
			int q;
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p == 0 && q == 0)
			{
				break;
			}
			else
			{
				a[p] = 1;
				b[q] = b[q] + 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

