package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int a;
		int b;
		int l;
		int s = 0;
		int[] ss = new int[1001];
		String s1 = new String(new char[1001]);
		String s2 = new String(new char[1001]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = s1.length();
		for (i = 0;i < 1000;i = i + 1)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, ',');
		}
		for (i = 0;i < l;i = i + 1)
		{
			if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9')
			{
				ss[i + 1] = ss[i] * a + s1.charAt(i) - '0';
			}
			else if (s1.charAt(i) >= 'A' && s1.charAt(i) <= 'Z')
			{
				ss[i + 1] = ss[i] * a + s1.charAt(i) - 'A' + 10;
			}
			else
			{
				ss[i + 1] = ss[i] * a + s1.charAt(i) - 'a' + 10;
			}
		}
		s = ss[l];
		for (i = 0;i < 1000;i = i + 1)
		{
			j = s % b;
			if (j <= 9)
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, '0' + j);
			}
			else
			{
				s2 = tangible.StringFunctions.changeCharacter(s2, i, 'A' + j - 10);
			}
			s = s / b;
			if (s == 0)
			{
				break;
			}
		}
		for (i = 0;i < 1000;i = i + 1)
		{
			if (s2.charAt(i) == ',')
			{
				break;
			}
		}
		for (i = i - 1;i >= 0;i = i - 1)
		{
			System.out.print(s2.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

