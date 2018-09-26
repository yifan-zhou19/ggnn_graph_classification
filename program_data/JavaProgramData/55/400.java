package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int a;
		int b;
		int n = 0;
		int l;
		int l1 = 0;
		int p;
		String s = new String(new char[33]);
		String t = new String(new char[33]);
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
		l = s.length();
		for (i = 0;i < l;++i)
		{
			if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))
			{
				p = s.charAt(i) - '0';
			}
			else if ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))
			{
				p = s.charAt(i) - 'a' + 10;
			}
			else
			{
				p = s.charAt(i) - 'A' + 10;
			}
			n = n * a + p;
		}
		for (;n != 0;n /= b)
		{
			p = n % b;
			if (p < 10)
			{
				t = tangible.StringFunctions.changeCharacter(t, l1++, '0' + p);
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, l1++, 'A' + p - 10);
			}
		}
		if (l1 == 0)
		{
			System.out.print("0");
		}
		else
		{
			for (i = l1 - 1;i >= 0;--i)
			{
				System.out.printf("%c",t.charAt(i));
			}
		}
		System.out.print("\n");
	}
}

