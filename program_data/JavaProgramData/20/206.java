package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int a;
		char c;
		String str = new String(new char[800]);
		String substr = new String(new char[4]);
		String str0 = new String(new char[800]);
		char max;
		while ((scanf("%s %s",str,substr)) != EOF)
		{
			a = str.length();
			max = str.charAt(0);
			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) > max)
				{
					max = str.charAt(i);
				}
			}
			for (i = 0;i < a;i++)
			{
				if (str.charAt(i) == max)
				{
					break;
				}
			}
			for (j = 0;j <= i;j++)
			{
				str0 = tangible.StringFunctions.changeCharacter(str0, j, str.charAt(j));
			}
			for (j = i + 1;j < a;j++)
			{
				str0 = tangible.StringFunctions.changeCharacter(str0, j + 3, str.charAt(j));
			}
			str0 = tangible.StringFunctions.changeCharacter(str0, i + 1, substr.charAt(0));
			str0 = tangible.StringFunctions.changeCharacter(str0, i + 2, substr.charAt(1));
			str0 = tangible.StringFunctions.changeCharacter(str0, i + 3, substr.charAt(2));
			for (i = 0;i < a + 3;i++)
			{
				System.out.printf("%c",str0.charAt(i));
			}
			System.out.print("\n");
		}
	}

}

