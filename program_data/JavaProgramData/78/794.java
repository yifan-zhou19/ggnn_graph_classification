package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int[] word = new int[4];
		int[] m = new int[6];
		char[] n = {' ', 'z', 'q', 's', 'l', '\0'};
		for (i = 0;i <= 3;i++)
		{
			word[i] = 0;
		}
		for (i = 0;i <= 5;i++)
		{
			m[i] = 0;
		}
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
						if (d == a || b == d || c == d)
						{
							continue;
						}
						word[1] = (a + b == c + d);
						word[2] = (a + d >= b + c);
						word[3] = (a + c < b);
						if (word[1] == 1 && word[2] == 1 && word[3] == 1)
						{
							m[a] = a;
							m[b] = b;
							m[c] = c;
							m[d] = d;
							n[a] = 'z';
							n[b] = 'q';
							n[c] = 's';
							n[d] = 'l';
						}
					}
				}
			}
		}
		for (i = 5;i > 0;i--)
		{
			if (m[i] != 0)
			{
				System.out.print(n[i]);
				System.out.print(" ");
				System.out.print(10 * m[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}
