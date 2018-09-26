import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[35]); //?????
		a = new Scanner(System.in).nextLine();
		int len = a.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = a; //???????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = a;
		while (p1 < a.Substring(len))
		{
			if (*p1 >= '0' && *p2 <= '9')
			{
				while (*p2 >= '0' && *p2 <= '9')
				{
					p2++;
				}
				*p2 = 0; // ??0
				System.out.print(p1);
				System.out.print("\n");
				p1 = p2; //????
			}
			else
			{
				p1++;
				p2 = p1;
			}
		}
		return 0;
	}

}
