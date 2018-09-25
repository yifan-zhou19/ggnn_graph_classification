package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[200]);
	public static void match(String a)
	{

		int s;
		s = a.length();
		if (s == 0)
		{
			return;
		}
		int i;
		int j;
		int check = 0;
		for (i = 0;i < s - 1;i++)
		{
			if (a[i].equals('('))
			{
				for (j = i + 1;j < s && a[j].equals(' ');j++)
				{
					;
				}
				if (j < s)
				{
					if (a[j].equals(')'))
					{
						check = 1;
						break;
					}
				}
			}
		}
		if (check == 1)
		{
			a[i] = ' ';
			a[j] = ' ';
			match(a);
		}
		if (check == 0)
		{
			return;
		}
	}
	public static int Main()
	{

		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char temp;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			temp = tempVar2.charAt(0);
		}
		while (n-- != 0)
		{

			a = new Scanner(System.in).nextLine();
			System.out.println(a);
			int s;
			s = a.length();
			int i;
			for (i = 0;i < s;i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			match(a);
			for (i = 0;i < s;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else if (a.charAt(i) == ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
			}
			System.out.println(a);
		}
		return 0;
	}
}

