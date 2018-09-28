package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000000];
	public static int Main()
	{
		int n;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (true)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0 && y == 0)
			{
				break;
			}
			a[x] = -1;
			if (a[y] >= 0)
			{
				a[y]++;
			}
		}
		int flag = false;
		for (int i = 0;i < n;i++)
		{
			if (a[i] == n - 1)
			{
			System.out.print(i);
			System.out.print("\n");
			flag = true;
			break;
			}
		}
		if (flag == false)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

