package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		int i;
		int d;
		c = new Scanner(System.in).nextLine();
		d = c.length();
		for (a = c.Substring(0);a <= c.Substring(d) - 1;a++)
		{
				if (Character.isDigit(*a))
				{
				System.out.printf("%c",*a);
				}
				else if (!Character.isDigit(*a) && a > (c.Substring(0)) && Character.isDigit(*(a - 1)))
				{
					System.out.print("\n");
				}
		}
		return 0;
	}
}
