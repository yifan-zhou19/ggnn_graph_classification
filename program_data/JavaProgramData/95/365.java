package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[80]);
		String t = new String(new char[80]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		s = new Scanner(System.in).nextLine();
		t = new Scanner(System.in).nextLine();
		p = s;
		q = t;
		for (; * p != 0;p++)
		{
			if (*p <= 'Z' && *p >= 'A')
			{
				*p = p + 32;
			}
		}
		for (; q != 0;q++)
		{
			if (q <= 'Z' && q >= 'A')
			{
				q = q.Substring(32);
			}
		}

		if (strcmp(s,t) > 0)
		{
			System.out.print(">");
		}
		else if (strcmp(s,t) < 0)
		{
			System.out.print("<");
		}
		else
		{
			System.out.print("=");
		}

	}
}
