package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int k;
		int h;
		int n;
		int i;
		int m;
		String s = new String(new char[100]);
		String t = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = s.length();
		for (k = 0,i = 0;i < n;i++)
		{
			if (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 55);
			}
			else if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 87);
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 48);
			}
			for (h = 1,m = (int)s.charAt(i);h <= n - i - 1;h++)
			{
				m = m * a;
			}
			k = k + m;
		}

		h = 0;
		if (k != 0)
		{
			while (k != 0)
			{
			t = tangible.StringFunctions.changeCharacter(t, h, k % b);
			h++;
			k = k / b;
			}
		for (i = h - 1;i >= 0;i--)
		{
			if (t.charAt(i) < 10)
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) + 48);
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, i, t.charAt(i) + 55);
			}
			System.out.printf("%c",t.charAt(i));
		}

		}
		else
		{
			System.out.print("0");
		}
		System.out.print("\n");

	}

}

