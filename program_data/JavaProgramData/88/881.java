package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * a;
		a = str;
		str = new Scanner(System.in).nextLine();
		for (;a < str.Substring(30);a++)
		{
			if ((*a >= '0') && (*a <= '9'))
			{
				System.out.printf("%c",*a);
			a++;
			break;
			}
		}
		for (;a < str.Substring(30);a++)
		{
			if (((*a >= '0') && (*a <= '9')) && ((*(a - 1) >= '0') && (*(a - 1) <= '9')))
			{
				System.out.printf("%c",*a);
			}
			else if (((*a >= '0') && (*a <= '9')) && ((*(a - 1) < '0') || (*(a - 1)>'9')))
			{
				System.out.print("\n");
				System.out.printf("%c",*a);
			}
		}
	}
}
