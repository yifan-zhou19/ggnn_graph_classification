import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String input = new String(new char[101]);
		input = new Scanner(System.in).nextLine();
		int inputlen = input.length();
		int sumblank = 0;
		for (int i = 0;i <= inputlen - 1;++i)
		{
			if (input.charAt(i) == ' ')
			{
				++sumblank;
			}
		}
		char[][] word = new char[100][101];
		int i = 0;
		int k = 0;
		for (int j = 0;j <= inputlen - 1;++j)
		{
			if (input.charAt(j) == ' ')
			{
				++i;
				k = 0;
			}
			else
			{
				word[i][k] = input.charAt(j);
				++k;
			}
		}
		for (int i = sumblank;i >= 0;--i)
		{
			if (i == sumblank)
			{
				System.out.print(word[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(word[i]);
			}
		}

		return 0;
	}
}
