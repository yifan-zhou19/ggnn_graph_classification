import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[100]);
		int len;
		int i;
		word = new Scanner(System.in).nextLine();
		len = word.length();
		for (i = 0; i < len; i++)
		{
			if (word.charAt(i) == ' ')
			{
				System.out.print(" ");
				while (word.charAt(i) == ' ')
				{
					i++;
				}
			}
			System.out.print(word.charAt(i));
		}
		return 0;
	}
}
