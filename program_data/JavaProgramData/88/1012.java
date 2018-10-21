import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		p = a;
		int i = 0;
		int j = 0;
		while (*p != '\0')
		{
			if (*p == '-')
			{
				i = 1;
				p++;
				if (j == 1)
				{
					System.out.print("\n");
					j = 0;
				}
			}
			else if (((*p == '0') || (*p == '1') || (*p == '2') || (*p == '3') || (*p == '4') || (*p == '5') || (*p == '6') || (*p == '7') || (*p == '8') || (*p == '9')) && (i == 0))
			{
				System.out.print(p);
				p++;
				j = 1;
			}
			else if (((*p == '0') || (*p == '1') || (*p == '2') || (*p == '3') || (*p == '4') || (*p == '5') || (*p == '6') || (*p == '7') || (*p == '8') || (*p == '9')) && (i == 1))
			{
			p++;
			}
			else
			{
				p++;
				i = 0;
				if (j == 1)
				{
					System.out.print("\n");
					j = 0;
				}
			}
		}
		return 0;
	}
}
