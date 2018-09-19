package <missing>;

public class GlobalMembers
{
	public static void f(tangible.RefObject<String> s, tangible.RefObject<String> a, tangible.RefObject<String> b, int n1, int n2)
	{
			int i;
			int j;
			int k;
			int m;
			int n;
			String c = new String(new char[100]);
			String d = new String(new char[100]);
			for (i = 0,j = 0; * (s.argValue.Substring(j)) != '\0';)
			{
					int flag = 1;
					for (m = 0; * (s.argValue.Substring(j)) != ' ' && s.argValue.charAt(j) != '\0';m++, j++)
					{
							d = tangible.StringFunctions.changeCharacter(d, m, s.argValue.charAt(j));
							if (s.argValue.charAt(j + 1) == '\0')
							{
									flag = 0;
							}
					}
					d = tangible.StringFunctions.changeCharacter(d, m, '\0');
					j = j - m;
					if (strcmp(d,a.argValue) != 0)
					{
							for (n = 0;n <= m;i++,j++,n++)
							{
									*(c.Substring(i)) = *(s.argValue.Substring(j));
							}
					}
					else
					{
							for (k = 0,n = 0;n < n2;i++,k++,n++)
							{
									*(c.Substring(i)) = *(b.argValue.Substring(k));
							}
							j = j + n1;
					}
					if (flag == 1)
					{
						*(c.Substring(i)) = ' ';
					}
					else
					{
						break;
					}
			}
			*(c.Substring(i)) = '\0';
			System.out.printf("%s",c);
	}

	public static void Main()
	{
			String s = new String(new char[100]);
			String a = new String(new char[100]);
			String b = new String(new char[100]);
			int n1;
			int n2;
			s = new Scanner(System.in).nextLine();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			n1 = a.length();
			n2 = b.length();
		tangible.RefObject<String> tempRef_s = new tangible.RefObject<String>(s);
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			f(tempRef_s, tempRef_a, tempRef_b, n1, n2);
			b = tempRef_b.argValue;
			a = tempRef_a.argValue;
			s = tempRef_s.argValue;
	}
}

