package <missing>;

public class GlobalMembers
{
	// ?????.cpp : Defines the entry point for the console application.
	// ???????????str?substr??substr???str?ASCII????????????????????????
	public static int Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = str;
		String p2 = substr;
		int i = 0;
		int max = 0;
		char maxchar;
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0) //????str
		{
			substr = ConsoleInput.readToWhiteSpace(true).charAt(0);
			maxchar = str.charAt(0);
			p1 = str.charAt(0);
			for (i = 0; * (p1 + i) != '\0';i++) //??str??????
			{
				if (*(p1 + i) > maxchar)
				{
					maxchar = (p1 + i);
					max = i;
				}
			}
			for (p1 = str.charAt(0);p1 <= str.charAt(0) + max;p1++) //??
			{
				System.out.print(p1);
			}
			System.out.print(p2);
			for (p1 = str.charAt(0) + max + 1; * p1 != '\0';p1++)
			{
				System.out.print(p1);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

