import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sentence = new String(new char[100]);
		int i;
		int len;
		int[] flag = new int[100];
		sentence = new Scanner(System.in).nextLine();
		len = sentence.length();
		for (i = 0;i < len;i++)
		{
			if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) == ' ')
			{
				flag[i + 1] = 1;
			}
		}
		for (i = 0;i < len;i++)
		{
			if (flag[i] == 0)
			{
				System.out.print(sentence.charAt(i));
			}
		}
		return 0;
	}
}
