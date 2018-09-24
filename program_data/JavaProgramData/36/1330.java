package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		if (a.length() == b.length())
		{
			for (i = 0;i < a.length() - 1;i++)
			{
				for (j = 0;j < a.length() - i - 1;j++)
				{
					if (a.charAt(j) > a.charAt(j + 1))
					{
						char s;
						s = a.charAt(j + 1);
						a = tangible.StringFunctions.changeCharacter(a, j + 1, a.charAt(j));
						a = tangible.StringFunctions.changeCharacter(a, j, s);
					}
				}
			}
			for (i = 0;i < b.length() - 1;i++)
			{
				for (j = 0;j < b.length() - i - 1;j++)
				{
					if (b.charAt(j) > b.charAt(j + 1))
					{
						char s;
						s = b.charAt(j + 1);
						b = tangible.StringFunctions.changeCharacter(b, j + 1, b.charAt(j));
						b = tangible.StringFunctions.changeCharacter(b, j, s);
					}
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES");
		}
		else
		{
			System.out.print("NO");
		}

		return 0;
	}

}

