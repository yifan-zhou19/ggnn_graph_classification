import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[30]);
		char n = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p = a;
		a = new Scanner(System.in).nextLine();
		for (; * p != '\0';p++)
		{
			n++;
		}
		for (p = a; * p != '\0';p++)
		{
			if (*p - '0' >= 0 && *p - '0' <= 9)
			{
					System.out.print(p);
					{
						if ((p + 1) < (a + n) && (*(p + 1) - '0' < 0 || *(p + 1) - '0'>9))
						{
							 System.out.print("\n");
						}
					}
			}

		}
			 return 0;
	}




}
