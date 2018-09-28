import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int[] mark = new int[26];
		char ch;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while (t != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(mark, 0, (Integer.SIZE / Byte.SIZE));
			String c = new String(new char[100000]);
			c = new Scanner(System.in).nextLine();
			int len = c.length();
			for (i = 0 ; i < len ; i++)
			{
				mark[c.charAt(i) - 'a']++;
			}
			for (i = 0 ; i < len ; i++)
			{
				if (mark[c.charAt(i) - 'a'] == 1)
				{
					System.out.print(c.charAt(i));
					System.out.print("\n");
					break;
				}
			}
			if (i == len)
			{
				System.out.print("no");
				System.out.print("\n");
			}
			t--;
		}
	}
}

