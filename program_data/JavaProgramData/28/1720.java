package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[6000]);
		String a = new String(new char[50]);
		s = new Scanner(System.in).nextLine();
		int ls = s.length();
		int la;
		int i;
		int j = 0;
		int first = 1;
		for (i = 0;i < ls + 1;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				a = tangible.StringFunctions.changeCharacter(a, j, s.charAt(i));
				j++;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				j = 0;
				la = a.length();
				if (first == 1 && la != 0)
				{
				System.out.printf("%d",la);
				first = 0;
				}
				else if (la != 0)
				{
				System.out.printf(",%d",la);
				}
			}
		}

		return 0;
	}
}

