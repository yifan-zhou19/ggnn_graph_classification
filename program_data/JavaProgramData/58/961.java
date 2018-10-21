import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int counter;
	 int len;
	 int j;
	 String c = new String(new char[81]);
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 System.in.read();
	 for (i = 1;i <= n;i++)
	 {
	   counter = 0;
	   c = new Scanner(System.in).nextLine();
	   len = c.length();
	   if (len > 1)
	   {
		if (c.charAt(0) == '_' || (c.charAt(0) > 64 && c.charAt(0) < 91) || (c.charAt(0)>96 && c.charAt(0) < 123))
		{
		  for (j = 1;c.charAt(j) != 0;j++)
		  {
		   if (c.charAt(j) == '_' || (c.charAt(j) > 64 && c.charAt(j) < 91) || (c.charAt(j)>96 && c.charAt(j) < 123) || (c.charAt(j) >= '0') && (c.charAt(j) <= '9'))
		   {
			   counter++;
		   }
		  }
		  if (counter == len - 1)
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
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
	   }
	   else
	   {
		 if (c.charAt(0) == '_' || (c.charAt(0) > 64 && c.charAt(0) < 91) || (c.charAt(0)>96 && c.charAt(0) < 123))
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

	 }
	 return 0;
	}
}

