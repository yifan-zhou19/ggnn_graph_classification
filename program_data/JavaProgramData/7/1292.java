package <missing>;

public class GlobalMembers
{
	public static int cmp(int i, String a, String b)
	{
		int k;
		for (k = 0; !b[k].equals('\0');i++,k++)
		{
			if (!a[i].equals(b[k]))
			{
			break;
			}
		}
		if (b[k].equals('\0'))
		{
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int k;
		String s = new String(new char[256]);
		String subs = new String(new char[256]);
		String re = new String(new char[256]);
		s = new Scanner(System.in).nextLine();
		subs = new Scanner(System.in).nextLine();
		re = new Scanner(System.in).nextLine();
		for (i = 0, n = 0;n == 0 && s.charAt(i) != '\0';i++)
		{
			if (s.charAt(i) == subs.charAt(0))
			{
			n = cmp(i, s, subs);
			}
		}
		if (n == 1)
		{
			for (i = i - 1,k = 0;re.charAt(k) != '\0';i++,k++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, re.charAt(k));
			}
		}
		System.out.printf("%s\n",s);
	}






}

