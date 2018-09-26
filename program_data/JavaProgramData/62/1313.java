import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int del = 0;
		String word = new String(new char[100]);
		word = new Scanner(System.in).nextLine();
		int len = word.length();
		for (int i = 1; i < len; i++)
		{
			if (*(word.Substring(i)) == ' ' && *(word.Substring(i) - 1) == ' ') //????
			{
				del++; //?????????1
				for (int j = i; j < len - del; j++) //?????????
				{
					*(word.Substring(j)) = *(word.Substring(j) + 1);
				}
				i--; //?????????
			}
		}
		for (int k = 0; k < len - del; k++) //?????????
		{
			System.out.print((word.Substring(k)));
		}
		return 0;
	}

}
