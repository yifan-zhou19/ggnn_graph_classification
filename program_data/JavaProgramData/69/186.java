package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int i;
		int j;
		int k;
		int sign;
		int m;
		int counter;
		int p;
		int x;
		String s1 = new String(new char[251]);
		String s2 = new String(new char[251]);
		char[] s = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s2 = tempVar2.charAt(0);
		}
		sign = 1;
		counter = 0;
		x = 1;
		a = s1.length();
		b = s2.length();
		for (i = a - 1,j = b - 1,k = 0;i != 0 || j != 0 || sign != 0;i--,j--,k++)
		{
			m = s1.charAt(i) + s2.charAt(j) + counter - 48;
			if (m < 58)
			{
				s[k] = m;
				counter = 0;
			}
			else
			{
				s[k] = m - 10;
				counter = 1;
			}

			if (i == 0 && j != 0)
			{
				i++;
				s1 = tangible.StringFunctions.changeCharacter(s1, 0, '0');
			}
			else if (i != 0 && j == 0)
			{
				j++;
				s2 = tangible.StringFunctions.changeCharacter(s2, 0, '0');
			}
			else if (i == 0 && j == 0 && counter == 0)
			{
				i++;
				j++;
				s2 = tangible.StringFunctions.changeCharacter(s2, 0, '0');
				s1 = tangible.StringFunctions.changeCharacter(s1, 0, '0');
				sign = 0;
			}
			else if (i == 0 && j == 0)
			{
				i++;
				j++;
				s2 = tangible.StringFunctions.changeCharacter(s2, 0, '0');
				s1 = tangible.StringFunctions.changeCharacter(s1, 0, '0');
			}
		}
		c = s.length();
		for (p = c - 1;p >= 0;p--)
		{
			if (s[p] == 48 && x == 1)
			{
				continue;
			}
			System.out.printf("%c",s[p]);
			x = 0;
		}
		if (x == 1)
		{
			System.out.print("0");
		}
		System.out.print("\n");
	}
}

