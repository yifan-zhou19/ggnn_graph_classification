import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
		a = new Scanner(System.in).nextLine();
		int length = a.length();
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		for (int i = 0 ; i < length ; i++, p++)
		{
			if (!(((int) * p >= '0') && ((int) * p <= '9')))
			{
				 if (flag == 0)
				 {
					System.out.print("\n");
				 }
				flag = 1;
			}
			else
			{
				System.out.print(p);
				flag = 0;
			}
		}
		return 0;
	}

}
