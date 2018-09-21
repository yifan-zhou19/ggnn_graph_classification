package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[105]);
	public static void change(int a,int b)
	{
		char m;
		int i;
		for (i = a;i <= (a + b) / 2;i++)
		{
			m = s.charAt(i);
			s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(a + b - i));
			s = tangible.StringFunctions.changeCharacter(s, a + b - i, m);
		}
	}
	public static void Main()
	{
		int i;
		int len;
		int a = 0;
		int b;
		s = new Scanner(System.in).nextLine();
		len = s.length();
		for (i = 0;i < len;i++)
		{
			if (s.charAt(i) == ' ')
			{
				b = i - 1;
				change(a, b);
				a = b + 2;
			}
		}
		change(a, len - 1);
		change(0, len - 1);
		System.out.println(s);
	}

}

