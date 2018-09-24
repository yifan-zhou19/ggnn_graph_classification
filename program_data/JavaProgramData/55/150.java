package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int a;
		int b;
		int x = 0;
		int t = 1;
		String n = new String(new char[50]);
		String m = new String(new char[50]);
		for (i = 50;i >= 0;i--)
		{
			m = tangible.StringFunctions.changeCharacter(m, i, '\0');
			n = tangible.StringFunctions.changeCharacter(n, i, '\0');
		}
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
		for (i = 50;i >= 0;i--)
		{
			if (n.charAt(i) != '\0')
			{
				for (j = i;j >= 0;j--)
				{
					if (n.charAt(j) >= 48 && n.charAt(j) <= 59)
					{
						x = x + (n.charAt(j) - 48) * t;
						t = t * a;
					}
					if (n.charAt(j) >= 65 && n.charAt(j) <= 90)
					{
						x = x + (n.charAt(j) - 55) * t;
						t = t * a;
					}
					if (n.charAt(j) >= 97 && n.charAt(j) <= 122)
					{
						x = x + (n.charAt(j) - 87) * t;
						t = t * a;
					}
				}
				if (j == -1)
				{
					break;
				}
			}
		}
		for (i = 50;i >= 0;i--)
		{
			if (x == 0)
			{
				break;
			}
			if (b <= 10)
			{
				m = tangible.StringFunctions.changeCharacter(m, i, x % b + 48);
				x = x / b;
			}
			if (b > 10)
			{
				if (x % b <= 9)
				{
					m = tangible.StringFunctions.changeCharacter(m, i, x % b + 48);
				}
				if (x % b >= 10)
				{
					m = tangible.StringFunctions.changeCharacter(m, i, x % b + 55);
				}
				x = x / b;
			}
		}
		for (i = 0;i <= 50;i++)
		{
			if (m.charAt(i) != '\0')
			{
				for (j = i;j <= 50;j++)
				{
					System.out.printf("%c",m.charAt(j));
				}
				break;
			}
			if (i == 50 && m.charAt(i) == '\0')
			{
				System.out.print("0");
			}
		}
		System.out.print("\n");
	}
}

