import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char change(char x)
	{
		 if (x > 64 && x < 91)
		 {
			 return (x + 32);
		 }
	  else
	  {
		  return x;
	  }
	}

	public static int Main()
	{
		String a = new String(new char[81]);
		String b = new String(new char[81]);
		char i;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 i = 0;
	for (;;)
	{
		 if (change(a.charAt(i)) > change(b.charAt(i)))
		 {
			 System.out.print('>');
			 break;
		 }
	  else if (change(a.charAt(i)) < change(b.charAt(i)))
	  {
		  System.out.print('<');
		  break;
	  }
	  else if (a.charAt(i) != '\0')
	  {
		  i++;
	  }
	  else
	  {
		  System.out.print('=');
		  break;
	  }
	}
	 return 0;
	}

}
