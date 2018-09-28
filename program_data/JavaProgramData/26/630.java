import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String test = new String(new char[100]);
	  int len;
	  int i;
	  int j;
	  test = new Scanner(System.in).nextLine();
	  len = test.length();
	  for (i = 0 ; i <= len - 1 ; i++)
	  {
		  if ((test.charAt(i) == ' ') && (test.charAt(i - 1) == ' '))
		  {
			  for (j = i ; j <= len - 2 ; j++)
			  {
				  test = tangible.StringFunctions.changeCharacter(test, j, test.charAt(j + 1));
			  }
			  len--;
			  i--;
		  }
	  }
	  for (i = 0 ; i <= len - 1 ; i++)
	  {
		  System.out.print(test.charAt(i));
	  }
	  System.out.print("\n");
	  return 0;
	}

}

