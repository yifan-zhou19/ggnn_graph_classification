package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[256]);
		String sub = new String(new char[256]);
		String replace = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		sub = new Scanner(System.in).nextLine();
		replace = new Scanner(System.in).nextLine();

		int ls = s.length();
		int lsub = sub.length();
		String sr = new String(new char[256]);
		int i;
		int j;
		int same;
		for (i = 0;i < ls;i++)
		{
			for (j = 0;j < lsub;j++)
			{
				sr = tangible.StringFunctions.changeCharacter(sr, j, s.charAt(i + j));
			}
			sr = tangible.StringFunctions.changeCharacter(sr, j, '\0');
			same = strcmp(sr,sub);
			if (same == 0)
			{
				System.out.printf("%s",replace);
				i = i + lsub;
				System.out.printf("%s", s.charAt(i));
				break;
			}
			else
			{
				System.out.printf("%c",s.charAt(i));
			}
		}
		return 0;
	}
}

