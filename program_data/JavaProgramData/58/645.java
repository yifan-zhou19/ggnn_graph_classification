import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String a = new String(new char[80]);
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   int OK;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   System.in.read();
	   for (i = 0;i < n;i++)
	   {
			 a = new Scanner(System.in).nextLine();
			 OK = 0;
			 if ((a.charAt(0) == '_') || ((a.charAt(0) - 'A' >= 0) && (a.charAt(0) - 'A' <= 25)) || ((a.charAt(0) - 'a' >= 0) && (a.charAt(0) - 'a' <= 25)))
			 {
						 for (j = 0;j < 80;j++)
						 {
							   if (a.charAt(j) == '\0')
							   {
								   break;
							   }
							if (!((a.charAt(j) == '_') || ((a.charAt(j) - 'A' >= 0) && (a.charAt(j) - 'A' <= 25)) || ((a.charAt(j) - 'a' >= 0) && (a.charAt(j) - 'a' <= 25)) || ((a.charAt(j) - '0' >= 0) && (a.charAt(j) - '0' <= 9))))
							{
								System.out.print(0);
								System.out.print("\n");
								OK = 1;
								break;
							}
						 }
					 if (OK == 0)
					 {
						 System.out.print(1);
						 System.out.print("\n");
					 }
			 }
			 else
			 {
				 System.out.print(0);
				 System.out.print("\n");
			 }
	   }
	   return 0;
	}
}

