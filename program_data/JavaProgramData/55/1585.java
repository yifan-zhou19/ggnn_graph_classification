package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int l;
		String as = new String(new char[30]);
		String ds = new String(new char[30]);
		String cs = new String(new char[30]);
		int bs;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			as = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		j = 1;
		l = as.length();
		bs = 0;
		for (i = l - 1;i >= 0;i--)
		{
			if (as.charAt(i) >= 'A' && as.charAt(i) <= 'Z')
			{
				k = as.charAt(i) + 10 - 'A';
			}
			else if (as.charAt(i) >= 'a' && as.charAt(i) <= 'z')
			{
				k = as.charAt(i) + 10 - 'a';
			}
			else if (as.charAt(i) >= '0' && as.charAt(i) <= '9')
			{
				k = as.charAt(i) - '0';
			}
			bs += j * k;
			j *= n;
		}
		for (i = 0;bs > 0;i++)
		{
			ds = tangible.StringFunctions.changeCharacter(ds, i, bs % m);
			bs /= m;
		}
		for (j = 0;j < i;j++)
		{
			cs = tangible.StringFunctions.changeCharacter(cs, j, ds.charAt(i - j - 1));
			if (cs.charAt(j) >= 0 && cs.charAt(j) < 10)
			{
				cs.charAt(j) += '0';
			}
			else if (cs.charAt(j) >= 10)
			{
				cs = tangible.StringFunctions.changeCharacter(cs, j, cs.charAt(j) - 10 + 'A');
			}
		}
		cs = cs.substring(0, i);
		if (cs.charAt(0) == 0)
		{
			cs = tangible.StringFunctions.changeCharacter(cs, 0, '0');
			cs = cs.substring(0, 1);
		}

		System.out.printf("%s",cs);
		return 0;
	}

}

