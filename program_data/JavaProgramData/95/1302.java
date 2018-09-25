package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 's', so pointers on this parameter are left unchanged:
	public static void toLowerCase(char * s)
	{
		while (*s != null)
		{
			if (Character.isUpperCase(*s))
			{
				*s = 'a' + *s - 'A';
			}
			s = s.Substring(1);
		}
	}
	public static int Main()
	{
		String s1 = new String(new char[128]);
		String s2 = new String(new char[128]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		toLowerCase(s1);
		toLowerCase(s2);
		int res = strcmp(s1, s2);
		if (res < 0)
		{
			System.out.print("<");
		}
		else if (res == 0)
		{
			System.out.print("=");
		}
		else
		{
			System.out.print(">");
		}
	}

}
