import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[35]);
		String = new Scanner(System.in).nextLine();
		int i;
		int lenth = String.length();
		for (i = 0;i < lenth;i++)
		{
			if (String[i] >= '0' && string.charAt(i) <= '9')
			{
				if (String[i - 1] != '-')
				{
					for (;i < lenth;i++)
					{
						if (!(String[i] >= '0' && string.charAt(i) <= '9'))
						{
							System.out.print("\n");
							break;
						}
						System.out.print(String[i]);
					}
				}
			}
		}
		return 0;
	}

}
