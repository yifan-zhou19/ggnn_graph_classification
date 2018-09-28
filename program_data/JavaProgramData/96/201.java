package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int l;
		l = a.length();
		String m = new String(new char[100]);
		int n;
		int i;
		if (l == 1)
		{
		System.out.printf("0\n%d\n",a.charAt(0) - '0');
		}
		else if (l == 2 && a.charAt(0) == '1' && a.charAt(1) <= '2')
		{
		System.out.printf("0\n%d\n",10 + a.charAt(1) - '0');
		}
		else
		{
		for (i = 0;;i++)
		{
					 if (a.charAt(i) == '\0')
					 {
					 break;
					 }
					 else
					 {
						 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
					 }
		}
		int c;
		c = a.charAt(0);
		for (i = 0;i < l - 1;i++)
		{
				   c = c % 13 * 10 + a.charAt(i + 1);
					m = tangible.StringFunctions.changeCharacter(m, i, c / 13);
		}
		if (m.charAt(0) == 0)
		{
				   for (i = 0;i < l - 2;i++)
				   {
				   m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i + 1) + '0');
				   }
				   m = tangible.StringFunctions.changeCharacter(m, l - 2, '\0');
		}
		else
		{
				for (i = 0;i < l - 1;i++)
				{
						m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) + '0');
						m = tangible.StringFunctions.changeCharacter(m, l - 1, '\0');
				}
		}
		n = c % 13;
		System.out.printf("%s\n",m);
		System.out.printf("%d\n",n);
		}
		System.in.read();
		System.in.read();
	}

}

