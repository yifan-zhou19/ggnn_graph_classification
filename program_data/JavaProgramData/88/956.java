import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String a = new String(new char[35]);
	   int count = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p = a;
	   a = new Scanner(System.in).nextLine();
	   for (; * p != '\0'; * p++)
	   {
		   if (*p >= 48 && *p <= 57)
		   {
			   System.out.print(p);
			   *p++;
			  for (; * p != '\0'; * p++)
			  {
				  if (*p >= 48 && *p <= 57)
				  {
					  System.out.print(p);
				  }
				  else
				  {
					  System.out.print("\n");
					  break;
				  }
			  }
		   }
		   else
		   {
			   continue;
		   }
	   }
	   //while(1);
		return 0;
	}
}
