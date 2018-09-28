import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String na = new String(new char[100]);

	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		na = new Scanner(System.in).nextLine();
		while (num -- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(na, ' ', (Character.SIZE / Byte.SIZE));
			na = new Scanner(System.in).nextLine();
			int index = 0;
			int len = 0;
			len = na.length();
			if (!(na.charAt(index) == '_' || (na.charAt(index) <= 'z' && na.charAt(index) >= 'a') || (na.charAt(index) <= 'Z' && na.charAt(index) >= 'A')))
			{
				System.out.print(0);
				System.out.print("\n");
				continue;
			}
			index++;
			for (; index < len; index++)
			{
				if (na.charAt(index) == '_' || (na.charAt(index) >= '0' && na.charAt(index) <= '9') || (na.charAt(index) <= 'z' && na.charAt(index) >= 'a') || (na.charAt(index) <= 'Z' && na.charAt(index) >= 'A'))
				{
					continue;
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
					break;
				}
			}
			if (index == len)
			{
				System.out.print(1);
				System.out.print("\n");
			}
		}
		return 0;
	}


}

