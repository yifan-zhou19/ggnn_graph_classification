package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int b;
		int i;
		int c;
		int d;
		int e = 0;
		int f;
		String a = new String(new char[50]);
		String s = new String(new char[50]);
		int[] z = new int[50];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			b = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		d = a.length();
		for (i = 0;i < d;i++)
		{
			if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
			{
				z[i] = a.charAt(i) - 48;
			}
			else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z')
			{
				z[i] = a.charAt(i) - 55;
			}
			else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
			{
				z[i] = a.charAt(i) - 87;
			}

		}

		for (i = 0;i < d;i++)
		{
			for (f = 0;f < d - i - 1;f++)
			{
				z[i] = z[i] * b;
			}
		}
		for (i = 0;i < d;i++)
		{
			e = e + z[i];
		}

		for (i = 0;;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, e % c + 48);
			e = e / c;
			if (e == 0)
			{
				break;
			}
		}
	int w;
	w = i + 1;
	String t = new String(new char[50]);

		for (i = 0;i < w;i++)
		{
			if (s.charAt(i) > '9')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) + 7);
			}
		}
		for (i = 0;i < w;i++)
		{
			t = tangible.StringFunctions.changeCharacter(t, w - 1 - i, s.charAt(i));
		}
		int y;
		y = t.length();

		for (i = 0;i < w;i++)
		{
			if (t.charAt(i) != '\0')
			{
		System.out.printf("%c",t.charAt(i));
			}
			else
			{
				break;
			}
		}

	}


}

