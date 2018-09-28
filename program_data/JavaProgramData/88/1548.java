import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	  *file  ????
	  *author ???
	  *date   12.9
	  *function		???????????????????????
	  ?????????????????????????????????????
	*/
	public static int Main()
	{
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		int flag = 0;
		int lena;
		p = a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,100);
			a = new Scanner(System.in).nextLine();
			lena = a.length();
			while (*p != '\0')
			{
				if (*p <= '9' && *p >= '0')
				{
					System.out.print(p);
					flag = 1;
				}
				else
				{
					if (flag != 0)
					{
						System.out.print("\n");
						flag = 0;
					}
				}
				p++;
			}
			if (*(p + lena - 1) <= '9' && *(p + lena - 1) >= '0')
			{
				System.out.print("\n");
			}
		return 0;
	}
}
