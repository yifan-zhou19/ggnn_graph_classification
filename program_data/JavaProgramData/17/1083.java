package <missing>;

public class GlobalMembers
{
	public static void f(String s)
	{
		int i;
		int j;
		int k;
		int l;
		int n = s.length();
		for (i = 0;i < n;i++)
		{
			 if (!s[i].equals('(') && !s[i].equals(')'))
			 {
				s[i] = ' ';
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (s[i].equals(')'))
			{
				l = 0;
				for (j = i - 1;j >= 0;j--)
				{
					if (s[j].equals('('))
					{
						s[j] = ' ';
						s[i] = ' ';
						l = 1;
						break;
					}
				}
				if (l == 0)
				{
					s[i] = '?';
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (!s[i].equals(' ') && !s[i].equals('?'))
			{
				s[i] = '$';
			}
		}
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			s = new Scanner(System.in).nextLine();
			System.out.println(s);
			f(s);
			System.out.println(s);
		}
		return 0;
	}
}

