import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*	???:???????
		???:1000012896 leo
		??:2010.12.13
		????:???????
		*/
	public static int Main()
	{
		String str = new String(new char[101]);
		int flag = 1;
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		for (p = str.Substring(1); p <= str + str.length() - 2;)
		{
			if (* p == ' ' && flag == 0)
			{
				for (q = p; q <= str + str.length() - 1; q++)
				{
					* q =  (q + 1);
				}
				continue;
			}
			if (* p == ' ')
			{
				flag = 0;
			}
			else
			{
				flag = 1;
			}
			p++;
		}
		System.out.print(str);
		return 0;
	}

}
