package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			int m;
			int[] input = new int[100];
			int total = 0;
			int sum = 60;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			input[0] = 0;
			for (int i = 1; i <= m; i++)
			{
				input[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (total + input[i] - input[i - 1] < 60 && input[i] < 60)
				{
					total += input[i] - input[i - 1] + 3;
					sum -= 3;
					if (total == 61)
					{
						sum += 1;
					}
					if (total == 62)
					{
						sum += 2;
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

