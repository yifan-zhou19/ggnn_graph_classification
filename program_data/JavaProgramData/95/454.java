package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void largen(char s[]);
		int flag;
		String s1 = new String(new char[80]);
		String s2 = new String(new char[80]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		largen(s1);
		largen(s2);
		flag = strcmp(s1,s2);
		if (flag > 0)
		{
			System.out.print(">\n");
		}
		else if (flag < 0)
		{
			System.out.print("<\n");
		}
		else
		{
			System.out.print("=\n");
		}
		return 0;
	}

	public static void largen(String s)
	{
		int i;
		for (i = 0;;i++)
		{
			if (s[i].compareTo('a') >= 0 && s[i].compareTo('z') <= 0)
			{
				s[i] -= 32;
			}
			else if (s[i].equals('\0'))
			{
				break;
			}
		}
	}
}
