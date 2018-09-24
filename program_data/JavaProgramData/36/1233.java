package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a1 = new String(new char[1000]);
		String a2 = new String(new char[1000]);
		char b;
		int i;
		int j;
		int n1;
		int n2;
		int c = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = tempVar2.charAt(0);
		}
		n1 = a1.length();
		n2 = a2.length();
		for (i = 0;i < (n1 - 1);i++)
		{
			for (j = 0;j < (n1 - i - 1);j++)
			{
				if (a1.charAt(j) > a1.charAt(j + 1))
				{
					b = a1.charAt(j + 1);
					a1 = tangible.StringFunctions.changeCharacter(a1, j + 1, a1.charAt(j));
					a1 = tangible.StringFunctions.changeCharacter(a1, j, b);
				}
			}

		}
		for (i = 0;i < (n2 - 1);i++)
		{
			for (j = 0;j < (n2 - i - 1);j++)
			{
				if (a2.charAt(j) > a2.charAt(j + 1))
				{
					b = a2.charAt(j + 1);
					a2 = tangible.StringFunctions.changeCharacter(a2, j + 1, a2.charAt(j));
					a2 = tangible.StringFunctions.changeCharacter(a2, j, b);
				}
			}

		}
		c = strcmp(a1,a2);
		if (c == 0)
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

