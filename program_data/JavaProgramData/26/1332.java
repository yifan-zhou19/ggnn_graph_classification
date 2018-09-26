import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[101]);
	  a = new Scanner(System.in).nextLine();
	  String p;
	  p = a;
	  int i;
	  int len = a.length();
	  for (i = 0 ; i <= len - 1 ;i++)
	  {
		if (p.charAt(i) != ' ')
		{
		System.out.print(p.charAt(i));
		}
		else if ((p.charAt(i - 1) != ' ') && (p.charAt(i) == ' '))
		{
		System.out.print(" ");
		}
	  }
	  System.out.print("\n");
	  return 0;











	}







}
