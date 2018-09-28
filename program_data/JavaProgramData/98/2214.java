import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????? 1300012733 **
	//*???2013?12?14?
	//********************************
	public static int Main()
	{
		int n;
		String a = new String(new char[999999]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
		int l = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		while (p + 80 <= a.Substring(l) - 1)
		{
			p = p + 80;
			if (*p == ' ')
			{
				*p = '\n';
			}
			else
			{
				while (*p != ' ')
				{
					p--;
				}
				*p = '\n';
			}
			p++;
		}
		System.out.print(a);
		return 0;
	}

}

