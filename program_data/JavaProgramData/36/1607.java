package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[10000]);
		String b = new String(new char[10000]);
		char c;
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
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j < a.length() - 1;j++)
			{
				if (a.charAt(j) > a.charAt(j + 1))
				{
					c = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
					a = tangible.StringFunctions.changeCharacter(a, j + 1, c);
				}
			}
		}
		//printf("%s",a);
		for (i = 0;i < b.length();i++)
		{
			for (j = 0;j < b.length() - 1;j++)
			{
				if (b.charAt(j) > b.charAt(j + 1))
				{
					c = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
					b = tangible.StringFunctions.changeCharacter(b, j + 1, c);
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

