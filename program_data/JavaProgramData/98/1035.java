package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0;i < n;i++)
		{
			String letter = new String(new char[50]);
			letter = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (count + letter.length() + 1 > 80)
			{
					count = 0;
					System.out.print("\n");
			}
			if (count == 0)
			{
				System.out.print(letter);
				count = letter.length();
			}
			else
			{
				System.out.print(' ');
				System.out.print(letter);
				count += 1 + letter.length();
			}
		}
		return 0;
	}
}

