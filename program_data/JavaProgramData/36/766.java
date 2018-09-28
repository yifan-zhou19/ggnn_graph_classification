package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		char e;
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
			for (j = 0;j < len2;j++)
			{
				if (a.charAt(i) == b.charAt(j))
				{
					e = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(i));
					b = tangible.StringFunctions.changeCharacter(b, i, e);
					break;
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

