import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************
	//*  ?????????? 
	//*  ????? 
	//*  ???1200012941 
	//*  ???2012?12?2? 
	//*************************
	public static int Main()
	{
		  int i;
		  int j;
		  String str = new String(new char[100]);
		  str = new Scanner(System.in).nextLine();
		  int len = str.length();
		  int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  char * p = null;
		  for (p = str; * p != '\0' ; p++)
		  {
			   if (*p == ' ')
			   {
				  if (flag == 0)
				  {
					  flag = 1;
				  }
				  else
				  {
					  while (*p == ' ')
					  {
							 for (char * pp = p; pp != '\0'; pp++)
							 {
								  pp = *(pp + 1);
							 }
					  }
					  flag = 0;
				  }
			   }
			   else
			   {
				   flag = 0;
			   }
		  }
		  for (p = str; * p != '\0'; p++)
		  {
			  System.out.print(p);
		  }
		  return 0;
	}
}
