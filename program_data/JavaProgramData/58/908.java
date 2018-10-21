import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int l;
	 int p;
	 int m;
	 String str = new String(new char[81]);
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.in.read();
	 for (int j = 1;j <= n;j++)
	 {
		  str = new Scanner(System.in).nextLine();
	  l = str.length();
	  if ((str.charAt(0) == '_') || (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') || (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z'))
	  {
		  m = 1;
	  }
	  else
	  {
		  m = 0;
	  }
	  for (int i = 0;i < l;i++)
	  {
		  if ((str.charAt(i) <= '9' && str.charAt(i) >= '0') || (str.charAt(i) == '_') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
		  {
			 p = 1;
		  }
		  else
		  {
			  p = 0;
			  break;
		  }

	  }
	  if (m == 1 && p == 1)
	  {
	   System.out.print("1");
	   System.out.print("\n");
	  }
	  else
	  {
		  System.out.print("0");
		  System.out.print("\n");
	  }
	 }
	   return 0;
	}

}

