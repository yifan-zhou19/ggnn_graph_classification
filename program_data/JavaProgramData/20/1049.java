package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[10]);
		String substr = new String(new char[4]);
		String str1 = new String(new char[10]);
		char t;
		int len;
		int i;
		int max;
		while (scanf("%s%s",str,substr) != EOF)
		{
			len = str.length();
			str1 = str;
			max = 0;
			for (i = 1;i < len;i++)
			{
				if (str.charAt(i) > str.charAt(0))
				{
					max = i;
					t = str.charAt(i);
					str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(0));
					str = tangible.StringFunctions.changeCharacter(str, 0, t);
				}
			}
				for (i = 0;i <= max;i++)
				{
					System.out.printf("%c",str1.charAt(i));
				}
				for (i = 0;i < 3;i++)
				{
					System.out.printf("%c",substr.charAt(i));
				}
				for (i = max + 1;i < len;i++)
				{
					System.out.printf("%c",str1.charAt(i));
				}
				System.out.print("\n");
		}
		return 0;
	}
}

