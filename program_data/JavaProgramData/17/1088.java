package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		String a = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 101;i++)
			{
				a = a.substring(0, i);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
			m = a.length();
			for (i = 0;i < m;i++)
			{
				if ((a.charAt(i) != '(') && (a.charAt(i) != ')'))
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (k = i;k >= 0;k--)
					{
						if (a.charAt(k) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, k, ' ');
							break;
						}
					}
					if (k == -1)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '?');
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
			}
			System.out.printf("%s\n",a);
		}
		return 0;
	}

}

