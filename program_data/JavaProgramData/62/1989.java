import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		String sentence = new String(new char[200]);
		sentence = new Scanner(System.in).nextLine();
		p = sentence;
		for (i = 0; sentence.charAt(i) != '\0'; i++)
		{
			if (sentence.charAt(i) != ' ')
			{
				*p = sentence.charAt(i);
				p++;
				flag = 1;
				continue;
			}
			if (sentence.charAt(i) == ' ' && flag == 1)
			{
				*p = sentence.charAt(i);
				p++;
				flag = 0;
			}
		}
		*p = '\0';
		System.out.print(sentence);
		return 0;
	}
}
