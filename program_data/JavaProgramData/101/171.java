package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int[] word = new int[3];
		int i = 0;
		char[] rank = {0, '\0', '\0'};
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 3 - a - b;
				word[a] = (b > a) + (c == a);
				word[b] = (a > b) + (a > c);
				word[c] = (c > b) + (b > a);
				rank[a] = 65;
				rank[b] = 66;
				rank[c] = 67;
				if (word[a] == 2 - a && word[b] == 2 - b && word[c] == 2 - c)
				{
					for (i = 0;i <= 2;i++)
					{
						System.out.print(rank[i]);
					}
				}
			}
		}
		return 0;
	}
}
