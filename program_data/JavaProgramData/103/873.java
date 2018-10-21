package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1002]);
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		char mark = 0;
		int count = 0;
		for (int i = 0;i < s.length();i++)
		{
			char c = s.charAt(i);
			if (c >= 'a')
			{
				c -= 32;
			}
			if (c == mark)
			{
				count++;
			}
			else
			{
				if (mark != 0)
				{
					System.out.print("(");
					System.out.print(mark);
					System.out.print(",");
					System.out.print(count);
					System.out.print(")");
				}
				mark = c;
				count = 1;
			}
		}
		System.out.print("(");
		System.out.print(mark);
		System.out.print(",");
		System.out.print(count);
		System.out.print(")");
		return 0;
	}
}

