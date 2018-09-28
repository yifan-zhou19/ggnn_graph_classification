import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int step = 0; //step????????????????????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * p; //p????????????q????????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	   char * q;
	   String str = new String(new char[50]); //????????
	   str = new Scanner(System.in).nextLine(); //?????
	   for (p = str;p < str.Substring(31);p++)
	   {

		  if (*p < '0' || *p>'9') //????
		  {
			continue;
		  }
		  else
		  {
			  for (q = p;q < str.Substring(31);q++) //?q??p
			  {
				  if (*q >= '0' && *q <= '9') //???????????p??????????
				  {
					 step++;
					 System.out.print(q);
				  }
				  else
				  {
					 System.out.print("\n");
					 p = p + step; //p???????
					 step = 0; //??
					 break;
				  }
			  }
		  }
		  if (*p == '\n')
		  {
			  break;
		  }

	   }
	   return 0;
	}
}
