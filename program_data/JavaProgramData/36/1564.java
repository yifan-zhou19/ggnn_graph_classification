package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[N]);
		String b = new String(new char[N]);
		char ch;
		int i;
		int j;
		int n1;
		int n2;
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
		n1 = a.length();
		n2 = b.length();
		for (i = 1;i < n1;i++)
		{
			for (j = n1 - 1;j >= i;j--)
			{
				if (a.charAt(j) < a.charAt(j - 1))
				{
					ch = a.charAt(j);
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j - 1));
					a = tangible.StringFunctions.changeCharacter(a, j - 1, ch);
				}
			}
		}
		for (i = 1;i < n2;i++)
		{
			for (j = n2 - 1;j >= i;j--)
			{
				if (b.charAt(j) < b.charAt(j - 1))
				{
					ch = b.charAt(j);
					b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j - 1));
					b = tangible.StringFunctions.changeCharacter(b, j - 1, ch);
				}
			}
		}
		if (strcmp(a,b) == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}

		return 0;
	}
}

