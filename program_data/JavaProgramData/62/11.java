import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str, 0, (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		for (int i = 0; str.charAt(i); i++)
		{
			if (str.charAt(i) != ' ')
			{
				System.out.print(str.charAt(i));
			}
			else
			{
				if (str.charAt(i + 1) != ' ')
				{
					System.out.print(str.charAt(i));
				}
			}
		}
		System.out.print("\n");
		return 0;
	}
}
