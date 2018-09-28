package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int i;
		int[] n = new int[6];
		int[] rest = new int[7];
		int[] price = {100, 50, 20, 10, 5, 1};
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		rest[0] = sum;
		for (i = 0;i < 6;i++)
		{
			n[i] = rest[i] / price[i];
			rest[i + 1] = rest[i] % price[i];
			System.out.print(n[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

