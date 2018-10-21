package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int som;
		String a = new String(new char[105]);
		String b = new String(new char[105]);
		int len;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (som = 1; som <= n; som++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			b = a;
			len = a.length();
			for (i = len - 1; i >= 0; i--)
			{
				if (b.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
				else if (b.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
			}
			for (i = len - 1; i >= 0; i--)
			{
				if (b.charAt(i) == '$')
				{
					for (j = i + 1; j < len; j++)
					{
						if (b.charAt(j) == '?')
						{
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							break;
						}
					}
				}
			}
			System.out.printf("%s\n%s\n", a, b);
		}
	}
}

