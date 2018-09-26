import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[31]);
		String pointer;
		int i;
		int len;
		int flag = 0;
		m = new Scanner(System.in).nextLine();
		len = m.length();
		pointer = m.charAt(0);
		for (i = 0;i < len;i++)
		{
			pointer = m.charAt(i);
			if (pointer >= 48 && pointer <= 57)
			{
				System.out.print(pointer);
				flag = 1;
			}
			else
			{
				if (flag == 1)
				{
					System.out.print("\n");
				}
				flag = 0;
			}
		}
		return 0;
	}
}
