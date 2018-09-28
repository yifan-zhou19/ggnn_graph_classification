package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[101]);
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int length = input.length();
		int[] result = new int[101];
		int count = 0;
		int yu = 0;
		while (count < length)
		{
			yu = yu * 10 + input.charAt(count) - '0';
			result[count] = yu / 13;
			yu %= 13;
			count++;
		}
		int head = 0;
		for (int i = 0;i < count;i++)
		{
			if (head == 0 && result[i] != 0)
			{
				head = 1;
			}
			if (head == 1)
			{
				System.out.print(result[i]);
			}
		}
		if (head == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		System.out.print(yu);
		System.out.print("\n");

		return 0;
	}
}

