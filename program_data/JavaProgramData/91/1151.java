import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[105]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str, 0, (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		str = tangible.StringFunctions.changeCharacter(str, str.length(), str.charAt(0));
		for (int i = 0; i < str.length() - 1; i++)
		{
			System.out.print((char)(str.charAt(i) + str.charAt(i + 1)));
		}
		return 0;
	}
}

