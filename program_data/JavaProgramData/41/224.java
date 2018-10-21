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
		int i = 1;
		int j = 1;
		int t = 1;
		int k = 1;
		int[] word = new int[6];
		int[] rank = new int[6];
		for (i = 1;i <= 5;i++) //??e?????????????????
		{
			if (i == 2 || i == 3)
			{
				continue;
			}
			else
			{
				e = i;
			}
			for (j = 1;j <= 5;j++) //???????a?b?c?d
			{
				if (j == i)
				{
					continue;
				}
				else
				{
					a = j;
				}
				for (t = 1;t <= 5;t++)
				{
					if (t == i || t == j)
					{
						continue;
					}
					else
					{
						b = t;
					}
					for (k = 1;k <= 5;k++)
					{
						if (k == i || k == j || k == t)
						{
							continue;
						}
						else
						{
							c = k;
						}
						d = 15 - i - j - t - k;
						word[1] = (e == 1); //?5???????
						word[2] = (b == 2);
						word[3] = (a == 5);
						word[4] = (c != 1);
						word[5] = (d == 1);
						rank[a] = 1; //????????
						rank[b] = 2;
						rank[c] = 3;
						rank[d] = 4;
						rank[e] = 5;
						if (word[rank[1]] == 1 && word[rank[2]] == 1 && word[rank[3]] == 0 && word[rank[4]] == 0 && word[rank[5]] == 0)
						{
												  //????1?2?????
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
