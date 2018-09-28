import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[100]); //??????
	   String temp = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p = str; //?????????????????a
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * q = temp;
	   int i = 0; //??????N
	   int j = 0;
	   int flag;
	   p = new Scanner(System.in).nextLine();
	   while (true)
	   {

			  if (*p <= 57 && *p >= 48)
			  {
				  *q = p;
				  q++;
				  flag = 1;
			  }
			  else if (flag == 1)
			  {
				  *q = 0;
				   q = temp;
				   System.out.print(q);
				   System.out.print("\n");
				   flag = 0;
			  }
			  if (*p == 0)
			  {
			  break;
			  }
			p++;
	   }


		return 0;
	}
}
