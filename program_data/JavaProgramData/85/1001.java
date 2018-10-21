package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int count;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String s = new String(new char[25]);
		for (i = 0;i < n;i++)
		{
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z') || (s.charAt(0) == '_'))
			{
				count = 1;
			}
			else
			{
				count = 0;
			}
			for (j = 1;j < s.length();j++)
			{
				if ((s.charAt(j) >= '0' && s.charAt(j) <= '9') || (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') || (s.charAt(j) == '_'))
				{
					count += 1;
				}
			}
			if (count == s.length())
			{
				System.out.print("yes");
				System.out.print("\n");
			}
			else
			{
				System.out.print("no");
				System.out.print("\n");
			}
		}
		return 0;
	}
}

