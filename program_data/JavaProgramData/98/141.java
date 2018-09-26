package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= n ; i++)
		{
			String s = new String(new char[41]);
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (i == 1)
			{
				System.out.print(s);
				count = s.length();
			}
			else
			{
				if (count + s.length() + 1 <= 80)
				{
					System.out.print(' ');
					System.out.print(s);
					count += s.length() + 1;
				}
				else
				{
					System.out.print("\n");
					System.out.print(s);
					count = s.length();
				}
			}
		}

		return 0;
	}

}

