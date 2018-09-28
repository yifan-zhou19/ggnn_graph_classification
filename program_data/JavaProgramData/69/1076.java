package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[252]);
		String b = new String(new char[252]);
		char temp;
		int i;
		int j;
		int m;
		int n;
		int i1;
		int j1;
		int w;
		int k;

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

		for (i1 = 0,i = 0;a.charAt(i1) != '\0';i1++)
		{
			i++;
		}

		for (j = 0,j1 = 0;b.charAt(j1) != '\0';j1++)
		{
			j++;
		}

		for (m = 0,n = i - 1;m < n;m++,n--)
		{
			temp = a.charAt(m);
			a = tangible.StringFunctions.changeCharacter(a, m, a.charAt(n));
			a = tangible.StringFunctions.changeCharacter(a, n, temp);
		}

		for (m = 0,n = j - 1;m < n;m++,n--)
		{
				temp = b.charAt(m);
				b = tangible.StringFunctions.changeCharacter(b, m, b.charAt(n));
				b = tangible.StringFunctions.changeCharacter(b, n, temp);
		}

		for (m = i;m < 251;m++)
		{
			a = tangible.StringFunctions.changeCharacter(a, m, '0');
		}
		for (n = j;n < 251;n++)
		{
			b = tangible.StringFunctions.changeCharacter(b, n, '0');
		}

		w = 0;
		for (n = 0;n < 250;n++)
		{
			int x;
			int y;
			int z;
			x = a.charAt(n) - '0';
			y = b.charAt(n) - '0';
			x = x + y + w;
			z = x % 10;
			w = x / 10;
			a = tangible.StringFunctions.changeCharacter(a, n, '0' + z);
		}
		a = tangible.StringFunctions.changeCharacter(a, n, '0' + w);

		for (n = 250, k = 1;n >= 0 && k != 0;n--)
		{
			if (a.charAt(n) != '0')
			{
				k = 0;
			}
		}
		n++;
		for (;n >= 0;n--)
		{
			System.out.printf("%c",a.charAt(n));
		}

		return 0;
	}
}

