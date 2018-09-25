package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p1', so pointers on this parameter are left unchanged:
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p2', so pointers on this parameter are left unchanged:
	public static int cmp(char * p1, char * p2)
	{
			 if (Character.isLowerCase(*p1))
			 {
				 *p1 -= 32;
			 }
			 if (Character.isLowerCase(*p2))
			 {
				 *p2 -= 32;
			 }
		while (*p1 == *p2 && *p1 != '\0' && *p2 != '\0')
		{
			p1 = p1.Substring(1);
			p2 = p2.Substring(1);
			if (Character.isLowerCase(*p1))
			{
				*p1 -= 32;
			}
			if (Character.isLowerCase(*p2))
			{
				*p2 -= 32;
			}
		}
		if (*p1 != '\0' && *p2 != '\0')
		{
			return (*p1 - *p2);
		}
		else if (*p1 != '\0')
		{
			return 1;
		}
		else if (*p2 != '\0')
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		if (cmp(str1, str2) == 0)
		{
			System.out.print("=");
		}
		else if (cmp(str1, str2) > 0)
		{
			System.out.print(">");
		}
		else
		{
			System.out.print("<");
		}
		return 0;
	}
}
