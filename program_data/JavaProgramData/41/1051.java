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
		int as;
		int bs;
		int cs;
		int ds;
		int es;

		for (a = 1; a <= 5;a++)
		{
			for (b = 1;b <= 5;b++)
			{
				if (a == b)
				{
					continue;
				}
				for (c = 1;c <= 5;c++)
				{
					if (b == c || a == c)
					{
						continue;
					}
					for (d = 1;d <= 5;d++)
					{
						if (a == d || b == d || c == d)
						{
							continue;
						}
					   for (e = 1;e <= 5;e++)
					   {
						   if (e == 2 || e == 3 || e == a || e == b || e == c || e == d)
						   {
							   continue;
						   }

						  as = (e == 1);
						  bs = (b == 2);
						  cs = (a == 5);
						  ds = (c != 1);
						  es = (d == 1);

						  if (a == 1 && as == 1 && b == 2 && bs == 1 && cs == 0 && ds == 0 && es == 0 || a == 1 && as == 1 && c == 2 && cs == 1 && bs == 0 && ds == 0 && es == 0 || a == 1 && as == 1 && d == 2 && ds == 1 && cs == 0 && bs == 0 && es == 0 || b == 1 && bs == 1 && a == 2 && as == 1 && cs == 0 && ds == 0 && es == 0 || b == 1 && bs == 1 && c == 2 && cs == 1 && as == 0 && ds == 0 && es == 0 || b == 1 && bs == 1 && d == 2 && ds == 1 && cs == 0 && bs == 0 && es == 0 || c == 1 && cs == 1 && a == 2 && as == 1 && bs == 0 && ds == 0 && es == 0 || c == 1 && cs == 1 && b == 2 && bs == 1 && as == 0 && ds == 0 && es == 0 || c == 1 && cs == 1 && d == 2 && ds == 1 && bs == 0 && as == 0 && es == 0 || d == 1 && ds == 1 && a == 2 && as == 1 && cs == 0 && bs == 0 && es == 0 || d == 1 && ds == 1 && b == 2 && bs == 1 && cs == 0 && as == 0 && es == 0 || d == 1 && ds == 1 && c == 2 && cs == 1 && as == 0 && bs == 0 && es == 0)
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
