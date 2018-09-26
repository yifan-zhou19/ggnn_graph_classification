import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		int len = str.length();
		int temp = 0;
		for (int i = 0;i < len;i++)
		{
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9' && (str.charAt(i + 1)>'9' || str.charAt(i + 1) < '0'))
			{
				System.out.print(Integer.parseInt(str.Substring(temp)));
				System.out.print("\n");
			}
			if ((str.charAt(i) < '0' || str.charAt(i)>'9') && str.charAt(i + 1) <= '9' && str.charAt(i + 1) >= '0')
			{
				temp = i + 1;
			}
		}
		return 0;
	}
}
