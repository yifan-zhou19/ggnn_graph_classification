import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[1000]);
		int i;
		int flag = 0;
		int len;
		m = new Scanner(System.in).nextLine();
		len = m.length();
		for (i = 0;m.charAt(i) != '\0';i++)
		{
			if (m.charAt(i) == ' ')
			{
				if (flag == 0)
				{
					continue;
				}
				else
				{
					flag = 0;
					System.out.print(m.charAt(i));
				}
			}
			else
			{
				flag = 1;
				System.out.print(m.charAt(i));
			}
		}
		System.out.print("\n");
		return 0;
	}


}
