package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		int flag;
		int max;
		int length;
		int i;
		flag = 0;
		while (scanf("%s%s",str,substr) == 2)
		{
			max = 0;
			length = str.length();
			for (i = 0;i <= length - 1;i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
			for (i = length - 1;i >= max + 1;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, length + 3, '\0');
			for (i = 0;i <= 2;i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, max + 1 + i, substr.charAt(i));
			}
			if (flag != 0)
			{
				System.out.print("\n");
			}
			else
			{
				flag = 1;
			}
			System.out.printf("%s",str);
		}
	}
}

