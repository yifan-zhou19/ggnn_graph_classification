import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		String result = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		int flag = 1; // shifirst
		int i;
		for (i = 0; * p != '\0'; p++)
		{
			if (* p != ' ')
			{
				result = tangible.StringFunctions.changeCharacter(result, i++, * p);
				flag = 1;
			}
			else if (flag)
			{
				flag = 0;
				result = tangible.StringFunctions.changeCharacter(result, i++, * p);
			}
		}
		result = tangible.StringFunctions.changeCharacter(result, i, '\0');
		System.out.print(result);
		System.out.print("\n");
		return 0;
	}
}

