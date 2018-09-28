package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//int isalpha(int ch);
		String a = new String(new char[100000]);
		String b = new String(new char[100000]);
		int i = 0;
		int l;
		int c = 1;
		int[] m = new int[100000];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		m[0] = 1;
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (i = 1;i < l;i++)
		{
			//scanf ("%c",(a[i]));
			m[i] = Character.isLetter(a.charAt(i));
			if ((m[i] != 0) || ((a.charAt(i) == ' ') && (m[i - 1] != 0)))
			{
				b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(i));
				c++;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, c, '\0');
		System.out.printf("%s",b);
		return 0;
	}
}

