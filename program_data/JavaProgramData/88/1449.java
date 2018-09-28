import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] buff = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		buff = new Scanner(System.in).nextLine();
		int len = buff.length();
		int num = 0;
		for (int i = 0 ; i < len ; i++)
		{
			if (buff[i] >= '0' && buff[i] <= '9')
			{
				num = 10 * num + buff[i] - '0';
				if (buff[i + 1] == '\0')
				{
					System.out.print(num);
					System.out.print("\n");
				}
			}
			else
			{
				if (buff[i - 1] >= '0' && buff[i - 1] <= '9')
				{
					System.out.print(num);
					System.out.print("\n");
					num = 0;
				}
			}
		}
		return 0;
	}
}
