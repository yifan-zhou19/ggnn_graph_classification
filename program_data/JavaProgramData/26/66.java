import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[100]); //??????
	   int i; //??????i,j?m??????
	   int j;
	   int m = 1;
	   str = new Scanner(System.in).nextLine();
	   for (i = 0;str.charAt(i) != '\0';) //???????????????????????????????????????????
	   {
		   m = 1;
		   if (str.charAt(i) == ' ')
		   {
			   for (j = 1;str.charAt(i + j) == ' ';j++)
			   {
				   m++;
			   }
			   System.out.print(str.charAt(i));
			   i += m;
		   }
		   else
		   {
			   System.out.print(str.charAt(i++));
		   }
	   }
	   return 0;
	}

}
