package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			String str = new String(new char[32]);
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			int i;
			int l = str.length();
			if ('0' <= str.charAt(0) && str.charAt(0) <= '9')
			{
				System.out.print("no\n");
				continue;
			}
			for (i = 0; i < l; ++i)
			{
				if ('0' <= str.charAt(i) && str.charAt(i) <= '9')
				{
					continue;
				}
				if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				{
					continue;
				}
				if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				{
					continue;
				}
				if (str.charAt(i) == '_')
				{
					continue;
				}
				break;
			}
			if (i == l)
			{
				System.out.print("yes\n");
			}
			else
			{
				System.out.print("no\n");
			}
		}
	}
}

