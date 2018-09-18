import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int len1;
		int m = 1;
		int p = 0;
		String str = new String(new char[110]);
		char[][] word = new char[100][100];
		String w1 = new String(new char[100]);
		String w2 = new String(new char[100]);
		str = new Scanner(System.in).nextLine();
		w1 = new Scanner(System.in).nextLine();
		w2 = new Scanner(System.in).nextLine();
		len = str.length() - 1;
		len1 = w2.length() - 1;
		for (int i = 0;i <= len;i++)
		{
			if (str.charAt(i) != ' ')
			{
				word[m][p] = str.charAt(i);
				p++;
			}
			if (str.charAt(i) == ' ')
			{
				p = 0;
				m++;
			}
		}
		for (int i = 1;i <= m;i++)
		{
			if (strcmp(word[i],w1) == 0)
			{
				for (int j = 0;j <= len1;j++)
				{
					word[i][j] = w2.charAt(j);
				}
				for (int j = len1 + 1;j <= 98;j++)
				{
					word[i][j] = '\0';
				}
			}
		}
		for (int i = 1;i <= m - 1;i++)
		{
			System.out.print(word[i]);
			System.out.print(" ");
		}
		System.out.print(word[m]);
		System.out.print("\n");
		return 0;
	}
}
