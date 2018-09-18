package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] left = new int[101];
		int len;
		int top = 0;
		int i;
		int j;
		String str = new String(new char[101]);
		while (gets(str))
		{
			top = 0;
			System.out.println(str);
			len = str.length();
			for (i = 0;i < len;i++) //????????str[i]~~
			{
				if (str.charAt(i) == '(')
				{
					left[top] = i;
					top++;
				}
				else if (str.charAt(i) == ')')
				{
					if (top != 0)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, ' ');
						str = tangible.StringFunctions.changeCharacter(str, left[top - 1], ' '); //??top??????
						top--; //??????????????--
					}
					else
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '?');
					}
				}
				else
				{
					str = tangible.StringFunctions.changeCharacter(str, i, ' ');
				}
			}
			for (j = 0;j < len;j++)
			{
				if (str.charAt(j) == '(')
				{
				str = tangible.StringFunctions.changeCharacter(str, j, '$');
				}
			}
			System.out.println(str);
		}
		return 0;
	}
}

