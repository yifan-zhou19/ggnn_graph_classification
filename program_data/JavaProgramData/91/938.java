import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int n;
		int i;
		s = new Scanner(System.in).nextLine();
		n = s.length();
		p = s;
		q = a;
		for (p, q ; p < a.Substring(n) - 1, q < a.Substring(n) - 1 ; p++, q++)
		{
			*q = p + *(p + 1);
		}
		*(q) = p + s.charAt(0);
		for (i = 0 ; i < n ; i++)
		{
			System.out.print(a.charAt(i));
		}
		System.out.print("\n");

		return 0;
	}


}
