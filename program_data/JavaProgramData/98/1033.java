package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int number;
		char[][] input =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int[] lenth = new int[500];
		int lenth0 = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			input[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			lenth[i] = String.valueOf(input[i]).length();
		}
		i = 0, number = 0;
		while (true)
		{
			lenth0 += lenth[number] + 1;
			if (lenth0 <= 81)
			{
				number++;
			}
			if (lenth0 > 81 || number == n)
			{
				for (j = i; j < number - 1; j++)
				{
					System.out.print(input[j]);
					System.out.print(" ");
				}
				System.out.print(input[number - 1]);
				System.out.print("\n");
				i = number;
				lenth0 = 0;
			}
			if (i == n)
			{
				break;
			}
		}
		return 0;
	}
}

