package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] result = new int[6];
		int[] money = {100, 50, 20, 10, 5, 1};
		for (int k = 0;k != 6;k++)
		{
			result[k] = n / money[k];
			n -= n / money[k] * money[k];
		}
		for (int k = 0;k != 6;k++)
		{
			System.out.print(result[k]);
			System.out.print("\n");
		}
		return 0;
	}
}

