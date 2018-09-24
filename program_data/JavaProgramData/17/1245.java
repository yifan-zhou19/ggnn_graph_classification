package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int n;
		int i;
		int j;
		int k;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.println(a);
			k = a.length();
			for (j = 0;j < k;j++)
			{
				if (a.charAt(j) == ')')
				{
					for (m = j;m >= 0;m--)
					{
						if (a.charAt(m) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, m, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
					}
				}
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
			}
			for (j = 0;j < k;j++)
			{
				if (a.charAt(j) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '$');
				}
				else if (a.charAt(j) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
				}
			}
			System.out.println(a);
		}
		return 0;
	}
}

