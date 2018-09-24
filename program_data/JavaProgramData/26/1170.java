package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		int i;
		s = new Scanner(System.in).nextLine();
		p = s;
		while (*p != '\0')
		{
			if (*p == ' ')
			{
				q = p + 1;
				if (q == ' ')
				{
					*p = '!';
				}
			}
			p++;
		}

		i = 0;
		while (s.charAt(i) != '\0')
		{
			if (s.charAt(i) != '!')
			{
				System.out.printf("%c",s.charAt(i));
			}
			i++;
		}

		return 0;
	}


}
