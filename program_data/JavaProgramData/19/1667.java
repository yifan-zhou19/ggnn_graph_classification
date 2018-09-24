package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String t = new String(new char[100]);
		int i;
		int j;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			j = 0;
			while (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				t = tangible.StringFunctions.changeCharacter(t, j++, s.charAt(i++));
			}
				t = tangible.StringFunctions.changeCharacter(t, j, '\0');
			if (strcmp(a,t) == 0)
			{
				System.out.printf("%s",b);

			}
			else
			{
				System.out.printf("%s",t);
			}
			 if (i == s.length())
			 {
				System.out.print("\0");
			 }
			else
			{
				System.out.print(" ");
			}
		}
			return 0;
	}
}

