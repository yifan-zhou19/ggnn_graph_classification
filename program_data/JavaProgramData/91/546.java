import java.util.*;

package <missing>;

public class GlobalMembers
{
	// ??:??? ???1000010500 
	// ??????? 
	// 2010-12-15


	public static int Main()
	{
		String s = new String(new char[101]);
		char c;
		int i;
		s = new Scanner(System.in).nextLine();
		c = s.charAt(0);
		for (i = 0;s.charAt(i + 1) != '\0';i++)
		{
			s.charAt(i) += s.charAt(i + 1); // ASC???
		}
		s.charAt(i) += c; // i??????? ??????
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			System.out.print(s.charAt(i));
		}
		return 0;
	}


}
