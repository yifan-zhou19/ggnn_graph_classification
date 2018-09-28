import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str = new String(new char[31]);
	  str = new Scanner(System.in).nextLine();
	  for (int i = 0;str.charAt(i);i++)
	  {
		  if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') && (str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '0'))
		  {
			  System.out.print(str.charAt(i));
		  }
		  if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') && !(str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '0'))
		  {
			  System.out.print(str.charAt(i));
			  System.out.print("\n");
		  }
	  }
	  return 0;

	}

}
