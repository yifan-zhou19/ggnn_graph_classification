package <missing>;

public class GlobalMembers
{
	//????????
	//1000012915???
	public static int reverse(int num)
	{
		int i = 0;
		while (num != 0)
		{
			i = i * 10 + num % 10;
			num = num / 10;
		};
		return i;

	}

	public static int Main()
	{
		int Number;
		int i;
		int[] NUM = new int[7];

		for (i = 0;i < 6;i++)
		{
			Number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			NUM[i] = reverse(Number);
		}

		for (i = 0;i < 6;i++)
		{
			System.out.print(NUM[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

