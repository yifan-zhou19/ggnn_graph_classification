import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int flag = 1;
	  String a = new String(new char[81]);
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  System.in.read();
	  for (i = 1;i <= n;i++)
	  {
		  a = new Scanner(System.in).nextLine();
	   if (!(a.charAt(0) >= 'a' && a.charAt(0) <= 'z' || a.charAt(0) >= 'A' && a.charAt(0) <= 'Z' || a.charAt(0) == '_'))
	   {
			   System.out.print(0);
			   System.out.print("\n");
			   continue;
	   } //?????
	   else
	   {
		   for (j = 1;a.charAt(j) != '\0' && flag != 0;j++)
		   {
			  if (!(a.charAt(j) >= 'a' && a.charAt(j) <= 'z' || a.charAt(j) >= 'A' && a.charAt(j) <= 'Z' || a.charAt(j) == '_' || a.charAt(j) >= '0' && a.charAt(j) <= '9')) //???????
			  {
				  flag = 0;
			  }
		   }
			 System.out.print(flag);
			 System.out.print("\n");
	   }
		flag = 1;
	  }
	  return 0;
	}

}

