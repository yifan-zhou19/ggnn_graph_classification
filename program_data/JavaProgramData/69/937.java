package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String a = "";
		final String b = "";
		final String f = "";
		int i;
		int j;
		int m;
		int n;
		int p;
		int q;
		int x;
		int y;
		int[] c = new int[255];
		int[] d = new int[255];
		int[] e = new int[255];
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
		i = 0;
		while (a.charAt(i) == '0')
		{
			i++;
		}
		j = 0;
		while (b.charAt(j) == '0')
		{
			j++;
		}
		for (x = 0;x < 255 - i;x++)
		{
			a = tangible.StringFunctions.changeCharacter(a, x, a.charAt(x + i));
		}
		for (y = 0;y < 255 - j;y++)
		{
			b = tangible.StringFunctions.changeCharacter(b, y, b.charAt(y + j));
		}
		if (a.charAt(0) == '\0' && b.charAt(0) == '\0')
		{
			System.out.print("0");
		}
		else
		{
		i = a.length();
		j = b.length();
		for (m = 0;m < i;m++)
		{
			c[m] = a.charAt(i - 1 - m) - '0';
		}
		for (n = 0;n < j;n++)
		{
			d[n] = b.charAt(j - 1 - n) - '0';
		}
		e[0] = c[0] + d[0];
		for (p = 1;p < 255;p++)
		{
			e[p] = c[p] + d[p] + e[p - 1] / 10;
		}
		for (p = 0;p < 255;p++)
		{
			e[p] = e[p] % 10;
		}
		q = 254;
		while (e[q] == 0)
		{
			q--;
		}
		for (x = 0;x < q + 1;x++)
		{
			f = tangible.StringFunctions.changeCharacter(f, x, e[q - x] + '0');
		}
		System.out.printf("%s\n",f);
		}

	}

}

