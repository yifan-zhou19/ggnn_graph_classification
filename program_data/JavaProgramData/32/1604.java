package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int n;
		int i;
		int k;
		int p;
		int q;
		int g = 0; //????
		int cn;
		String c = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			p = a.length();
			q = b.length();
			for (i = 0;i <= q;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, p - i, b.charAt(q - i));
			}
			for (i = i;i <= p;i++)
			{
				b = tangible.StringFunctions.changeCharacter(b, p - i, '0');
			}
			for (i = p - 1;i >= 0;i--)
			{
			if ((a.charAt(i) - g) >= b.charAt(i))
			{
				cn = a.charAt(i) - '0' - b.charAt(i) + '0' - g;
				g = 0;
				c = tangible.StringFunctions.changeCharacter(c, i, cn + '0');
			}
			else
			{
				cn = a.charAt(i) - b.charAt(i) - g + 10;
				g = 1;
				c = tangible.StringFunctions.changeCharacter(c, i, cn + '0');
			}

			}
		for (i = 0;i < p;i++)
		{
			if (c.charAt(i) != '0')
			{
				System.out.printf("%c",c.charAt(i));
				break;
			}

		}
		for (i = i + 1;i < p;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
		}
	}

}

