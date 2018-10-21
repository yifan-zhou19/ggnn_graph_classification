import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		s = new Scanner(System.in).nextLine();
		for (p = s, q = s1; p < s + s.length() - 1; p++, q++)
		{
			*q = p + *(p + 1);
		}
		*q = p + s.charAt(0);
		for (int i = 0; i <= s.length() - 1; i++)
		{
			System.out.print(s1.charAt(i));
		}
	//	cout << s1 << endl;
		return 0;
	}
}
