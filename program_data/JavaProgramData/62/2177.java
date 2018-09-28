import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		String ch = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,0,(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int flag = 0;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == ' ' && flag == 0)
			{
				flag++;
				ch = tangible.StringFunctions.changeCharacter(ch, j++, str.charAt(i));
			}
			if (str.charAt(i) != ' ')
			{
				ch = tangible.StringFunctions.changeCharacter(ch, j++, str.charAt(i));
				flag = 0;
			}
		}
		System.out.print(ch);
		System.out.print("\n");
		return 0;
	}



}

