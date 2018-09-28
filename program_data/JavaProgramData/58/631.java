import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 int k;
	 int len;
	 String str = new String(new char[81]);
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.in.read();
	 for (i = 1;i <= n;i++)
	 {
	  k = 1;
	  str = new Scanner(System.in).nextLine();
	  if (str.charAt(0) < 'A' || (str.charAt(0)>'Z' && str.charAt(0) < '_') || (str.charAt(0)>'_' && str.charAt(0) < 'a') || str.charAt(0)>'z')
	  {
	   k = 0;
	  }
	  len = str.length();
	  for (j = 1;j < len;j++)
	  {
	   if (str.charAt(j) < '0' || (str.charAt(j)>'9' && str.charAt(j) < 'A') || (str.charAt(j)>'Z' && str.charAt(j) < '_') || (str.charAt(j)>'_' && str.charAt(j) < 'a') || str.charAt(j)>'z')
	   {
		 k = 0;
		 break;
	   }
	  }
	   System.out.print(k);
	   System.out.print("\n");
	 }
	 return 0;
	}
}

