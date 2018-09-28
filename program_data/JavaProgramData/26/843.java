package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
		str1 = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		for (p1 = str1,p2 = str2; * p1 != '\0';p1++)
		{
			if (*p1 != ' ')
			{
				*p2 = p1;
				p2++;
			}
			if ((*p1 == ' ') && (*(p1 + 1) != ' '))
			{
				*p2 = ' ';
				p2++;
			}
		}
		*p2 = '\0';
		System.out.print(str2);
		System.out.print("\n");
		return 0;
	}
}
