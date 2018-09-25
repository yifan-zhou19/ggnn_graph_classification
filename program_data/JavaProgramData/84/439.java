package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int n;
		int i;
		int p = 0;
		int q = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > p)
			{
				q = p,p = a[i];
			}
			else if (a[i] > q)
			{
				q = a[i];
			}
		}
		System.out.print(p);
		System.out.print("\n");
		System.out.print(q);
		System.out.print("\n");
		return 0;
	}
}

