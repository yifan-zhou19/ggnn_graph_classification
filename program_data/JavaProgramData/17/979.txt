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
		int num;
		int p;
		int q;
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[101]);
			String b = new String(new char[101]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			num = a.length();
			for (j = 0;j < num;j++)
			{
				if (a.charAt(j) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
				else if (a.charAt(j) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
			}

			for (p = num - 1;p >= 0;p--)
			{
				if (b.charAt(p) == '$')
				{
					for (q = p;q < num;q++)
					{
						if (b.charAt(q) == '?')
						{
							b = tangible.StringFunctions.changeCharacter(b, q, ' ');
							b = tangible.StringFunctions.changeCharacter(b, p, ' ');
							break;
						}
					}
				}
			}
			for (j = 0;j < num;j++)
			{

				System.out.printf("%c", a.charAt(j));
			}
			System.out.print("\n");
			for (j = 0;j < num;j++)
			{

				System.out.printf("%c", b.charAt(j));
			}
			System.out.print("\n");
			p = 0;
			q = 0;
		}
	}
}

