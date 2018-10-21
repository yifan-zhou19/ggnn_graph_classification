import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int l;
		String a = new String(new char[100]);
		String p = null;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		p = a;
		for (i = 0;i < l - 1;i++)
		{
			if (*(p.Substring(i)) == ' ' && *(p.Substring(i) + 1) == ' ')
			{
				for (q = a.Substring(i) + 1; * q != 0;q++)
				{
					*q = (q + 1);
				}
				i--;
				l--;
			}
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}

}
