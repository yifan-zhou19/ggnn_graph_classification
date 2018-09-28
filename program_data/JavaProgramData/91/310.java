import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[102]);
		char x;
		s = new Scanner(System.in).nextLine();
		int l;
		l = s.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = s,q = s.Substring(1);q < s.Substring(l);p++,q++)
		{
			x = p + *q;
			System.out.print(x);
		}
		p = s.Substring(l) - 1;
		q = s;
		x = p + *q;
		System.out.print(x);
		return 0;
	}


}
