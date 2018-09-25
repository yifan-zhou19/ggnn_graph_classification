package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int i;
		for (i = 0;i < 50000;i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int m;
		int p;
		for (i = 0;i < 50000;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0 && p == 0)
			{
				break;
			}
			if (m != p)
			{
			a[m] = 1;
			}
			b[p] = b[p] + 1;
		}
		for (i = 0;i < n;i++)
		{

			if (a[i] == 0 && b[i] >= n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				return 0;
			}

		}
		System.out.print("NOT FOUND");
		System.out.print("\n");
		return 0;
	}
}

