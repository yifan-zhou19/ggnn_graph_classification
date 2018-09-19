import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] bookno = new int[100];
		char[][] author = new char[100][26];
		int[] numOfauthor = new int[26];
		int nbook;
		int max = 0;
		int maxno;
		char maxauthor;
		nbook = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 0; i < nbook; i++)
		{
			bookno[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			*(author + i) = new Scanner(System.in).nextLine();
		}
		for (i = 0; i < nbook; i++)
		{
			for (j = 0; author[i][j] != '\0'; j++)
			{
				numOfauthor[author[i][j] - 'A']++;
			}
		}
		for (i = 0; i < 26; i++)
		{
			if (numOfauthor[i] > max)
			{
				max = numOfauthor[i];
				maxno = i;
			}
		}
		maxauthor = maxno + 'A';
		System.out.print(maxauthor);
		System.out.print("\n");
		System.out.print(numOfauthor[maxno]);
		System.out.print("\n");
		for (i = 0; i < nbook; i++)
		{
			for (j = 0; author[i][j] != '\0'; j++)
			{
				if (author[i][j] == maxauthor)
				{
					System.out.print(bookno[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

