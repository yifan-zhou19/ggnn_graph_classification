package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a = new String(new char[100]);
		int leap = 0;
		p = a;
		do
		{
			cin.get(*p);
			if (*p != ' ')
			{
				System.out.print(p);
				leap = 0;
			}
			if (*p == ' ' && leap == 0)
			{
				System.out.print(p);
				leap = 1;
			}
		}while (*p++ != '\n');
		System.out.print("\n");
		return 0;
	}
}
