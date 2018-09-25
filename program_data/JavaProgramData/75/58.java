package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int c = 0;
		int max = 0;
		char r = 0;
		int[] a = new int[1005];
		while (true)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = x; i <= 1001; i++)
			{
				a[i]++;
			}
			c++;
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		while (true)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = y; i <= 1001; i++)
			{
				a[i]--;
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (int i = 1; i <= 1004; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.print(c);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		return 0;
	}

}

