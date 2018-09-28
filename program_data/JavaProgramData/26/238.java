import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	  *file  ???????
	  *author ???
	  *date   12.7
	  *function		???????????????????????????????????
	*/
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		int lena;
		int spacenum;
		int deletenum = 0;
		a = new Scanner(System.in).nextLine();
		lena = a.length();
		for (p = a; p < a.Substring(lena); p++)
		{
			if (*p != ' ')
			{
				spacenum = 0;
			}
			else
			{
				spacenum++;
				if (spacenum > 1)
				{
					deletenum++;
					for (q = p; q < a.Substring(lena) - deletenum; q++)
					{
						*q = (q + 1);
					}
					p--;
				}
			}
		}
		for (p = a; p < a.Substring(lena) - deletenum; p++)
		{
			System.out.print(p);
		}
		System.out.print("\n");
		return 0;
	}
}
