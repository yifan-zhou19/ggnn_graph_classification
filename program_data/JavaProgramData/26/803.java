package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int i;
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		str = new Scanner(System.in).nextLine();
		p = str;
		for (i = 0;i < str.length();i++)
		{
				if (*p == ' ' && m == 1)
				{
					;
				}
				else
				{
					System.out.print(p);
				}
				if (*p == ' ')
				{
					m = 1;
				}
				else
				{
					m = 0;
				}
				*p++;
		}
		return 0;
	}
}
