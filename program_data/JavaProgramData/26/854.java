package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = str;
		str = new Scanner(System.in).nextLine();
		int c = str.length();
		for (p = str;p < str.Substring(c) - 1;p++)
		{
		  if (*p == ' ' && *(p + 1) == ' ')
		  {
			  continue;
		  }
		  if (*p == ' ' && *(p + 1) != ' ')
		  {
			  System.out.print(' ');
			  continue;
		  }
		  if (*p != ' ')
		  {
			  System.out.print(p);
		  }

		}
		System.out.print(p);
		return 0;
	}
}
