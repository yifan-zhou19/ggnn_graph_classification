package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int t1;
		int t2;
		int t3;
		int m;
		int i;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		t1 = s.length();
		t2 = a.length();
		t3 = b.length();
		for (i = 0;s.charAt(i);i++)
		{
			m = -1;
			if (s.charAt(i) == a.charAt(0) && (s.charAt(i - 1) == ' ') || i == 0) //:???s??????
			{
				for (int j = 0;j < t2;j++)
				{
					if (s.charAt(i + j) == a.charAt(j) && ((s.charAt(i + t2) == ' ' || s.charAt(i + t2) == '\0') || a.charAt(t2) == '\0'))
					{
						m = i;
					}
					else
					{
						m = -1;
						break;
					}
				}
			}
			if (m == i)
			{
				//:cout<<i<<endl;
				if (t3 > t2) //:?b????a???s?????????????
				{
					for (int u = s.length();u >= (t2 + m);u--)
					{
						s = tangible.StringFunctions.changeCharacter(s, u + t3 - t2, s.charAt(u));
					}
					for (int p = m;p < t3 + m;p++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p, b.charAt(p - m));
					}
				}
				else if (t3 <= t2) //:?b????a???a???b????????????????????
				{
					for (int k = m;k < t3 + m;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k, b.charAt(k - m));
					}
					for (int l = t3 + m;l < t2 + m;l++)
					{
						s = tangible.StringFunctions.changeCharacter(s, l, ' ');
					}
					for (int u = t2 + m;u < s.length() - t3 + t2;u++)
					{
						s = tangible.StringFunctions.changeCharacter(s, u - t2 + t3, s.charAt(u));
					}
				}

			}
		}
		System.out.println(s);
		return 0;
	}











}

