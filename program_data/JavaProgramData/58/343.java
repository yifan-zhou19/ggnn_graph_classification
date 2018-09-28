import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] word = new char[100][100];
		int i = 0;
		int j = 0;
		int[] len = new int[100];
		int n;
		int[] judge = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0;i < n;i++)
		{
			word[i] = new Scanner(System.in).nextLine();
		}
		for (i = 0;i < n;i++)
		{
			j = 0;
			while (word[i][j] != '\0')
			{
				j++;
			}
			len[i] = j;
		}
		for (i = 0;i < n;i++)
		{
			if ((word[i][0] >= 'a' && word[i][0] <= 'z' || word[i][0] >= 'A' && word[i][0] <= 'Z') || word[i][0] == '_')
			{
				judge[i] = 1;
				for (j = 1;j < len[i];j++)
				{
					if ((word[i][j] < '0' || (word[i][j]>'9' && word[i][j] < 'A') || (word[i][j]>'Z' && word[i][j] < 'a') || word[i][j]>'z') && word[i][j] != '_')
					{
						judge[i] = 0;
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.print(judge[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

