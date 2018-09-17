package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int i = 0;
		int j = 0;
		int k = 0;
		int w;
		int x;
		int y;
		int z;
		char p = 'A';
		char q = 'B';
		char r = 'C';
		char t;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					if (b > a)
					{
						i++;
					}
					if (a == c)
					{
						i++;
					}
					if (a > b)
					{
						j++;
					}
					if (a > c)
					{
						j++;
					}
					if (c > b)
					{
						k++;
					}
					if (b > a)
					{
						k++;
					}
					if (a + i == 2 && b + j == 2 && c + k == 2)
					{
						w = a;
						x = b;
						y = c;
					}
					i = 0;
					j = 0;
					k = 0;
				}
			}
		}
		if (w < x)
		{
			z = w;
			w = x;
			x = z;
			t = p;
			p = q;
			q = t;
		}
		if (w < y)
		{
			z = w;
			w = y;
			y = z;
			t = p;
			p = r;
			r = t;
		}
		if (x < y)
		{
			z = x;
			x = y;
			y = z;
			t = q;
			q = r;
			r = t;
		}
		System.out.printf("%c%c%c",r,q,p);
	}
}
