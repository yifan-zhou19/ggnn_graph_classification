package <missing>;

public class GlobalMembers
{
	public static void peidui(String str, int len)
	{
		int[] a1 = new int[500];
		int n1;
		int n2;
		int m;
		int i1;
		int i2;
		n1 = 0;
		String p;
		String mark = new String(new char[1000]);
		for (m = 0;m <= len - 1;m++)
		{
			if (str[m].equals('('))
			{
				a1[n1] = m;
				n1++;
			}
			mark = tangible.StringFunctions.changeCharacter(mark, m, ' ');
		}
		for (i1 = n1 - 1;i1 >= 0;i1--)
		{
			int exist;
			exist = 0;
			for (i2 = a1[i1] + 1;i2 <= len - 1;i2++)
			{
				if (str[i2].equals(')') && mark.charAt(i2) != 'm')
				{
					exist = 1;
					mark = tangible.StringFunctions.changeCharacter(mark, i2, 'm');
					mark = tangible.StringFunctions.changeCharacter(mark, a1[i1], 'm');
					break;

				}
			}
			if (a1[i1] == len - 1)
			{
				mark = tangible.StringFunctions.changeCharacter(mark, len - 1, '$');
			}

		}
		for (m = 0;m <= len - 1;m++)
		{
			if (str[m].equals('(') && mark.charAt(m) != 'm')
			{
				mark = tangible.StringFunctions.changeCharacter(mark, m, '$');
			}
			if (str[m].equals(')') && mark.charAt(m) != 'm')
			{
				mark = tangible.StringFunctions.changeCharacter(mark, m, '?');
			}
		}
		for (m = 0;m <= len - 1;m++)
		{
			if (mark.charAt(m) == 'm')
			{
				System.out.printf("%c",' ');
			}
			else
			{
				System.out.printf("%c",mark.charAt(m));
			}
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		String s = new String(new char[1000]);
		String s1 = new String(new char[5]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s1 = new Scanner(System.in).nextLine();
		for (i = 1;i <= n;i++)
		{
			s = new Scanner(System.in).nextLine();
			System.out.println(s);
			peidui(s, s.length());

		}
	}
}

