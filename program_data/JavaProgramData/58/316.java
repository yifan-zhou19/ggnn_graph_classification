import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   String s = new String(new char[1001]);
	   int i = 0;
	   while (s = new Scanner(System.in).nextLine())
	   {
		   int ok = 0;
		  i++;


		   if ((s.charAt(0) >= 'a') && (s.charAt(0) <= 'z'))
		   {
			   ok = 1;
		   }
		   else if ((s.charAt(0) >= 'A') && (s.charAt(0) <= 'Z'))
		   {
			   ok = 1;
		   }
		   else if (s.charAt(0) == '_')
		   {
			   ok = 1;
		   }

		   if (ok != 0) //????
		   {
		   for (int j = 1;s.charAt(j);j++)
		   {
			   if ((s.charAt(j) >= 'a') && (s.charAt(j) <= 'z'))
			   {
				   ok = 1;
			   }
			   else if ((s.charAt(j) >= 'A') && (s.charAt(j) <= 'Z'))
			   {
				   ok = 1;
			   }
			   else if ((s.charAt(j) >= '0') && (s.charAt(j) <= '9'))
			   {
				   ok = 1;
			   }
			   else if (s.charAt(j) == '_')
			   {
				   ok = 1;
			   }
			   else
			   {
				   ok = 0;
				   break; //?????????????

			   }
		   }
		   }
		   if (i != 1)
		   {
		   System.out.print(ok);
		   System.out.print("\n");
		   }

	   }
	  return 0; //?????
	}

}

