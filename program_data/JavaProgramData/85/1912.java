import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{
	  String a = new String(new char[100]); //???????

	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a = new Scanner(System.in).nextLine(); //????????
	  for (;n > 0;n--)
	  {
		  a = new Scanner(System.in).nextLine(); //?????
		  if ((a.charAt(0) < 65 || a.charAt(0)>90 && a.charAt(0) < 97 || a.charAt(0)>97 + 25) && a.charAt(0) != '_')
		  {
			  System.out.print("no");
			  System.out.print("\n");
			  continue;
		  } //???????????no????????
		  int i;
		  for (i = 1;;i++) //???????????????
		  {
			if (a.charAt(i) == 0)
			{
			   System.out.print("yes");
			   break;
			}
			 if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
			 {
				 continue;
			 }
			 if (a.charAt(i) <= 97 + 25 && a.charAt(i) >= 97)
			 {
				 continue;
			 }
			 if (a.charAt(i) >= 48 && a.charAt(i) <= 48 + 9)
			 {
				 continue;
			 }
			 if (a.charAt(i) == '_')
			 {
				 continue;
			 }
			 System.out.print("no");
			 break;
		  }
		 System.out.print("\n");
	  }

	  return 0; //?????
	}

}

