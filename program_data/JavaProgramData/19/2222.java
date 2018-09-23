package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100 + 1]);
		String a = new String(new char[100 + 1]);
		String b = new String(new char[100 + 1]);
		String[] ss = new String[100];
		int i;
		int n = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ss[n++] = s;
	ss[0] = s;
	n = 1;
	for (i = 0; s.charAt(i) != '\0'; i++)
	{
	if (s.charAt(i) == ' ')
	{
	s = tangible.StringFunctions.changeCharacter(s, i, '\0');
	ss[n] = s.charAt(i + 1);
	n++;
	}
	}
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			if (strcmp(ss[i],a) == 0)
			{
				System.out.printf("%s",b);
			}
			else
			{
				System.out.print(ss[i]);
			}
		}
		return 0;
	}

}

