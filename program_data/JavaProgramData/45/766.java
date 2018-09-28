package <missing>;

public class GlobalMembers
{
	public static int compare(String a1, String a2, int a, int b)
	{
		int m;
		int n = 0;
		for (m = 0;m < b;m++)
		{
			if (!a1[m].equals(a2[m + a]))
			{
				n++;
			}
		}
			if (n == 0)
			{
				return (1);
			}
			else
			{
				return (0);
			}
	}
	public static void Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[50]);
		String s2 = new String(new char[50]);
		s = new Scanner(System.in).nextLine();
		int a;
		int b;
		int c;
		int d;
		int e;
		a = 0;
		e = s.length();
		do
		{
			s1 = tangible.StringFunctions.changeCharacter(s1, a, s.charAt(a));
			a++;
		} while (s.charAt(a) != ' ');
		d = a + 1;
		b = 0;
		do
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, b, s.charAt(d));
			d++;
			b++;
		} while (d != e);
		for (c = 0;c < b;c++)
		{
			if (compare(s1, s2, c, a) != 0)
			{
				System.out.printf("%d",c);
			break;
			}
		}
	}
}

