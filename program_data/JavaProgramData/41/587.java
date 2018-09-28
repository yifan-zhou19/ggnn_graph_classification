package <missing>;

public class GlobalMembers
{
	//?????
	//??? 1200017623
	//???????????


	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int[] word = new int[6];
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
					if (a == c || b == c)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
						e = 15 - a - b - c - d;
						if (e == 2 || e == 3)
						{
							continue;
						}
						word[a] = (e == 1); //a????A??????
						word[b] = (b == 2);
						word[c] = (a == 5);
						word[d] = (c != 1);
						word[e] = (d == 1);
						if (word[1] != 0 && word[2] != 0 && word[3] == 0 && word[4] == 0 && word[5] == 0)
						{
							System.out.printf("%d %d %d %d %d\n",a,b,c,d,e);
							break;
						}
					}
				}
			}
		}
		return 0;
	}

}
