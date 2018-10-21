package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (k = 0;k < m;k++)
	{
		int i;
		int f;
		int len;
		int j;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String c = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		c = a;
		b = tangible.StringFunctions.changeCharacter(b, len, '\0');
		for (i = 0;i < len;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, ' ');
		}
		for (i = len - 1;i >= 0;i--)
		{
			if (a.charAt(i) == '(')
			{
				f = 0;
				for (j = i;j < len;j++)
				{
					if (a.charAt(j) == ')')
					{
						f = 1;
						a = tangible.StringFunctions.changeCharacter(a, j, 'a');
						break;
					}
				}
				if (f == 0)
				{
					b = tangible.StringFunctions.changeCharacter(b, i, '$');
				}


			}
		}
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ')')
			{
					b = tangible.StringFunctions.changeCharacter(b, i, '?');
			}
		}
		System.out.printf("%s\n%s\n",c,b);
	}
	}
}

