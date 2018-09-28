import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	 char * p;
	 a = new Scanner(System.in).nextLine();
	 p = a;
	 while (*p != '\0')
	 {
		 if (*p >= '0' && *p <= '9')
		 {
	   while (*p >= '0' && *p <= '9')
	   {
		   System.out.print(p);
		p++;
	   }
	   System.out.print("\n");
		 }
	  else
	  {
		  p++;
	  }
	 }
	 return 0;
	}

}
