package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int l;
	int l1;
	String s = new String(new char[256]);
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	String t = new String(new char[256]);
	s = new Scanner(System.in).nextLine();
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	l = s.length();
	l1 = a.length();
	for (i = 0;i <= l - 1;i++)
	{
		for (j = 0;j <= l1 - 1;j++)
		{
		t = tangible.StringFunctions.changeCharacter(t, j, s.charAt(i + j));
		}
	if (strcmp(t,a) == 0)
	{
		for (j = 0;j <= l1 - 1;j++)
		{
		s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
		}
	break;
	}
	}
	System.out.println(s);
	return 0;
	}

}

