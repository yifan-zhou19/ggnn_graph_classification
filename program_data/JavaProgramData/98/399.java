package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n;
		int num = 0;
		String word = new String(new char[41]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0; k < n; k++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (num == 0)
			{
				System.out.print(word);
				num += word.length();
				continue;
			}
			num += word.length() + 1;
			if (num <= 80)
			{
				System.out.print(' ');
				System.out.print(word);
			}
			else
			{
				System.out.print("\n");
				System.out.print(word);
				num = word.length();
			}
		}
		return 0;
	}
}

