package <missing>;

public class GlobalMembers
{
	public static void Main()
	{

		String str = new String(new char[102]);
		String str1 = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		str = new Scanner(System.in).nextLine();
		p = str;
		q = str1;
		for (p = str; * (p + 1) != '\0';)
		{
			*q++=*p + (*++p);
		}
		if (*(p + 1) == '\0')
		{
			*q++=(*p) + *str;
		}
		*q = '\0';
		for (q = str1; * q != '\0';q++)
		{
		System.out.printf("%c",*q);
		}
	}

}
