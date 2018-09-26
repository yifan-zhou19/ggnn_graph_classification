package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		char h;
		int s = 0;
		int p;
		int i;
		int t;
		int m;
		int n;
		int j;
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		t = a.length();
		for (i = 0;i < t;i++)
		{
			if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				s = s * m + a.charAt(i) - 55;
			}
			else if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				s = s * m + a.charAt(i) - 48;
			}
			else
			{
				s = s * m + a.charAt(i) - 87;
			}
		}
		p = s;
		for (i = 0;;i++)
		{
			q = p % n;
			if (q >= 10)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 55 + q);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, 48 + q);
			}
			for (j = i;j > 0;j--)
			{
				h = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j - 1));
				b = tangible.StringFunctions.changeCharacter(b, j - 1, h);
			}
			p = p / n;
			if (p == 0)
			{
				break;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, i + 1, '\0');
		System.out.printf("%s",b);
		return 0;
	}

}

