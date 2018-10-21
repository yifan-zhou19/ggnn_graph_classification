package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int i;
		int p;
		int q;
		int t;
		String r = new String(new char[2000]);
		String s = new String(new char[2001]);
		s = tangible.StringFunctions.changeCharacter(s, 0, ' ');
		s = tangible.StringFunctions.changeCharacter(s, 1, '\0');
		r = new Scanner(System.in).nextLine();
		s += r;
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
			{
				p = i + 1;
			}
			if (s.charAt(i) != ' ' && (s.charAt(i + 1) == ' ' || s.charAt(i + 1) == '\0'))
			{
				q = i;
				a = q - p + 1;
				System.out.printf("%d",a);
				break;
			}
		}
		for (i = i + 1;s.charAt(i) != '\0';i++)
		{
		   if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ')
		   {
			   p = i + 1;
		   }
			if (s.charAt(i) != ' ' && (s.charAt(i + 1) == ' ' || s.charAt(i + 1) == '\0'))
			{
				q = i;
				a = q - p + 1;
				System.out.printf(",%d",a);
			}
		}
		return 0;
	}

}

