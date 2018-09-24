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
	 while (*p != '\0')
	 {
		 if (*p != ' ' || *p == ' ' && *(p + 1) != ' ')
		 {
	  System.out.print(p);
		 }
	  p++;
	 }
	 return 0;
	}
}
