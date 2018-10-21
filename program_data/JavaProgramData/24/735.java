package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		String c = new String(new char[30]);
		String maxw = new String(new char[30]);
		String minw = new String(new char[30]);
		int i;
		int m = 0;
		int max = 0;
		int min = 30;
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length() + 1;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, m, s.charAt(i));
			m++;
			if ((s.charAt(i) == ' ') || (s.charAt(i) == '\0'))
			{
				c = tangible.StringFunctions.changeCharacter(c, m - 1, '\0');
				if ((m - 1) > max)
				{
					max = m - 1;
					maxw = c;
				}
				if ((m - 1) < min)
				{
					min = m - 1;
					minw = c;
				}
				m = 0;
			}
		}
		System.out.printf("%s\n%s",maxw,minw);
	}
}

