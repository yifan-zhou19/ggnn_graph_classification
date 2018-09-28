import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[110]);
	public static void operate()
	{
		int pre = s.length();
		int len = pre;
		for (int i = len - 1;i >= 0;i--)
		{
			//??????????? 
			if (s.charAt(i) == ' ')
			{
				for (int j = i + 1;j < pre;j++)
				{
					System.out.print(s.charAt(j));
				}
				System.out.print(" ");
				pre = i;
			}
		}
		for (int j = 0;j < pre;j++)
		{
			System.out.print(s.charAt(j));
		}
		return;
	}
	public static int Main()
	{
		s = new Scanner(System.in).nextLine();
		operate();
		return 0;
	}

}
