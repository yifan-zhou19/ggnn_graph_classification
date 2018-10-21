package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String ans = new String(new char[100]);
		String temp = new String(new char[100]);
		int i;
		int j;
		int templ;
		int tempans;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		templ = 0;
		tempans = 0;
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ' ')
			{
				temp = tangible.StringFunctions.changeCharacter(temp, templ, '\0');
				if (strcmp(temp, a) == 0)
				{
					for (j = 0;j < b.length();j++)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, tempans, b.charAt(j));
						tempans++;
					}
				}
				else
				{
					for (j = 0;j < templ;j++)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, tempans, temp.charAt(j));
						tempans++;
					}
				}
				ans = tangible.StringFunctions.changeCharacter(ans, tempans, ' ');
				tempans++;
				templ = 0;
				continue;
			}
			temp = tangible.StringFunctions.changeCharacter(temp, templ, s.charAt(i));
			templ++;
		}
			temp = tangible.StringFunctions.changeCharacter(temp, templ, '\0');
				if (strcmp(temp, a) == 0)
				{
					for (j = 0;j < b.length();j++)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, tempans, b.charAt(j));
						tempans++;
					}
				}
				else
				{
					for (j = 0;j < templ;j++)
					{
						ans = tangible.StringFunctions.changeCharacter(ans, tempans, temp.charAt(j));
						tempans++;
					}
				}
			ans = tangible.StringFunctions.changeCharacter(ans, tempans, '\0');
		System.out.printf("%s", ans);
		return 0;
	}
}

