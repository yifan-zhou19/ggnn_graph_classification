package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int[] b = new int[300];
		int n;
		int i;
		int x = 0;
		int y = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 1)
			{
				x++;
			}
			else if (a[i] == 1 && b[i] == 2)
			{
				x++;
			}
			else if (a[i] == 2 && b[i] == 0)
			{
				x++;
			}
			else if (a[i] != b[i])
			{
				y++;
			}
		}
		if (x > y)
		{
			System.out.print("A");
		}
		else if (x == y)
		{
			System.out.print("Tie");
		}
		else
		{
			System.out.print("B");
		}
		return 0;
	}
}

