package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int sum = 0;
		int len;
		int i;
		int t;
		int r;
		String s = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		len = s.length();
		for (i = 0; i < len; i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				t = s.charAt(i) - '0';
			}
			else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				t = s.charAt(i) - 'a' + 10;
			}
			else
			{
				t = s.charAt(i) - 'A' + 10;
			}
			sum = sum * a + t;
		}
		i = 0;
		if (sum == 0)
		{
			System.out.print("0\n");
		}
		else
		{
			while (sum != 0)
			{
				r = sum % b;
				if (r < 10)
				{
					s = tangible.StringFunctions.changeCharacter(s, i, r + '0');
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, r - 10 + 'A');
				}
				sum /= b;
				i++;
			}
			s = tangible.StringFunctions.changeCharacter(s, i, '\0');
			i = s.length() - 1;
			while (s.charAt(i) == '0')
			{
				i--;
			}
			for (; i >= 0; i--)
			{
				System.out.printf("%c",s.charAt(i));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

