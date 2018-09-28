package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int p;
		int q;
		String n = new String(new char[100]);
		String out = new String(new char[100]);
		char c;
		int m;
		int k;
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
		for (i = 0;(c = n.charAt(i)) != '\0';i++)
		{
			if (c >= 'A' && c <= 'Z')
			{
				q = c - 55;
			}
			else if (c >= 'a' && c <= 'z')
			{
				q = c - 87;
			}
			else
			{
				q = c - 48;
			}
			if (i != 0)
			{
				m = a * m + q;
			}
			else
			{
				m = q;
			}

		}
		for (i = 0;(k = m / b) != 0;i++)
		{
			p = m % b;
			m = m / b;
			if (p < 10)
			{
				out = tangible.StringFunctions.changeCharacter(out, i, p + 48);
			}
			else
			{
				out = tangible.StringFunctions.changeCharacter(out, i, p + 55);
			}

		}
		p = m % b;
		if (p < 10)
		{
			out = tangible.StringFunctions.changeCharacter(out, i, p + 48);
		}
		else
		{
			out = tangible.StringFunctions.changeCharacter(out, i, p + 55);
		}
		for (;i >= 0;i--)
		{
			System.out.printf("%c",out.charAt(i));
		}


	}
}

