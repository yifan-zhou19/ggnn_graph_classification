package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] monthdays =
		{
			{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		int i;
		int sum = 0;
		int w;
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 11;i++)
		{
			sum += monthdays[0][i];
			monthdays[1][i] = sum + 12 + w;
			if (monthdays[1][i] == 5 || monthdays[1][i] % 7 == 5)
			{
				System.out.print(i + 1);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

