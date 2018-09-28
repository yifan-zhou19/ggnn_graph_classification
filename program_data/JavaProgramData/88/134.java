import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[300]);
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
			{
				do
				{
					System.out.print(s.charAt(i));
					i++;
				}while (s.charAt(i) >= '0' && s.charAt(i) <= '9');
				System.out.print("\n");
			}
		}
		return 0;
	}
}
