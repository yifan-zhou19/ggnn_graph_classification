package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[280]);
		String b = new String(new char[280]);
		String c = new String(new char[280]);
		String res = new String(new char[280]);
		String t = new String(new char[280]);
		int i;
		int j;
		int check = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = tempVar3.charAt(0);
		}

		for (i = 0;i < a.length();i++)
		{
			if (check == 1)
			{
				break;
			}
			if (b.charAt(0) == a.charAt(i))
			{
				for (j = 0;j < 280;j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j, '\0');
				}
				for (j = 0;j < 280;j++)
				{
					res = tangible.StringFunctions.changeCharacter(res, j, '\0');
				}
				for (j = i;j < i + b.length();j++)
				{
					t = tangible.StringFunctions.changeCharacter(t, j - i, a.charAt(j));
				}
				if (strcmp(b,t) == 0)
				{
					check = 1;
					for (j = 0;j < i;j++)
					{
						res = tangible.StringFunctions.changeCharacter(res, j, a.charAt(j));
					}
					for (j = i;j < c.length() + i;j++)
					{
						res = tangible.StringFunctions.changeCharacter(res, j, c.charAt(j - i));
					}
					for (j = c.length() + i;j < a.length() + c.length() - b.length();j++)
					{
						res = tangible.StringFunctions.changeCharacter(res, j, a.charAt(j + b.length() - c.length()));
					}
				}

			}

		}
		if (check == 1)
		{
			System.out.printf("%s\n",res);
		}
		else
		{
			System.out.printf("%s\n",a);
		}
		return 0;

	}
}

