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
		int aS;
		int bS;
		int cS;
		int dS;
		int eS;
		int sum;
		int pro;

		for (e = 1; e <= 5; e++)
		{
			if (e == 2 || e == 3)
			{
				continue;
			}
			for (a = 1; a <= 5; a++)
			{
				if (e == a)
				{
					continue;
				}
				for (b = 1; b <= 5; b++)
				{
					if (e == b || a == b)
					{
						continue;
					}
					for (c = 1; c <= 5; c++)
					{
						if (e == c || a == c || b == c)
						{
							continue;
						}
						for (d = 1; d <= 5; d++)
						{
							if (e == d || a == d || b == d || c == d)
							{
								continue;
							}
							aS = (e == 1);
							bS = (b == 2);
							cS = (a == 5);
							dS = (c != 1);
							eS = (d == 1);
							sum = (a - aS) + (b - bS) + (c - cS) + (d - dS) + (e - eS);
							pro = (a - aS) * (b - bS) * (c - cS) * (d - dS) * (e - eS);
							if (sum == 13 && pro == 0 && (a - aS == 1 || b - bS == 1 || c - cS == 1 || d - dS == 1 || e - eS == 1))
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
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
