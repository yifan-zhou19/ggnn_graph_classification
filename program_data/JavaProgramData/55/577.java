package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String s = new String(new char[100]);
		int num = 0;
		for (int i = 0;i < 100;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
		}
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
		for (int j = 0;j < 100;j++)
		{
			if (s.charAt(j) >= '0' && s.charAt(j) <= '9')
			{
				num = num * a + s.charAt(j) - '0';
			}
			if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z')
			{
				num = num * a + s.charAt(j) - 'a' + 10;
			}
			if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')
			{
				num = num * a + s.charAt(j) - 'A' + 10;
			}
		}
		for (int p = 0;p < 100;p++)
		{
			s = tangible.StringFunctions.changeCharacter(s, p, '\0');
		}
		int m;
		int n = num;
		for (int t = 0;;t++)
		{
			m = n % b;
			n = n / b;
			if (m >= 10)
			{
				s = tangible.StringFunctions.changeCharacter(s, t, m - 10 + 'A');
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, t, m + '0');
			}
			if (n == 0)
			{
				break;
			}
		}
		for (int q = 99;q >= 0;q--)
		{
			if (s.charAt(q) != '\0')
			{
				System.out.printf("%c",s.charAt(q));
			}
		}
		return 0;
	}


}

