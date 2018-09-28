package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String c = new String(new char[256]);
		int i;
		int j;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		for (i = 0;i < str.length();i++)
		{
			for (j = 0;j < a.length();j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, str.charAt(i + j));
			}
			c = tangible.StringFunctions.changeCharacter(c, j, '\0');
			if (strcmp(c,a) == 0)
			{
				t = 1;
			   break;
			}
		}
		if (t == 1)
		{
		for (j = 0;j < i;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		for (j = 0;j < b.length();j++)
		{
			System.out.printf("%c",b.charAt(j));
		}
		for (j = i + a.length();str.charAt(j) != 0;j++)
		{
			System.out.printf("%c",str.charAt(j));
		}
		}
		else
		{
			System.out.printf("%s",str);
		}

		return 0;
	}

}

