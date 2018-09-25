package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int ls;
		int la;
		int lb;
		int i;
		int j;
		int m;
		ls = s.length();
		la = a.length();
		lb = b.length();
		for (i = 0;i < ls;i++)
		{
			if (s.charAt(i) == a.charAt(0) && s.charAt(i - 1) == ' ' || s.charAt(0) == a.charAt(0))
			{
				m = 1;
				for (j = 1;j < la;j++)
				{
					if (s.charAt(i + j) != a.charAt(j))
					{
						m = 2;
					}
				}
				if (m == 1)
				{
					String x = new String(new char[100]);
					x = s;
					for (j = i;j < i + lb;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(j - i));
					}
					for (j = i + lb;j < ls + lb - la;j++)
					{
						s = tangible.StringFunctions.changeCharacter(s, j, x.charAt(j - lb + la));
					}
					ls = ls - la + lb;
					i = i + lb - 1;
				}
			}
		}
		for (i = 0;i < ls;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}

}

