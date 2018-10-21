package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		String c = new String(new char[252]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		int i;
		int k;
		int m;
		int n;
		int p;
		int d;
		int e;
		d = a.length();
		e = b.length();
		 if (d < e)
		 {
			for (i = 1;i <= d;i++)
			{
			 c = tangible.StringFunctions.changeCharacter(c, e - i + 1, a.charAt(d - i) + b.charAt(e - i) - '0');
		   if (c.charAt(e - i + 1) >= 58)
		   {
				 b.charAt(e - i - 1)++;
			  c = tangible.StringFunctions.changeCharacter(c, e - i + 1, c.charAt(e - i + 1) - 10);
		   }
			}
		 for (k = e - d - 1;k >= 1;k--)
		 {
					 if (b.charAt(k) >= 58)
					 {
						 b = tangible.StringFunctions.changeCharacter(b, k, b.charAt(k) - 10);
					 b.charAt(k - 1)++;
					 }
					c = tangible.StringFunctions.changeCharacter(c, k + 1, b.charAt(k));
		 }
			c = tangible.StringFunctions.changeCharacter(c, 1, b.charAt(0));
			m = b.length();
		 }
		else if (d > e)
		{
			for (i = 1;i <= e;i++)
			{
			 c = tangible.StringFunctions.changeCharacter(c, d - i + 1, a.charAt(d - i) + b.charAt(e - i) - '0');
		   if (c.charAt(d - i + 1) >= 58)
		   {
				 a.charAt(d - i - 1)++;
			  c = tangible.StringFunctions.changeCharacter(c, d - i + 1, c.charAt(d - i + 1) - 10);
		   }
			}
		 for (k = d - e-1;k >= 1;k--)
		 {
					 if (a.charAt(k) >= 58)
					 {
						 a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k) - 10);
					 a.charAt(k - 1)++;
					 }
					c = tangible.StringFunctions.changeCharacter(c, k + 1, a.charAt(k));
		 }
			c = tangible.StringFunctions.changeCharacter(c, 1, a.charAt(0));
			m = a.length();
		}
		else if (a.length() == b.length())
		{
			for (i = b.length();i > 0;i--)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + 1, a.charAt(i) + b.charAt(i) - '0');
			if (c.charAt(i + 1) >= 58)
			{
				 b.charAt(i - 1)++;
			  c = tangible.StringFunctions.changeCharacter(c, i + 1, c.charAt(i + 1) - 10);
			}
			}
			c = tangible.StringFunctions.changeCharacter(c, 1, a.charAt(0) + b.charAt(0) - '0');
			m = b.length();
		}
		if (c.charAt(1) >= 58)
		{
			c = tangible.StringFunctions.changeCharacter(c, 0, '1');
		 c = tangible.StringFunctions.changeCharacter(c, 1, c.charAt(1) - 10);
		 for (int l = 0;l < m + 1;l++)
		 {
		 System.out.printf("%c",c.charAt(l));
		 }
		}
		else if (c.charAt(1) == '0' && m == 01)
		{
		System.out.print("0");
		}
		else
		{
			for (int l = 1;l < m + 1;l++)
			{
			 if (c.charAt(l) != '0')
			 {
			 p = l;
		 break;
			 }
			}
		 for (i = p;i < m + 1;i++)
		 {
		 System.out.printf("%c",c.charAt(i));
		 }
		}
	}
}

