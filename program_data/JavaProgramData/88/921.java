import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		String a = new String(new char[32]);
	   a = new Scanner(System.in).nextLine(); //??
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p = a;
	 for (int i = 1;i <= a.length();i++)
	 {
	   if (*p >= '0' && *p <= '9')
	   {
			  System.out.print(p);
	   p++;
	   } //???????
	   else
	   {
			 System.out.print("\n");
	   p++;
	   }
	 } //????????

	   return 0;

	}

}
