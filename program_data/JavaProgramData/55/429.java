package <missing>;

public class GlobalMembers
{
	public static void MyStrupr(tangible.RefObject<String> p)
	{
		int i = 0;
		for (i = 0; i < p.argValue.length(); i++)
		{
			if ((p.argValue.charAt(i) >= 'a') && (p.argValue.charAt(i) <= 'z'))
			{
				p.argValue.charAt(i) -= 32;
			}
		}
	}

	public static void Main()
	{
		int a;
		int b;
		int s;
		int i;
		int j;
		int k;
		int[] m = new int[100];
		int x;
		String n = new String(new char[100]);
		String t = new String(new char[100]);

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

	tangible.RefObject<String> tempRef_n = new tangible.RefObject<String>(n);
		MyStrupr(tempRef_n);
		n = tempRef_n.argValue;
		s = n.length();
		x = 0;

		for (i = 0; i <= s - 1; i++)
		{
			if ((n.charAt(i) >= 'A') && (n.charAt(i) <= 'Z'))
			{
				m[i] = n.charAt(i) - 55;
			}
			else
			{
				m[i] = (int)(n.charAt(i)) - 48;
			}

			x = (int)(x + Math.pow(a, (s - 1 - i)) * m[i]);
		}

		j = 0;
		while (x >= b)
		{
			m[j] = x % b;
			if (m[j] > 9)
			{
				t = tangible.StringFunctions.changeCharacter(t, j, m[j] + 55);
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, j, m[j] + 48);
			}

			x = x / b;
			j++;
		}

		if (x > 9)
		{
			t = tangible.StringFunctions.changeCharacter(t, j, x + 55);
		}
		else
		{
			t = tangible.StringFunctions.changeCharacter(t, j, x + 48);
		}

		for (i = 0; i <= j; i++)
		{
			System.out.printf("%c", t.charAt(j - i));
		}
		System.out.print("\n");

	}


}

