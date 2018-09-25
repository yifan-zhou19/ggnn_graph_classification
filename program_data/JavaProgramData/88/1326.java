import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int i;
		int n;
		str = new Scanner(System.in).nextLine();
		p = str;
		n = str.length(); //???????
		for (i = 0;i < n;i++)
		{
			if (*p - '0' >= 0 && *p - '0' <= 9 && *(p + 1) - '0' >= 0 && *(p + 1) - '0' <= 9) //????????
			{
				System.out.print(p);
			}
			else if (*p - '0' >= 0 && *p - '0' <= 9 && (*(p + 1) - '0' < 0 || *(p + 1) - '0'> 9)) //*p???????????
			{
				System.out.print(p);
				System.out.print("\n");
			}
			p++;
		}
		return 0;
	}
}
