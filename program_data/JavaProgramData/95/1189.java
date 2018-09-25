import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		int i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) >= 65 && str1.charAt(i) <= 90)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0;str2.charAt(i) != '\0';i++)
		{
			if (str2.charAt(i) >= 65 && str2.charAt(i) <= 90)
			{
				str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		for (i = 0;str1.charAt(i) != '\0' && str2.charAt(i) != '\0';i++)
		{
			if (str1.charAt(i) > str2.charAt(i))
			{
				System.out.print(">");
				System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto lable;
			}
			if (str1.charAt(i) < str2.charAt(i))
			{
				System.out.print("<");
				System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto lable;
			}
		}
		System.out.print("=");
		System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	lable:
	return 0;
	}
}

