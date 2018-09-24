package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] word = new int[6];
		int[] rank = new int[6];
		for (a = 1;a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (c == a || c == b || a == b)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (d == a || d == b || d == c || c == a || c == b || a == b)
						{
							continue;
						}
						e = 15 - a - b - c - d;
						if (e == 2 || e == 3)
						{
							continue;
						}
						word[1] = (e == 1);
						word[2] = (b == 2);
						word[3] = (a == 5);
						word[4] = (c != 1);
						word[5] = (d == 1);
						rank[a] = word[1];
						rank[b] = word[2];
						rank[c] = word[3];
						rank[d] = word[4];
						rank[e] = word[5];
						if (rank[1] == 1 && rank[2] == 1 && rank[3] == 0 && rank[4] == 0 && rank[5] == 0)
						{
							System.out.print(a);
							System.out.print(" ");
							System.out.print(b);
							System.out.print(" ");
							System.out.print(c);
							System.out.print(" ");
							System.out.print(d);
							System.out.print(" ");
							System.out.print(e);
						}
					}
				}
			}
		}
		return 0;
	}

}
