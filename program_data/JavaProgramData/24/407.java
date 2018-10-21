package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[1000]);
		String l = new String(new char[20]);
		String s = new String(new char[20]);
		String a = new String(new char[20]);
		int i;
		int j;
		int m;
		int max = 0;
		int min = 100;
		str = new Scanner(System.in).nextLine();
		m = str.length();
		for (i = 0;i < m;i++)
		{
			for (j = 0;((str.charAt(i) <= 'z') && (str.charAt(i) >= 'a')) || ((str.charAt(i) <= 'Z') && (str.charAt(i) >= 'A'));i++, j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, str.charAt(i));
			}
			a = tangible.StringFunctions.changeCharacter(a, j, '\0');
			if (a.length() > max)
			{
				l = a;
				max = a.length();
			}
			if (a.length() < min)
			{
				s = a;
				min = a.length();
			}
		}
		System.out.printf("%s\n%s\n",l,s);
	}
}

