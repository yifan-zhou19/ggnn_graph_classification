package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int s;
		int t = 0;
		int q = 0;
		String x = new String(new char[250]);
		String y = new String(new char[250]);
		String z = new String(new char[251]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}

		for (i = 0;;i++)
		{
		if (x.charAt(i) == 0)
		{
			break;
		}
		}
		for (j = 0;;j++)
		{
		if (y.charAt(j) == 0)
		{
			break;
		}
		}

		for (k = 1;;k++)
		{
			if (k <= i != 0 && k <= j)
			{
				s = x.charAt(i - k) + y.charAt(j - k) - 96 + t;
				z = tangible.StringFunctions.changeCharacter(z, k, s % 10 + 48);
				t = s / 10;
			}
			if (k > i && k <= j)
			{
				s = y.charAt(j - k) - 48 + t;
				z = tangible.StringFunctions.changeCharacter(z, k, s % 10 + 48);
				t = s / 10;
			}
			if (k <= i != 0 && k> j)
			{
				s = x.charAt(i - k) - 48 + t;
				z = tangible.StringFunctions.changeCharacter(z, k, s % 10 + 48);
				t = s / 10;
			}
			if (k > i && k > j)
			{
				z = tangible.StringFunctions.changeCharacter(z, k, t + 48);
				break;
			}
		}

		for (;k > 0;k--)
		{
		if (z.charAt(k) != 48 || q != 0)
		{
			q++;
			System.out.printf("%c",z.charAt(k));
		}
		}
		if (q == 0)
		{
			System.out.print("0");
		}

		return 0;
	}
}

