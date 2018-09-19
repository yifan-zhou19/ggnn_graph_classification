package <missing>;

public class GlobalMembers
{
	public static String str1 = new String(new char[150]);
	public static String str2 = new String(new char[50]);
	public static String str3 = new String(new char[50]);
	public static String p1 = str1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * p2 = str2;
	public static String p3 = str3;

	public static int compare(tangible.RefObject<String> local, int len)
	{
		p2 = str2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int flag = 1;
		for (p = local.argValue; * p2 != '\0' && flag == 1 && p < local.argValue.Substring(len);p2++, p++)
		{
			if (*p != *p2)
			{
				flag = 0;
			}
		}
		if (*p2 == '\0' && p == local.argValue.Substring(len))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static int Main()
	{
		String newline = new String(new char[150]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * news = newline;
		String local;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int flag = 1;
		int len = 0;
		p1 = new Scanner(System.in).nextLine();
		p2 = new Scanner(System.in).nextLine();
		p3 = new Scanner(System.in).nextLine();
		for (p1 = str1;p1 <= str1 + str1.length();p1++)
		{
			if (Character.isLetter(p1))
			{
				if (flag == 1)
				{
					flag = 0,len = 1,local = p1;
				}
				else
				{
					len++;
				}
			}
			else
			{
				if (flag == 0)
				{
					flag = 1;
				tangible.RefObject<String> tempRef_local = new tangible.RefObject<String>(local);
					if (compare(tempRef_local, len) != 0)
					{
						local = tempRef_local.argValue;
						for (p3 = str3; p3 != '\0';p3++,news++)
						{
							*news = p3;
						}
					}
					else
					{
						local = tempRef_local.argValue;
						for (p = local;p < local.Substring(len);p++,news++)
						{
							*news = p;
						}
					}
					*news++= p1;
				}
			}
		}
		*news = '\0';
		for (news = newline; * news != '\0';news++)
		{
			System.out.printf("%c",*news);
		}

		return 0;

	}

}

