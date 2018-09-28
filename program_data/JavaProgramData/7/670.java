package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String zfc = new String(new char[100]);
		String s2 = new String(new char[200]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int k;
		int l;
		int la;
		int lb;
		int ls;
		int th = 200;
		ls = s.length();
		la = a.length();
		lb = b.length();
		for (i = 0;i < ls;i++)
		{
			l = 0;
			for (k = i;k < la + i;k++)
			{
				zfc = tangible.StringFunctions.changeCharacter(zfc, l, s.charAt(k));
				l++;
			}
			zfc = tangible.StringFunctions.changeCharacter(zfc, l, '\0');
			if (strcmp(zfc,a) == 0)
			{
			   th = i;
			   break;
			}
		}
		if (th < 200)
		{
		for (i = 0;i < th;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s.charAt(i));
		}
		for (i = th;i < th + lb;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, b.charAt(i - th));
		}
		for (i = th + lb;i < ls + lb - la;i++)
		{
			s2 = tangible.StringFunctions.changeCharacter(s2, i, s.charAt(i - lb + la));
		}
		s2 = tangible.StringFunctions.changeCharacter(s2, ls + lb - la, '\0');
		System.out.println(s2);
		}
		if (th == 200)
		{
			System.out.println(s);
		}

		return 0;
	}

}

