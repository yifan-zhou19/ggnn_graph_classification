import java.util.*;

package <missing>;

public class GlobalMembers
{
	//***********************************************
	//*   ????????                                  * 
	//*   ??????                                          *
	//*   ???12?24?                                     * 
	//***********************************************
	public static int Main()
	{
	   String a = new String(new char[35]);
	   a = new Scanner(System.in).nextLine(); //?????
	   int l = a.length(); //????
	   int i = 0;
	   int k = 0;
	   while (i < l)
	   {
		  if (a.charAt(i) >= '0' && a.charAt(i) <= '9') //???????????
		  {
			 int count = 1;
			 int j = i + 1;
			 while (a.charAt(j) >= '0' && a.charAt(j) <= '9')
			 {
				count++; //?????????
				j++;
			 }
			 for (k = i;k < i + count;k++)
			 {
				System.out.print(a.charAt(k));
			 }
			 System.out.print("\n");
			 i = i + count; //?????i???????
		  }
		  else
		  {
			  i++;
		  }
	   }
	   return 0;
	}

}
