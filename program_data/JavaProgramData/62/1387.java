package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[999]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
	int i;
	int j;
	s = new Scanner(System.in).nextLine();
	p = s;
	for (; * p != '\0';p++)
	{
	if (*p != ' ')
	{
	System.out.printf("%c",*p);
	}
	else
	{
	if (*p == ' ' && *(p + 1) != ' ')
	{
	System.out.printf("%c",*p);
	}
	}
	}
	}
}
