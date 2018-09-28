package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		String c = new String(new char[101]);
		int n;
		int i;
		int j;
		int k;
		int p = 0;
		int q;
		int len1;
		int len2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 100;i++)
		{
			c = c.substring(0, i);
		}
		for (i = 1;i <= n;i++)
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
			len1 = a.length();
			len2 = b.length();
			for (j = len2 - 1;j >= 0;j--)
			{
				b = tangible.StringFunctions.changeCharacter(b, j + len1 - len2, b.charAt(j));
			}
			for (j = 0;j < len1 - len2;j++)
			{
				b = tangible.StringFunctions.changeCharacter(b, j, '0');
			}
			for (k = len1 - 1;k >= 0;k--)
			{
				if (a.charAt(k) >= b.charAt(k))
				{
					c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(k) - b.charAt(k));
				}
				else if (a.charAt(k) < b.charAt(k))
				{
					c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(k) + 10 - b.charAt(k));
					a.charAt(k - 1)--;
				}
			}
			while (c.charAt(p) == 0)
			{
				p++;
			}
			for (q = p;q < len1;q++)
			{
				System.out.printf("%d",c.charAt(q));
			}
			System.out.print("\n");
		}
	}
}

