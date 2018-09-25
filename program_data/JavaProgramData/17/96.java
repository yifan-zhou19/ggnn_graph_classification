package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int flag;
		int q;
		String str = new String(new char[101]);
		String note = new String(new char[101]);

		while (scanf("%s",str) != EOF)
		{
			note = str;

			for (i = 0;i < note.length();i++)
			{
				if ((note.charAt(i) >= 'a' && note.charAt(i) <= 'z') || (note.charAt(i) >= 'A' && note.charAt(i) <= 'Z'))
				{
					note = tangible.StringFunctions.changeCharacter(note, i, ' ');
				}
			}

			for (i = 0;i < note.length();i++)
			{
				flag = 0;
				if (note.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (note.charAt(j) == '(')
						{
							flag = 1;
							note = tangible.StringFunctions.changeCharacter(note, j, ' ');
							note = tangible.StringFunctions.changeCharacter(note, i, ' ');
							break;
						}
					}
					if (flag == 0)
					{
						note = tangible.StringFunctions.changeCharacter(note, i, '?');
					}
				}
			}

			for (i = 0;i < note.length();i++)
			{
				if (note.charAt(i) == '(')
				{
					note = tangible.StringFunctions.changeCharacter(note, i, '$');
				}
			}

			System.out.println(str);
			System.out.println(note);
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			q = Integer.parseInt(tempVar);
		}
		return 0;
	}

}

