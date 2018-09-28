package <missing>;

public class GlobalMembers
{
	//*****************************
	//* ???????????    *
	//* ??????              *
	//* ???2010-12-8           *
	//* ??????????      *
	//*****************************
	public static int Main()
	{
		String s = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = s;
		int i = 0;
		s = new Scanner(System.in).nextLine();
		while (p - s.Substring(1) <= s.length())
		{
			if (*p != ' ')
			{
				i = 0;
			}
			if (*p == ' ')
			{
				i++;
			}
			if (i <= 1)
			{
				System.out.print(p);
			}
			p++;
		}
		return 0;
	}
}
