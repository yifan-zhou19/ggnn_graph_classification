package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String b = new String(new char[100]);
		int i;
		int j;
		int t;
		int l;
		int k = 2;
		while (true)
		{
			String a = new String(new char[100]);
			a = tangible.StringFunctions.changeCharacter(a, 0, '\0');
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = tempVar.charAt(0);
			}
			l = a.length();
			if (l == 0)
			{
				break;
			}
			System.out.printf("%s\n",a);
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
			}
			b = tangible.StringFunctions.changeCharacter(b, l, '\0');
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					t = 0;
					for (j = i + 1;j < l;j++)
					{
						if (a.charAt(j) == '(')
						{
							t--;
						}
						if (a.charAt(j) == ')')
						{
							t++;
						}
						if (t == 1)
						{
							b = tangible.StringFunctions.changeCharacter(b, i, b[j] = ' ');
							a = tangible.StringFunctions.changeCharacter(a, i, a[j] = 'a');
							break;
						}
					}
				}
			}
			for (i = 0;i < l;i++)
			{
				System.out.printf("%c",b.charAt(i));
			}
			System.out.print("\n");
		}
	}
}

