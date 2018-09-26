import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] char =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	   }; //??????????
	   int i = 0;
		  //?????i
	   int n = 0; //??????n
	   int k = 0; //?????K
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
		for (k = 0;k < n;k++) //????
		{
			  char[k] = new Scanner(System.in).nextLine();
		}

		   for (k = 0;k < n;k++) //?????????
		   {
				  if (char[k][0] <= 'Z' && char[k][0] >= 'A' || char[k][0] <= 'z' && char[k][0] >= 'a' || char[k][0] == '_') // ???????????????
				  {
						 for (i = 1;i < 100;i++)
						 {
							if (char[k][i] == 0) //???????????????????1
							{
								System.out.print(1);
								System.out.print("\n");
									 break;
							}
						   if ((char[k][i] <= 'Z' && char[k][i] >= 'A') + (char[k][i] <= 'z' && char[k][i] >= 'a') + (char[k][i] <= '9' && char[k][i] >= '0') + (char[k][i] == '_') == 0) //?????0
						   {
							  System.out.print(0);
							  System.out.print("\n");
									  break;
						   }


						 }
				  }
				 else //????????????????????0
				 {
						  System.out.print(0);
						  System.out.print("\n");
				 }
		   }
	return 0;
	}

}

