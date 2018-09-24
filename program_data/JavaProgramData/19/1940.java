package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String s = new String(new char[100]);
		final String ss = "";
		final String d = "";
		int i;
		int j;
		int m;
		int n;
		int t;
		int k;
		int l;
		int p;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		t = s.length();
		n = 0;
		m = 0;
		for (i = 0;i < t;i++)
		{
			if (s.charAt(i) != ' ' && s.charAt(i) != '\0')
			{
				ss.charAt(m)[n] = s.charAt(i);
				n++;
			}
			else
			{
				m++;
				n = 0;
			}
		}
		for (j = 0;j <= m;j++)
		{
			if (strcmp(ss.charAt(j),a) == 0)
			{
				ss = tangible.StringFunctions.changeCharacter(ss, j, b);
			}
		}
		k = 0;
		l = 0;
		for (p = 0;;p++)
		{
			if (ss.charAt(k)[l] == '\0' && k != m)
			{

					d = tangible.StringFunctions.changeCharacter(d, p, ' ');
					k++;
					l = 0;

			}
			else if (ss.charAt(k)[l] != '\0')
			{
				d = tangible.StringFunctions.changeCharacter(d, p, ss.charAt(k)[l]);
				l++;
			}
			else
			{
				break;
			}
		}
		System.out.println(d);
		return 0;
	}




}

