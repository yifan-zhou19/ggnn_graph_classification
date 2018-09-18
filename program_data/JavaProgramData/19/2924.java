import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String word = "";
		char c = '\0';
		final String alter = "";
		final String alter0 = "";
		int i = 0;
		int j = 0;
		int sum;
		while (c != '\n')
		{
			c = System.in.read();
			while (c != ' ' && c != '\n') //?????????????
			{
				word.charAt(i)[j] = c;
				c = System.in.read();
				j++;
			}
			i++;
			j = 0;
		}
		sum = i;
		alter0 = new Scanner(System.in).nextLine(); //??????
		alter = new Scanner(System.in).nextLine();
		for (i = 0;i < sum;i++)
		{
			j = 0;
			while (alter0.charAt(j) == word.charAt(i)[j] && j <= 99) //???????
			{
				j++;
			}
			if (j == 100)
			{
				for (j = 0;j < 100;j++)
				{
					word.charAt(i)[j] = alter.charAt(j);
				}
			}
		}
		for (i = 0;i < sum - 1;i++) //??
		{
			System.out.print(word.charAt(i));
			System.out.print(' ');
		}
		System.out.print(word.charAt(sum - 1));
		return 0;
	}
}
