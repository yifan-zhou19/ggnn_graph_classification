package <missing>;

public class GlobalMembers
{
	public static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = w;
		for (int i = 0;i < 12;i++)
		{
			int temp = (sum + 12) % 7;
			if (temp == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
			sum += month[i];
		}
		return 0;
	}
}

