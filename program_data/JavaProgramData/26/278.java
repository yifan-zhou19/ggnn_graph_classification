import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ???????
	public static int Main()
	{
		int i; // i????
		String a = new String(new char[101]); // ??a??????
		a = new Scanner(System.in).nextLine(); // ????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a; // ?????????
		for (i = 0; i < a.length(); i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ') // ????
			{
				p++;
			}
			else // ??????
			{
				System.out.print(p++);
			}
		}
		return 0;
	}

}
