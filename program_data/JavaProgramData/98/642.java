package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char v;
		int number = 0;
		int c;
		int m = 1;
		int an_number = 0;
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int max = 80;
		while (m != 0)
		{
			while (number <= max)
			{
				a = ConsoleInput.readToWhiteSpace(true).charAt(0);
				an_number += 1;
				if (number == 0)
				{
					System.out.print(a);
					number = number + a.length();
				}
				else if (number + a.length() + 1 <= max)
				{
					System.out.print(' ');
					System.out.print(a);
					number = number + a.length() + 1;
				}
				else
				{
					break;
				}
				if (an_number == c)
				{
					m = 0;
					break;
				}
			}
			if (an_number != c)
			{
				System.out.print("\n");
				System.out.print(a);
				number = a.length();
			}
		}
		return 0;
	}
}

