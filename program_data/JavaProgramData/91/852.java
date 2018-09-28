import java.util.*;

package <missing>;

public class GlobalMembers
{
	//??????????????????....

	//**************************** 
	//*??????????      *
	//*????? 1200012708     *
	//*???2012?12?1?       *
	//****************************

	public static int Main()
	{
		String s = new String(new char[105]); // pc????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pc = s;
		int l;
		int i;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		s = tangible.StringFunctions.changeCharacter(s, l, s.charAt(0)); // ?????????????????
		for (i = 0; i < l; i++)
		{
			System.out.print((char)(*pc + *(++pc)));
		}
		System.out.print("\n");

		return 0;
	}
}

