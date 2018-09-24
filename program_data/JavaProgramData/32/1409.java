package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int l;
		String j = new String(new char[100]);
		String b = new String(new char[100]);
		char[] m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		String d = new String(new char[100]);
		int nj;
		int nb;
		int yj;
		int yb;
		int i;
		int ii;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 0;l < n;l++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		nj = 0;
		nb = 0;
		for (i = 0;j.charAt(i);i++)
		{
			nj++;
		d = tangible.StringFunctions.changeCharacter(d, i, '0');
		}
		for (i = 0;b.charAt(i);i++)
		{
			nb++;
		}
		for (i = nj - 1;i >= nj - nb;i--)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - nj + nb));
		}
		for (i = 0;i < nj - nb;i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i, '0');
		}
		for (i = nj - 1;i >= 0;i--)
		{
			yj = j.charAt(i) - '0';
			yb = b.charAt(i) - '0';
			if (yj - yb >= 0)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, m[yj - yb]);
			}
			if (yj - yb < 0)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, m[yj - yb + 10]);
				int p;
				int pp;
				int cp;
				int k;
				for (p = i - 1;p >= 0;p--)
				{
					if (j.charAt(p) != '0')
					{
						pp = p;
					break;
					}
				}
				cp = j.charAt(pp) - '0';
				j = tangible.StringFunctions.changeCharacter(j, pp, m[cp - 1]);
				for (k = i - 1;k > pp;k--)
				{
						j = tangible.StringFunctions.changeCharacter(j, k, '9');
				}
			}
		}
		for (i = 0;i < nj - 1;i++)
		{
			ii = nj - 1;
			if (d.charAt(i) != '0')
			{
				ii = i;
			break;
			}
		}
		for (i = ii;i < nj - 1;i++)
		{
			System.out.printf("%c",d.charAt(i));
		}
		System.out.printf("%c\n",d.charAt(nj - 1));
		}
		return 0;
	}


}

