import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[510]);
		char[][] subword = new char[510][6];
		int n;
		int i;
		int j;
		int len;
		int[] num = new int[510];
		int temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		word = new Scanner(System.in).nextLine();
		len = word.length();
		for (i = 0; i <= len - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				subword[i][j] = word.charAt(i + j);
			}
			subword[i][n] = '\0';
		}
		for (i = 0; i < len - n; i++)
		{
			for (j = i + 1; j <= len - n; j++)
			{
				if (strcmp(subword[i],subword[j]) == 0 && num[i] >= 0)
				{
					num[i]++;
					num[j] = -1;
				}

			}
		}

		for (i = 0; i < len - n; i++)
		{
			if (num[i] > temp)
			{
				temp = num[i];
			}
		}
		if (temp == 0)
		{
			System.out.print("NO");
			System.out.print("\n");
		}
		else
		{
			System.out.print(temp + 1);
			System.out.print("\n");
			for (i = 0; i < len - n; i++)
			{
				if (num[i] == temp)
				{
					System.out.print(subword[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

