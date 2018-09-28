import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * p;
	public static int s;
	public static int Main()
	{
		c = new Scanner(System.in).nextLine();
		s = -1; //?s????????????????????
		p = c;
		do
		{
			if (*p <= '9' && *p >= '0') //??????????s??
			{
				if (s == -1)
				{
					s = 0;
				}
				s = s * 10 + *p - '0';
			}
			else //????????????
			{
				if (s != -1)
				{
					System.out.print(s);
					System.out.print("\n");
				}
				s = -1;
			}
		}while (*p++ != null);
		return 0;
	}

}
