import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] book = new int[1000];
		int[] cnt = new int[60];
		int max;
		char[][] author = new char[1000][26];
		char p;
		int[][] b = new int[60][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 60;i++)
		{
			cnt[i] = 0;
		}
		for (int i = 0;i < n;i++)
		{
			book[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			author[i] = new Scanner(System.in).nextLine();
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;author[i][j] != '\0';j++)
			{
					int k = author[i][j] - '0';
					b[k][cnt[k]++] = book[i]; //?i???K????
			}

		}
		max = cnt[17];
		p = 'A';
		for (int i = 17;i <= 42;i++)
		{
			if (cnt[i] > max)
			{
					max = cnt[i];
					p = i + '0';
			}
		}
		System.out.print(p);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int m = 0;m < max;m++)
		{
		System.out.print(b[p - '0'][m]);
		System.out.print("\n");
		}
		return 0;
	}

}

