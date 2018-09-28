package <missing>;

public class GlobalMembers
{
	public static final int maxLen = 1000;

	public static String s = new String(new char[maxLen + 1]);
	public static String t = new String(new char[maxLen + 1]);
	public static int Main()
	{
		int i;
		int len;
		int index;
		while (gets(s) != null)
		{
			len = s.length();
			for (i = 0;s.charAt(i) == ' ';i++)
			{
				; // ??????
			}

			index = 0;
			for (;i < len;i++)
			{
				if (s.charAt(i) != ' ')
				{
					t = tangible.StringFunctions.changeCharacter(t, index++, s.charAt(i)); //????????????
				}
				else
				{
					if (s.charAt(i - 1) != ' ')
					{
						t = tangible.StringFunctions.changeCharacter(t, index++, ' '); //?????????????
					}
				}
			}
			if (index > 0 && t.charAt(index - 1) == ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, index - 1, '\0'); //??????????
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, index, '\0');
			}
			System.out.println(t);
		}

		return 0;
	}

}

