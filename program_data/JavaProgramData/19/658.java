package <missing>;

public class GlobalMembers
{
	public static String former = new String(new char[150]);
	public static String zhao = new String(new char[10]);
	public static String huan = new String(new char[10]);
	public static void alter(tangible.RefObject<String> p)
	{

		String p2;
		p2 = p.argValue + zhao.length() + 1;
		String p3 = new String(new char[100]);
		p3 = p2;
		*(p.argValue.Substring(1)) = '\0';
		former += huan;
		former += p3;
	}

	public static int Main()

	{

		int i;

		former = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zhao = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			huan = tempVar2.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		p0 = former;
		for (; * p0 != '\0';p0++)
		{
			if (*p0 == ' ' && *(p0 + 1) == zhao.charAt(0))
			{
				for (p1 = p0 + 1, i = 0; * p1 == zhao.charAt(i) && zhao.charAt(i) != '\0';p1++, i++)
				{
					;
				}
				if ((*p1 == ' ' || *p1 == '\0') && zhao.charAt(i) == '\0')
				{
				tangible.RefObject<String> tempRef_p0 = new tangible.RefObject<String>(p0);
					alter(tempRef_p0);
					p0 = tempRef_p0.argValue;
				}
			}

		}
		p0 = former;
		for (p1 = p0, i = 0; * p1 == zhao.charAt(i) && zhao.charAt(i) != '\0';p1++, i++)
		{
			;
		}
		if ((*p1 == ' ' || *p1 == '\0') && zhao.charAt(i) == '\0')
		{
			String p2;
			p2 = p0 + zhao.length();
			String p3 = new String(new char[100]);
			p3 = p2;
			huan += p3;
			System.out.printf("%s",huan);
			return 0;


		}





		System.out.printf("%s\n",former);






		return 0;
	}
}

