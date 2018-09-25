package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int max = 0;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char maxx = 0;
		String zong = new String(new char[20]);
		while (scanf("%s%s", str, substr) != EOF)
		{
			max = 0;
			maxx = 0;
			j = 0;
			for (i = 0; i <= str.length() - 1; i++)
			{
				if (str.charAt(i) > maxx)
				{
					max = i;
					maxx = str.charAt(i);
				}
			}
			for (i = 0; i <= max; i++)
			{
				zong = tangible.StringFunctions.changeCharacter(zong, j++, str.charAt(i));
			}
			for (i = 0; i <= 2; i++)
			{
				zong = tangible.StringFunctions.changeCharacter(zong, j++, substr.charAt(i));
			}
			for (i = max + 1; i <= str.length() - 1; i++)
			{
				zong = tangible.StringFunctions.changeCharacter(zong, j++, str.charAt(i));
			}
			zong = tangible.StringFunctions.changeCharacter(zong, j, '\0');
			System.out.printf("%s\n", zong);
		}
	}

}

