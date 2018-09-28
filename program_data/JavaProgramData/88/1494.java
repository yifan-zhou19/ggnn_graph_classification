import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		str = new Scanner(System.in).nextLine();
		int len;
		len = str.length();
		p = str;
		q = str;
		for (i = 0; i < len; i++)
		{
			 if (*p - '0' >= 0 && *p - '0' <= 9)
			 {
					p++;
			 }
			 else
			 {
					while (*q != *p)
					{
							System.out.print(q++);
					}
					if (*(q - 1) - '0' >= 0 && *(q - 1) - '0' <= 9)
					{
							System.out.print("\n");
					}
					p++;
					q = p;
			 }
		}
		if (*(p - 1) - '0' >= 0 && *(p - 1) - '0' <= 9)
		{
			  while (*q != *p)
			  {
					System.out.print(q++);
			  }
			  System.out.print("\n");
		}
		return 0;
	}

}
