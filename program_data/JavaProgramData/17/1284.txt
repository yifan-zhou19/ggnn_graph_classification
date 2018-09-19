package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int p;
		int i;
		int j;
		int len;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String a = new String(new char[150]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			len = a.length();
			String b = new String(new char[150]);
			for (i = 0;a.charAt(i) != 0;i++)
			{
				switch (a.charAt(i))
				{
						case '(':
							b = tangible.StringFunctions.changeCharacter(b, i, '$');
								 break;
						case ')':
							b = tangible.StringFunctions.changeCharacter(b, i, '?');
								 break;
						default :
							b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				}
			}
			for (i = 0;i < len;i++)
			{
				if (b.charAt(i) == '?')
				{
					  for (j = i - 1;j >= 0;j--)
					  {
							if (b.charAt(j) == '$')
							{
								 b = tangible.StringFunctions.changeCharacter(b, i, ' ');
								 b = tangible.StringFunctions.changeCharacter(b, j, ' ');
								 break;
							}
					  }
				}
			}
			System.out.printf("%s",a);
			System.out.print("\n");
			for (i = 0;i < len;i++)
			{
			System.out.printf("%c",b.charAt(i));
			}
			System.out.print("\n");

		}
	}

}

