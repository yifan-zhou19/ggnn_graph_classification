import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] len = new int[100];
		char[][] number = new char[100][101];
		char exp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < 2 * n;i++)
		{
			if (i == 2 * n - 1 || i % 2 == 0)
			{
				number[i] = new Scanner(System.in).nextLine();
			}
			else
			{
				number[i] = new Scanner(System.in).nextLine();
				System.in.read(); //????
			}
		}
		for (i = 0;i < 2 * n;i++)
		{
			for (j = 0,k = String.valueOf(number[i]).length() - 1;j < k;j++,k--) //??????????
			{
				exp = number[i][j];
				number[i][j] = number[i][k];
				number[i][k] = exp;
			}
			len[i] = String.valueOf(number[i]).length();
		}
		for (i = 0;i < 2 * n;i = i + 2)
		{
			for (j = 0;j < len[i + 1];j++)
			{
				if (number[i][j] < number[i + 1][j])
				{
					number[i][j] = number[i][j] + ':' - number[i + 1][j];
					number[i][j + 1]--;
				}
				else
				{
					number[i][j] = number[i][j] - number[i + 1][j] + '0';
				}
			}
			if (number[i][len[i] - 1] == 0)
			{
				number[i][len[i] - 1] = '\0';
			}
			len[i] = String.valueOf(number[i]).length();
		}
		for (i = 0;i < 2 * n;i = i + 2) //??????
		{
			for (j = len[i] - 1;j >= 0;j--)
			{
				if (j == 0)
				{
					System.out.print(number[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(number[i][j]);
				}
			}
		}
		return 0;
	}
}

