package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[16]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String pl;
		for (p1 = str;p1 <= str.Substring(9);p1++)
		{
			*p1 = '\0';
		}
		for (p2 = substr;p2 <= substr.Substring(2);p2++)
		{
			*p2 = '\0';
		}
		for (;;)
		{
			pl = str;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				str = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				substr = tempVar2.charAt(0);
			}
			if (pl == '\0')
			{
				break;
			}
			for (p1 = str.Substring(1);p1 <= str.Substring(9);p1++)
			{
				if (*p1 > pl)
				{
					pl = p1;
				}
			}
			for (p1 = str;p1 <= pl;p1++)
			{
				System.out.printf("%c",*p1);
				*p1 = '\0';
			}
			for (p2 = substr;p2 <= substr.Substring(2);p2++)
			{
				System.out.printf("%c",*p2);
				*p2 = '\0';
			}
			for (;p1 <= str.Substring(9);p1++)
			{
				if (*p1 == '\0')
				{
					break;
				}
				System.out.printf("%c",*p1);
				*p1 = '\0';
			}
			System.out.print("\n");
		}
	}
}

