import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*********************************
	// ???2.cpp
	// ??????? 
	// ?????? 1300012894
	// ???2013.12.11
	//*********************************
	public static int Main()
	{
		int n; // ????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String a = new String(new char[10000]); // ????
		a = new Scanner(System.in).nextLine(); // ???????????
		a = new Scanner(System.in).nextLine(); // ???????
		String p = null; // ??????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		p = a; // ?????
		q = p.Substring(80);
		while (*q != 0)
		{
			while (*q != ' ') // ???????????????
			{
				q--;
			}
			*q = 0; // ?????
			System.out.print(p);
			System.out.print("\n");
			p = q + 1; // ???????
			q = p.Substring(80);
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

