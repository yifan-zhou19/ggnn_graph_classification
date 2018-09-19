package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		final String s = "";
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		int len;
		int i;
		int m = 0;
		int n = 0;
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) != ' ')
			{
				s.charAt(m)[n] = a.charAt(i);
				n++;
			}
			else
			{
				m++;
				n = 0;
			}
		}
		for (i = 0;i < m + 1;i++)
		{
			if (strcmp(s.charAt(i),b) == 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, c);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s ",s.charAt(i));
		}
		System.out.printf("%s\n",s.charAt(m));
	}
}

