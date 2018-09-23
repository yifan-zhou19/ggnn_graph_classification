package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int[] word = new int[4];
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				if (b == a)
				{
					continue;
				}
				c = 6 - a - b;
				word[a] = (b > a) + (c == a);
				word[b] = (a > b) + (a > c);
				word[c] = (c > b) + (b > a);
				if ((word[a] == 3 - a) && (word[b] == 3 - b) && (word[c] == 3 - c))
				{
					for (int i = 1;i <= 3;i++)
					{
						if (a == i)
						{
							System.out.print("A");
						}
						else if (b == i)
						{
							System.out.print("B");
						}
						else if (c == i)
						{
							System.out.print("C");
						}
					}
				}
			}
		}
		return 0;
	}
}
