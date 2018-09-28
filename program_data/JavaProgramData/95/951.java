package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char comp = new char(char s1[], char s2[]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		System.out.printf("%c\n", comp(s1, s2));
	}
	public static char comp(String s1, String s2)
	{
		int i;
		for (i = 0; !s1[i].equals('\0') && !s2[i].equals('\0'); i++)
		{
			if (s1[i].compareTo('A') >= 0 && s1[i].compareTo('Z') <= 0)
			{
				s1[i] += 32;
			}
			if (s2[i].compareTo('A') >= 0 && s2[i].compareTo('Z') <= 0)
			{
				s2[i] += 32;
			}
			if (s1[i].equals(s2[i]))
			{
				continue;
			}
			if (s1[i].compareTo(s2[i]) < 0)
			{
				return '<';
			}
			else
			{
				return '>';
			}
		}
		if (s1.length() == s2.length())
		{
			return '=';
		}
		else if (s1.length() < s2.length())
		{
			return '<';
		}
		else
		{
			return '>';
		}
	}
}
