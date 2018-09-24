package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char temp;
		int len1;
		int len2;
		int i;
		int j;
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
		len1 = a.length();
		len2 = b.length();
		for (i = 0;i < len1;i++)
		{
		for (j = 0;j < i;j++)
		{
			if (a.charAt(i) > a.charAt(j))
			{
				temp = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(j));
				a = tangible.StringFunctions.changeCharacter(a, j, temp);
			}
		}
		}
		for (i = 0;i < len2;i++)
		{
		for (j = 0;j < i;j++)
		{
			if (b.charAt(i) > b.charAt(j))
			{
				temp = b.charAt(i);
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(j));
				b = tangible.StringFunctions.changeCharacter(b, j, temp);
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

