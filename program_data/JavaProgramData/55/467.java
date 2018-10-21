package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int a;
		int b;
		int n = 0;
		final String s = "";
		char c;
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
		k = s.length();
		for (i = 0;i < k;i++)
		{
			if ((j = Character.isLowerCase(s.charAt(i))) != 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'a' + 10);
			}
			else if ((j = Character.isUpperCase(s.charAt(i))) != 0)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - 'A' + 10);
			}
			else
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
			}
			n = n + s.charAt(i) * (int)(Math.pow(a,k - i - 1));
		}
		if (n == 0)
		{
			System.out.print('0');
		}
		else
		{
			for (i = 0;i < 30;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, '\0');
			}
			for (i = 0;n != 0;i++)
			{
				j = n % b;
				if (j < 10)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, j + 48);
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, j - 10 + 'A');
				}
				n = n / b;
			}
			k = s.length();
			for (i = 0;i <= k / 2 - 1;i++)
			{
				c = s.charAt(i);
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(k - i - 1));
				s = tangible.StringFunctions.changeCharacter(s, k - i - 1, c);
			}
			System.out.println(s);
		}
	}

}

