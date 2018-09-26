package <missing>;

public class GlobalMembers
{
	public static int toDex(int a, String n)
	{
		int i;
		int j;
		int Dn = 0;
		int sqr;

		for (i = 0;i < n.length();i++)
		{
			sqr = 1;
			for (j = 0;j < n.length() - i - 1;j++)
			{
				sqr *= a;
			}
			if ((int)(n[i]) >= 65)
			{
				Dn += sqr * ((int)(n[i]) - 55);
			}
			else
			{
				Dn += sqr * ((int)(n[i]) - 48);
			}
		}

		return Dn;
	}
	public static int toB(int Dn, int b, String answer)
	{
		int shang = Dn;
		int i = 0;
		int yu;

		do
		{
			yu = shang % b;
			(yu >= 10)?(answer[i] = (char)(yu) + 55):(answer[i] = (char)(yu) + 48);
			i++;
			shang = shang / b;
		}while (shang != 0);

		return i;
	}

	public static int Main()
	{
		int a;
		int b;
		int len;
		int i;
		final String n = "0";
		final String answer = "0";
		int Dn;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}

		for (i = 0;i <= n.length() - 1;i++)
		{
			n = tangible.StringFunctions.changeCharacter(n, i, Character.toUpperCase(n.charAt(i)));
		}
		Dn = toDex(a, n);
		len = toB(Dn, b, answer);

		for (i = len - 1;i >= 0;i--)
		{
			System.out.printf("%c",answer.charAt(i));
		}

	}

}

