import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[105]); //???????????
		int len;
		int[] word = new int[105];
		int w = 1;
		int dcgs;
		int a;
		str1 = new Scanner(System.in).nextLine(); //?????
		len = str1.length() - 1; //????????
		for (int i = 0;i <= len;i++) //??????????????????????
		{
			if (str1.charAt(i) != ' ')
			{
				word[w] = word[w] + 1;
			}
			else
			{
				w = w + 1;
			}
			dcgs = w;
		}
		int p = len;
		for (int i = dcgs;i >= 2;i--) //???????
		{
			for (int j = p - word[i] + 1;j <= p;j++)
			{
				System.out.print(str1.charAt(j));
			}
			p = p - word[i] - 1;
			System.out.print(" ");
		}
		for (int j = 0;j <= word[1] - 1;j++)
		{
			System.out.print(str1.charAt(j));
		}
		return 0;
	}

}
