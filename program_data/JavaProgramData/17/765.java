package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int k;
		int x;
		String s = new String(new char[200]);
		String a = new String(new char[200]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",s);

			for (j = 0;j < s.length();j++)
			{
				if (s.charAt(j) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '$');
				}
				else if (s.charAt(j) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
				}
				else
				{
					a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				}
			}

				for (k = 0;k < s.length();k++)
				{
					if (a.charAt(k) == '?')
					{
						for (x = k - 1;x >= 0;x--)
						{
							if (a.charAt(x) == '$')
							{
								a = tangible.StringFunctions.changeCharacter(a, k, ' ');
								a = tangible.StringFunctions.changeCharacter(a, x, ' ');
								break;
							}
						}
					}
				}
				int w;
				for (w = 0;w < s.length();w++)
				{
				 System.out.printf("%c",a.charAt(w));
				}


			System.out.print("\n");
		}
		return 0;
	}

}

