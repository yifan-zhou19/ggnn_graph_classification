package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int t;
		int i;
		int j;
		int n;
		String s1 = new String(new char[33]);
		String s2 = new String(new char[33]);
		char temp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		n = s1.length();
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
			{
				t = t * a + (s1.charAt(i) - '0');
			}
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				t = t * a + (s1.charAt(i) - 'a' + 10);
			}
			if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				t = t * a + (s1.charAt(i) - 'A' + 10);
			}
		}
		i = 0;
		do
		{
			if (t % b >= 0 && t % b <= 9)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, t % b + '0');
			}
			if (t % b >= 10 && t % b < 36)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, t % b - 10 + 'A');
			}
			t = t / b;
			i++;
		} while (t != 0);
		s2 = tangible.StringFunctions.changeCharacter(s2, i, '\0');
		for (j = i - 1;j >= i / 2;j--)
		{
			temp = s2.charAt(j);
			s2 = tangible.StringFunctions.changeCharacter(s2, j, s2.charAt(i - 1 - j));
			s2 = tangible.StringFunctions.changeCharacter(s2, i - 1 - j, temp);
		}
		System.out.printf("%s",s2);
	}
}

