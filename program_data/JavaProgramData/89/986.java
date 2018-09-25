package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int[] b = new int[n];
		for (i = 0 ; i < n; i++)
		{
			a[i] = 0;
			b[i] = 0;
		}
		int x;
		int y;
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (x == 0 && y == 0)
			{
				break;
			}
			a[x]++;
			b[y]++;
		}
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] == 0 && b[i] == n - 1)
			{
				System.out.print(i);
				return 0;
			}
		}
		System.out.print("NOT FOUND");
		return 0;
	}

}

