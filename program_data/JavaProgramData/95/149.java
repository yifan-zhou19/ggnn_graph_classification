package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s = new String(new char[80]);
		String s1 = new String(new char[80]);
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String l;
		for (p = s; * p != '\0';p++)
		{
			if (*p >= 65 && *p <= 90)
			{
				*p = p + 32;
			}
		}
		for (l = s1; l != '\0';l++)
		{
			if (l >= 65 && l <= 90)
			{
				l = l.Substring(32);
			}
		}
		int cmp;
		cmp = strcmp(s,s1);
		if (cmp < 0)
		{
			System.out.print("<");
		}
		else if (cmp == 0)
		{
			System.out.print("=");
		}
		else if (cmp > 0)
		{
			System.out.print(">");
		}
	}
}
