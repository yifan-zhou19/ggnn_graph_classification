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
		int f;
		int s;
		while ((scanf("%d%d%d%d%d%d", a, b, c, d, e, f)) && (a != 0))
		{
			s = d * 3600 + e * 60 + f;
			if ((b == 0) && (c == 0))
			{
				s += (12 - a) * 3600;
			}
			else
			{
				if (c == 0)
				{
					s += (11 - a) * 3600 + (60 - b) * 60;
				}
				else
				{
					s += (11 - a) * 3600 + (59 - b) * 60 + 60 - c;
				}
			}
			System.out.printf("%ld\n",s);
		}
		return 0;
	}
}
