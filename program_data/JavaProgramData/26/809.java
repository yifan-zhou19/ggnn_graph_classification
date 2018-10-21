import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  String s = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	  char * p = s;




	  s = new Scanner(System.in).nextLine();
	  System.out.print(p);
	  p++;
	  while (*p != '\0')
	  {
		  if (*p != 32 || *p == 32 && *(p - 1) != 32)
		  {
		  System.out.print(p);
		  }
		  p++;
	  }






























	 return 0;

	}






}
