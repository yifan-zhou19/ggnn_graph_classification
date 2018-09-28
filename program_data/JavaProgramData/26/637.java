import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		int i;
		int len;
		int flag = 0;
		word = new Scanner(System.in).nextLine();
		len = word.length();
		for (i = 0; i < len; i++)
		{
			if (word.charAt(i) != ' ')
			{
				System.out.print(word.charAt(i));
				flag = 1;
			}
			else if (flag == 1)
			{
				System.out.print(" ");
				flag = 0;
			}
		}
		return 0;
	}

}
