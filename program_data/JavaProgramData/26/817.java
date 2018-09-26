package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String t = new String(new char[150]);
	String x = new String(new char[150]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * pt = t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * px = x;
	t = new Scanner(System.in).nextLine();
	for (; * pt != '\0';pt++,px++)
	{
		if ((*pt != ' ') || ((*pt = ' ') && (*(pt - 1) != ' ')))
		{

		*px = pt;
		}
		else
		{
			px--;
		}

	}
	*px = '\0';
	System.out.printf("%s",x);
	return 0;
	}
}
