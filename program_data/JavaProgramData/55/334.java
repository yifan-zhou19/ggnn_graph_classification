package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int t;
		int n = 0;
		String s = new String(new char[100]);
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
		t = s.length() - 1;
		for (i = 0;i <= t;i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
			}
			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A' + 10);
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a' + 10);
			}
		}
			for (i = 0;i <= t;i++)
			{
				n = n * a + s.charAt(i);
			}
			i = 0;
			do
			{
				if (n % b >= 10)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, n % b + 'A' - 10);
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, n % b + '0');
				}
				n = (n - n % b) / b;
				i++;
			}while (n > 0);
			for (i--;i >= 0;i--)
			{
				System.out.printf("%c",s.charAt(i));
			}
	}
}

