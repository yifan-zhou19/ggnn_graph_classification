package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[15]);
		String sub = new String(new char[4]);
		char m;
		int t;
		int i;
		int len;



		while (scanf("%s %s",str,sub) != EOF)
		{
			t = 0;
			m = str.charAt(0);
			len = 0;
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				len++;
			}

			for (i = 1;i < len;i++)
			{
				if (str.charAt(i) > m)
				{
					t = i;
					m = str.charAt(i);
				}
			}
			for (i = len - 1;i > t;i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
			}
			str = tangible.StringFunctions.changeCharacter(str, t + 1, sub.charAt(0));
			str = tangible.StringFunctions.changeCharacter(str, t + 2, sub.charAt(1));
			str = tangible.StringFunctions.changeCharacter(str, t + 3, sub.charAt(2));
			str = tangible.StringFunctions.changeCharacter(str, len + 3, '\0');
			System.out.printf("%s\n",str);
		}
	}








}

