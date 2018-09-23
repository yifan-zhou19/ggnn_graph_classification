package <missing>;

public class GlobalMembers
{
	public static int findRight(String s, int pos, int l)
	{
		int t;
		if (s[pos].equals('\0'))
		{
			return -1;
		}
		if (s[pos].equals('('))
		{
			t = findRight(s, pos + 1, l + 1);
			if (t == -1)
			{
				s[pos] = '$';
				return -1;
			}
			else
			{
				s[pos] = ' ';
				return findRight(s, t + 1, l);
			}
		}
		else if (s[pos].equals(')'))
		{
			if (l == 0)
			{
				s[pos] = '?';
				findRight(s, pos + 1, l);
			}
			else
			{
				s[pos] = ' ';
				return pos;
			}
		}
		else
		{
			s[pos] = ' ';
			return findRight(s, pos + 1, l);
		}
	}
	public static int Main()
	{
		String s = new String(new char[1000]);
		for ((s; = ConsoleInput.readToWhiteSpace(true)).length() > 0)
		{
			System.out.print(s);
			System.out.print('\n');
			findRight(s, 0, 0);
			System.out.print(s);
			System.out.print('\n');
		}
	}

}

