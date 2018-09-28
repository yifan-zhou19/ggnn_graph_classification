package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m1;
		int m2;
		int n;
		int k = 1;
		int p;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (k <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			k++;
			m1 = a.length();
			m2 = b.length();
			for (i = 0;i <= m1;i++)
			{
			a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 48);
			}
			for (i = 0;i <= m2;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - 48);
			}
			p = m1 - m2;
			for (i = 0;i < m2;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i + p, b.charAt(i));
			}
			for (i = 0;i < p;i++)
			{
				c = c.substring(0, i);
			}
			for (i = m1 - 1;i >= 0;i--)
			{
				if (a.charAt(i) >= c.charAt(i))
				{
					d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i) - c.charAt(i));
				}
				else
				{
					d = tangible.StringFunctions.changeCharacter(d, i, a.charAt(i) + 10 - c.charAt(i));
					a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				}
			}
			for (i = 0;i < m1;i++)
			{
			   System.out.printf("%d",d.charAt(i));
			}
			System.out.print("\n");
		}
	}


}

