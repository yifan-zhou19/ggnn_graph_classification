package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int la;
		int lb;
		int q;
		int[] p = new int[255];
		String a = new String(new char[255]);
		String b = new String(new char[255]);
		String c = new String(new char[255]);
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
		la = a.length();
		lb = b.length();
		if (la < lb)
		{
			c = a;
			a = b;
			b = c;
			q = la;
			la = lb;
			lb = q;
		}
		p[0] = 0;
		for (i = 0;i <= la - lb - 1;i++)
		{
			p[i + 1] = (int)a.charAt(i) - 48;
		}
		for (i = la - lb;i <= la - 1;i++)
		{
			p[i + 1] = (int)a.charAt(i) + (int)b.charAt(i + lb - la) - 96;
		}
		for (i = la - 1;i >= 0;i--)
		{
			p[i] += p[i + 1] / 10;
			p[i + 1] %= 10;
		}
		q = 0;
		while (p[q] == 0 && q < la)
		{
			q++;
		}
		for (i = q;i <= la;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i - q, (char)(p[i] + 48));
		}
		c = tangible.StringFunctions.changeCharacter(c, la + 1 - q, '\0');
		System.out.printf("%s\n",c);
		return 0;
	}
}

