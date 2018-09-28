package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "0";
		String d = new String(new char[20]);
		char k;
		int a;
		int b;
		int c;
		int i = 0;
		int e;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		while ((s[i] = System.in.read()) != ' ')
		{
			i++;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		c = s.length() - 1;
		for (i = c - 1;i >= 0;i--)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 55);
			}
			else if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 48);
			}
			else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 87);
			}
			n = n + s.charAt(i) * Math.pow(a,c - 1 - i);
		}
		i = 0;
		e = n;
		do
		{
			d = tangible.StringFunctions.changeCharacter(d, i, e % b);
			if (d.charAt(i) >= 10)
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 55);
			}
			else
			{
				d = tangible.StringFunctions.changeCharacter(d, i, d.charAt(i) + 48);
			}
			i++;
			e = e / b;
		}while (e != 0);
		for (i = i - 1;i >= 0;i--)
		{
			if (i != 0)
			{
				System.out.printf("%c",d.charAt(i));
			}
			else
			{
				System.out.printf("%c\n",d.charAt(i));
			}
		}

	}
}

