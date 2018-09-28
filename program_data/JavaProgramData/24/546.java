package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String p = new String(new char[20]);
		String p1 = new String(new char[20]);
		String q = new String(new char[20]);
		String q1 = new String(new char[20]);
		s = new Scanner(System.in).nextLine();
		int i;
		int j;
		int len;
		int count = 0;
		int t = 0;
		int n = 0;
		int x = 1;
		int max = 0;
		int min = 0;
		int y = 0;
		s += " ";
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				x = 0;
			}
			if (x == 0)
			{
				x = 1;
				n++;
			}
		}
		for (j = 0;j < n;j++)
		{
			for (i = t;i < len;i++)
			{
				if (s.charAt(i) != ' ')
				{
					p = tangible.StringFunctions.changeCharacter(p, i - t, s.charAt(i));
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, '\0');
					p = tangible.StringFunctions.changeCharacter(p, i - t, '\0');
					q = p;
					t = i + 1;
					break;
				}
			}
			if (y == 0)
			{
				p1 = p;
				q1 = p1;
				y = 1;
			}
			if (p.length() > p1.length())
			{
				p1 = p;
			}
			if (q.length() < q1.length())
			{
				q1 = q;
			}
		}

		System.out.printf("%s\n%s",p1,q1);
		return 0;
	}











}

