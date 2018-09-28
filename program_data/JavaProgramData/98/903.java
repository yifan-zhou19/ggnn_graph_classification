package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *f(char *p);
		char f = char * p;
		String b = new String(new char[3]);
		String c = new String(new char[10000]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int i;
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		p = c;
		while ((p.Substring(79)) < c + c.length())
		{
		tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
			for (q = p;q < f(tempRef_p);q++)
			{
				p = tempRef_p.argValue;
				System.out.printf("%c",*q);
			}
			p = tempRef_p.argValue;
			System.out.print("\n");
		tangible.RefObject<String> tempRef_p2 = new tangible.RefObject<String>(p);
			p = f(tempRef_p2) + 1;
			p = tempRef_p2.argValue;
		}
		for (q = p;q < c + c.length();q++)
		{
			System.out.printf("%c",*q);
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			i = Integer.parseInt(tempVar);
		}
	}

	public static String f(tangible.RefObject<String> p)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		for (s = p.argValue.Substring(80);s > p.argValue;s--)
		{
			if (*s == 32)
			{
				break;
			}
		}
		return s;
	}
}

