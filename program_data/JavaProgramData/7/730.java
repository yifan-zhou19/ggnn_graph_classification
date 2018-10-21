package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String subs = new String(new char[256]);
		String rpl = new String(new char[256]);
		int i;
		int j;
		int len1 = 0;
		int len2 = 0;
		int c = 0;
		int m;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		subs = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rpl = ConsoleInput.readToWhiteSpace(true).charAt(0);
		len1 = subs.length();
		len2 = rpl.length();
		for (i = 0;i < 256 && str.charAt(i) != 0;i++)
		{
			if (str.charAt(i) == subs.charAt(0))
			{
				c = 0;
				for (j = 0;j < len1;j++)
				{
					if (str.charAt(i + j) != subs.charAt(j))
					{
						c = 1;
						break;
					}
					else
					{
						c = c + 1;
					}
				}
			}
			if (c == len1)
			{
				break;
			}
		}
		if (c == 0)
		{
			for (m = 0;m < 256 && str.charAt(m) != 0;m++)
			{
				System.out.print(str.charAt(m));
			}
		}
		if (c == len1)
		{
			for (m = 0;m < i;m++)
			{
				System.out.print(str.charAt(m));
			}
			for (m = i;m < i + len2;m++)
			{
				System.out.print(rpl.charAt(m - i));
			}
			for (m = i + len2;m < 256 && str.charAt(m) != 0;m++)
			{
				System.out.print(str.charAt(m));
			}
		}
		return 0;
	}




}

