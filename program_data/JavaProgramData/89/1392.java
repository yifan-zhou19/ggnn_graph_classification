package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int flag = 0;
		int[] a = new int[10000];
		for (i = 0;i < 10000;i++)
		{
			a[i] = 0;
		}
		int x;
		int y;
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (x == 0 && y == 0)
			{
				break;
			}
			a[y]++;
		}
		for (i = 0;i < 10000;i++)
		{
			if (a[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

