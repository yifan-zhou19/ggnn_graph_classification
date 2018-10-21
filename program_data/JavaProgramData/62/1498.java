package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String str = new String(new char[1000]);
		p = str;
		p = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				System.out.printf("%c",*p);
			}
			else if ((*p == ' ') && (*(p + 1) != ' '))
			{
				System.out.printf("%c",*p);
			}
		}
	}
}
