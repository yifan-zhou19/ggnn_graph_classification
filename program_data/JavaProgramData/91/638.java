import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[101]);
		String change = new String(new char[101]);
		int i;
		String point = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(change, '\0', (Character.SIZE / Byte.SIZE));
		sentence = new Scanner(System.in).nextLine();
		point = sentence;
		for (i = 0; i < sentence.length() - 1; i++)
		{
			change = tangible.StringFunctions.changeCharacter(change, i, *(point.Substring(i)) + *(point.Substring(i) + 1));
		}
		change = tangible.StringFunctions.changeCharacter(change, sentence.length() - 1, point + *(point + sentence.length() - 1));
		System.out.print(change);
		System.out.print("\n");
		return 0;
	}
}

