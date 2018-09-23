package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int l;
		int j;
		int n = 1;
		int t;
		int h;
		int m;
	String a = new String(new char[200]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
	l = a.length();
	for (j = 0;j < l;j++)
	{
		System.out.printf("%c",a.charAt(j));
	}

	System.out.print("\n");
	for (j = 0;j < l;j++)
	{
		if (a.charAt(j) == '(')
		{
			a = tangible.StringFunctions.changeCharacter(a, j, '$');
		}
		else if (a.charAt(j) == ')')
		{
			for (k = j;k >= -1;k--)
			{
				if (k == -1)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
					break;
				}
				if (a.charAt(k) == '$')
				{
					a = tangible.StringFunctions.changeCharacter(a, k, ' ');
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
					break;
				}

			}

		}
		else
		{
			a = tangible.StringFunctions.changeCharacter(a, j, ' ');
		}

	}

	for (j = 0;j < l;j++)
	{
		System.out.printf("%c",a.charAt(j));
	}

	System.out.print("\n");




	}
	return 0;
	}
}

