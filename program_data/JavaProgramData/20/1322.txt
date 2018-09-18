package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[14]);
		String substr = new String(new char[4]);
		int i;
		int b;
		int j;
		while (scanf("%s%s",str,substr) != EOF)
		{
			b = 0;
			 for (i = 0;i < 10;i++)
			 {
				if (str.charAt(b) < str.charAt(i))
				{
					b = i;
				}
			 }
			for (i = 12;i > (b + 3);i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(i - 3));
			}
			for (i = (b + 1);i < (b + 4);i++)
			{
			str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(i - b - 1));
			}
			System.out.printf("%s\n",str);
			for (j = 0;j < 13;j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, j, '\0');
			}
		}
		return 0;
	}
}

