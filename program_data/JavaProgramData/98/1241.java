package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String word = new String(new char[41]);
		String p = null;
		int count = 0;
		int flag_first_word = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			word = ConsoleInput.readToWhiteSpace(true).charAt(0);
			p = word;
			if (flag_first_word == 1)
			{
				System.out.print(p);
				count = p.length();
				flag_first_word = 0;
			}
			else
			{
				if (count + p.length() + 1 <= 80)
				{

					System.out.print(" ");
					System.out.print(p);
					count += p.length() + 1;
				}
				else
				{
					System.out.print("\n");
					System.out.print(p);
					count = p.length();
				}
			}
		}
		return 0;
	}
}

