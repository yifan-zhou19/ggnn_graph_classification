import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[31]);
	   a = new Scanner(System.in).nextLine();
	   int b = a.length();
	   String c = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * q = c;
	   for (;p < a.Substring(b);q++,p++)
	   {
		   if (*p - '0' >= 0 && *p - '0' <= 9)
		   {
			 *q = p;
		   }
		   else
		   {
			 *q = '\n';
		   }
	   }
	   for (q = c;q < c.Substring(b);q++)
	   {
		 System.out.print(q);
	   }








	 return 0;
	}

}
