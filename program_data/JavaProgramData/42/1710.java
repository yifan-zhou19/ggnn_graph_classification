package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int x = 0;
		int[] a = new int[100000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != m)
			{
				x++;
				if (x == 1)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

