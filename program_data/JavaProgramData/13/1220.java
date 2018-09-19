package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int[] count = new int[91];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(x);
		count[x - 10]++;
		for (int i = 1; i <= n - 1; i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count[x - 10] == 0)
			{
				System.out.print(" ");
				System.out.print(x);
			}
			count[x - 10]++;
		}
		return 0;
	}

}

