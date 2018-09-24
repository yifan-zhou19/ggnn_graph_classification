package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String x = new String(new char[100]);
		int len;
		int n = 0;
		int at = 1;
		int i;
		int j;
		int t = 0;
		int m = 0;
		s = new Scanner(System.in).nextLine(),gets(a),gets(b);
		s += " ";
		len = s.length();
		for (i = 0;i < len + 1;i++)
		{
			if (s.charAt(i) == ' ')
			{
				at = 0;
			}
			if (at == 0)
			{
				at = 1;
				n++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = t;;j++)
			{
				if (s.charAt(j) != ' ')
				{
					x = tangible.StringFunctions.changeCharacter(x, j - t, s.charAt(j));
				}
				else
				{
					x = tangible.StringFunctions.changeCharacter(x, j - t, '\0');
					t = j + 1;
					m++;
					break;
				}
			}
			if (strcmp(x,a) == 0)
			{
				x = b;
			}
			System.out.printf("%s",x);
			if (m != n)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}







}

