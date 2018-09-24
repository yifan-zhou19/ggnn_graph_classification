package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int days = 13;
		for (int i = 1; i <= 12; i++)
		{
			days += m[i - 1];
			if ((days - 1 + w) % 7 == 5)
			{
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

