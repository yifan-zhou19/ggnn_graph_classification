import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static String szline1 = new String(new char[maxlen]);
	public static String szline2 = new String(new char[maxlen]);
	public static int[] an1 = new int[maxlen];
	public static int[] an2 = new int[maxlen];
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			System.in.read();
			szline1 = new Scanner(System.in).nextLine();
			szline2 = new Scanner(System.in).nextLine();
			int len1 = szline1.length();
			int len2 = szline2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(an2, 0, (Integer.SIZE / Byte.SIZE));
			for (int i = len1 - 1, j = 0; i >= 0; i--)
			{
				an1[j++] = szline1.charAt(i) - '0';
			}
			for (int i = len2 - 1, j = 0; i >= 0; i--)
			{
				an2[j++] = szline2.charAt(i) - '0';
			}
			int begin = 0;
			for (int i = 0; i < maxlen; i++)
			{
				an1[i] -= an2[i];
				if (an1[i] < 0)
				{
					an1[i] += 10;
					an1[i + 1]--;
				}
				if (an1[i] != 0)
				{
					begin = i;
				}
			}
			for (int i = begin; i >= 0; i--)
			{
				System.out.print(an1[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}


}

