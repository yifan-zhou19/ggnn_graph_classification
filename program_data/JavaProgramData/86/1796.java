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
			int sum = 60;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			input[0] = 0;
			for (int i = 1; i <= m;i++)
			{
				input[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (input[i] + i * 3 <= 60 && input[i] < 60) //?i??????????????60
				{
					sum -= 3;
				}
				else if (input[i] + i * 3 <= 63)
				{
					sum = input[i];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

