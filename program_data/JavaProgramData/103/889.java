import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		char judge;
		int num = 0;
		while (a = new Scanner(System.in).nextLine())
		{
		  num = 0;
		  int len;
		  len = a.length();
		  if (a.charAt(0) >= 65 && a.charAt(0) <= 90)
		  {
			  judge = a.charAt(0);
		  }
		  else
		  {
			  judge = (char)(a.charAt(0) - 32);
		  }
		  if (len == 1)
		  {
			  System.out.print("(");
			  System.out.print(judge);
			  System.out.print(",1)");
		  }
		  else
		  {
		  for (int i = 0;i < len;i++)
		  {
		   if ((a.charAt(i) == judge || a.charAt(i) == (char)(judge+32)) && i != len - 1)
		   {
			   num = num + 1;
		   }
		   else
		   {
			   if (a.charAt(i) != judge && i != len - 1)
			   {
				 if (a.charAt(i - 1) >= 65 && a.charAt(i - 1) <= 90)
				 {
					System.out.print("(");
					System.out.print(a.charAt(i - 1));
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				 }
				 else
				 {
					 System.out.print("(");
					 System.out.print((char)(a.charAt(i - 1) - 32));
					 System.out.print(",");
					 System.out.print(num);
					 System.out.print(")");
				 }
				 num = 1;
				 if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
				 {
				   judge = a.charAt(i);
				 }
				 else
				 {
					 judge = (char)(a.charAt(i) - 32);
				 }
			   }
			   else if (a.charAt(i) == judge && i == len - 1)
			   {
				  if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
				  {
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",");
					System.out.print(num + 1);
					System.out.print(")");
				  }
				 else
				 {
					 System.out.print("(");
					 System.out.print((char)(a.charAt(i) - 32));
					 System.out.print(",");
					 System.out.print(num + 1);
					 System.out.print(")");
				 }
			   }
			   else
			   {
				  if (a.charAt(i - 1) >= 65 && a.charAt(i - 1) <= 90)
				  {
					System.out.print("(");
					System.out.print(a.charAt(i - 1));
					System.out.print(",");
					System.out.print(num);
					System.out.print(")");
				  }
				 else
				 {
					 System.out.print("(");
					 System.out.print((char)(a.charAt(i - 1) - 32));
					 System.out.print(",");
					 System.out.print(num);
					 System.out.print(")");
				 }
				 if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
				 {
					System.out.print("(");
					System.out.print(a.charAt(i));
					System.out.print(",1)");
				 }
				 else
				 {
					 System.out.print("(");
					 System.out.print((char)(a.charAt(i) - 32));
					 System.out.print(",1)");
				 }
			   }
		   }
		  }
		  }
		  System.out.print("\n");
		}
		return 0;
	}


}
