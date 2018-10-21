import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * pos = null;
		sentence = new Scanner(System.in).nextLine();
		int len = sentence.length();
		System.out.print(sentence.charAt(0));
		for (pos = sentence.charAt(1) ; pos < sentence.charAt(len) ; pos++)
		{
			if (*pos == ' ' && *(pos - 1) == ' ')
			{
				continue;
			}
			else
			{
				System.out.print(pos);
			}
		}
		System.out.print("\n");
		return 0;
	}

}
