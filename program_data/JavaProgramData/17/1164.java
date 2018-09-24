package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int i;
		int j;
		int k;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i < n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, a.charAt(j));
				}
			}
		//??????????????
			for (j = 0;j < a.length();j++)
			{
				if (b.charAt(j) == '(')
				{
					for (k = j + 1;k < a.length();k++)
					{
						if (b.charAt(k) == '(')
						{
							e++;
						}
						else if (b.charAt(k) == ')' && e == 0)
						{
							b = tangible.StringFunctions.changeCharacter(b, k, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							e++;
						}
					}
					e = 0;
				}
		//?????????????????????
				else if (b.charAt(j) == ')')
				{
					e = 0;
					k = j - 1;
					for (k = j - 1;k > 0;k--)
					{
						if (b.charAt(k) == '(')
						{
							b = tangible.StringFunctions.changeCharacter(b, k, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							k = 0;
							e = 1;
						}
					}
					if (e == 0 && b.charAt(0) == '(')
					{
							b = tangible.StringFunctions.changeCharacter(b, 0, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					}
				}
			}
		//????????????????????????
			for (j = 0;j < a.length();j++)
			{
				if (b.charAt(j) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
				else if (b.charAt(j) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '?');
				}
			}
		//???????????????$??
			for (j = 0;j < a.length();j++)
			{
				System.out.printf("%c", a.charAt(j));
			}
			System.out.print("\n");
			for (j = 0;j < a.length();j++)
			{
				System.out.printf("%c", b.charAt(j));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

