import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();

	   for (int i = 0;i < n;i++)
	   {
			  String a = new String(new char[21]);
			  int judge = 1;
			  a = new Scanner(System.in).nextLine();
			  if (a.charAt(0) >= '0' && a.charAt(0) <= '9')
			  {
			  judge = 0;
			  }
			  else
			  {
			  for (int j = 0;j < a.length();j++)
			  {
				  if ((a.charAt(j) < '0' || a.charAt(j)>'9') && (a.charAt(j) < 'A' || a.charAt(j)>'Z') && (a.charAt(j) < 'a' || a.charAt(j)>'z') && a.charAt(j) != '$' && a.charAt(j) != '_')
				  {
					 judge = 0;
					 break;
				  }
				 /* if (a[j]=='_' && a[j+1]=='_') 
				  {
					  judge=0;break;
				  }*/
			  }
			  }
			  if (judge == 1)
			  {
				  System.out.print("yes");
				  System.out.print("\n");
			  }
			  else if (judge == 0)
			  {
				  System.out.print("no");
				  System.out.print("\n");
			  }
	   }

	   return 0;

	}
}

