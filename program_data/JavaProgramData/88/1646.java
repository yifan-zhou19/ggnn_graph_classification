import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String s = new String(new char[50]);
	 s = new Scanner(System.in).nextLine();
	 int i = 0;
	 while (s.charAt(i) != '\0')
	 {
	   while (s.charAt(i) <= 57 && s.charAt(i) >= 48)
	   {
		   System.out.print(s.charAt(i));
		   i++;
		   if (s.charAt(i) > 57 || s.charAt(i) < 48)
		   {
			   System.out.print('\n');
		   }
	   }
	   i++;
	 }
	 return 0;
	}
}
