package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = 0;
		}
		int i;
		int j;
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (i != 0 || j != 0)
		{
			  a[j]++;
			  i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

