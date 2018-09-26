package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int t;
		int k;
		String m = new String(new char[32]);
		String n = new String(new char[32]);
		int middle;
		int mult;
		middle = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		i = m.length();
		for (j = 0;j <= i - 1;j++)
		{
			if (m.charAt(j) >= '0' && m.charAt(j) <= '9')
			{
				m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j) - '0');
			}
			if (m.charAt(j) >= 'a' && m.charAt(j) <= 'z')
			{
				m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j) - 'a' + 10);
			}
			if (m.charAt(j) >= 'A' && m.charAt(j) <= 'Z')
			{
				m = tangible.StringFunctions.changeCharacter(m, j, m.charAt(j) - 'A' + 10);
			}
		}
		for (j = 0;j <= i - 1;j++)
		{
			mult = 1;
			for (t = i - 1 - j;t >= 1;t--)
			{
				mult = mult * a;
			}
			middle = middle + m.charAt(j) * mult;
		}
	if (middle == 0)
	{
		System.out.print("0");
	}
	if (middle > 0)
	{
		j = 0;
		while (middle > 0)
		{
			n = tangible.StringFunctions.changeCharacter(n, j, middle % b);
			middle = middle / b;
			j++;
		}
		for (k = 0;k <= j - 1;k++)
		{
			if (n.charAt(k) <= 9 && n.charAt(k) >= 0)
			{
				n = tangible.StringFunctions.changeCharacter(n, k, n.charAt(k) + '0');
			}
			else if (n.charAt(k) >= 10)
			{
				n = tangible.StringFunctions.changeCharacter(n, k, 'A' - 10 + n.charAt(k));
			}
		}
		for (k = j - 1;k >= 0;k--)
		{
			System.out.printf("%c",n.charAt(k));
		}
	}
	}
}

