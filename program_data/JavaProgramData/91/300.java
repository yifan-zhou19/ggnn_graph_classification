import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[1000]);
	   a = new Scanner(System.in).nextLine();
	   int c = a.length();

	   String b = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p = a;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * q = b;
	   for (p = a;p <= a.Substring(c) - 2;q++,p++)
	   {
	   *q = (char)((int)(*p) + (int)(*(p + 1)));
	   }
	   *q = (char)((int)(*p) + (int)(*(p - c + 1)));
	   for (q = b;q < b.Substring(c);q++)
	   {
		 System.out.print(q);
	   }

	 return 0;
	}

}
