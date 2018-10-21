package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		String word = new String(new char[30]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		word = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(word);
		count = (int)word.length();
		n--;
		while (n-- != 0)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (count + word.length() < 80)
			{
				System.out.print(" ");
				System.out.print(word);
				count = count + (int)word.length() + 1;
				continue;
			}
			if (count + word.length() >= 80)
			{
				System.out.print("\n");
				System.out.print(word);
				count = (int)word.length();
			}
		}

		return 0;
	}
}

