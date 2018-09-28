package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String m = new String(new char[250]);
		int c;
		int d;
		int i;
		int e;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		c = a.length();
		d = b.length();
		k = 0;
		if (c < d)
		{
			   for (i = 0;i < d;i++)
			   {
				  m = tangible.StringFunctions.changeCharacter(m, i, a.charAt(i));
				  a = tangible.StringFunctions.changeCharacter(a, i, b.charAt(i));
				  b = tangible.StringFunctions.changeCharacter(b, i, m.charAt(i));
			   }
			   e = c;
			   c = d;
			   d = e;
		}
		if (c > d)
		{
			   for (i = c - 1;i >= c - d;i--)
			   {
			   b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i + d - c));
			   }
			   for (i = 0;i < c - d;i++)
			   {
			   b = tangible.StringFunctions.changeCharacter(b, i, '0');
			   }
		}
		for (i = c - 1;i > 0;i--)
		{
			   m = tangible.StringFunctions.changeCharacter(m, i, a.charAt(i) + b.charAt(i) - '0');
			   if (m.charAt(i) > '9')
			   {
				  m = tangible.StringFunctions.changeCharacter(m, i, m.charAt(i) - 10);
				  a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) + 1);
			   }
		}
		m = tangible.StringFunctions.changeCharacter(m, 0, a.charAt(0) + b.charAt(0) - '0');
		if (m.charAt(0) > '9')
		{
		   m = tangible.StringFunctions.changeCharacter(m, 0, m.charAt(0) - 10);
		   System.out.print("1");
		   for (i = 0;i < c;i++)
		   {
		   System.out.printf("%c",m.charAt(i));
		   }
		}
		else
		{
			for (i = 0;i < c;i++)
			{
			if (m.charAt(i) != '0')
			{
			for (j = i;j < c;j++)
			{
			System.out.printf("%c",m.charAt(j));
			}
			k = 1;
			}
		   if (k == 1)
		   {
		   break;
		   }
			}
			k = 0;
			for (i = 0;i < c;i++)
			{
				if (m.charAt(i) != '0')
				{
			k = k + 1;
				}
			}
			if (k == 0)
			{
			System.out.print("0");
			}
		}

	}

}

