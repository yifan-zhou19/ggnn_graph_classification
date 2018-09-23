package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int q;
		int r;
		int s;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = n % 10;
		n = (n - p) / 10;
		q = n % 10;
		n = (n - q) / 10;
		r = n % 10;
		n = (n - r) / 10;
		s = n % 10;
		n = (n - s) / 10;
		t = n;
		if (t != 0)
		{
			System.out.print(p);
			System.out.print(q);
			System.out.print(r);
			System.out.print(s);
			System.out.print(t);
			System.out.print("\n");
		}
		else
		{
			if (s != 0)
			{
				 System.out.print(p);
				 System.out.print(q);
				 System.out.print(r);
				 System.out.print(s);
				 System.out.print("\n");
			}
			else
			{
				if (r != 0)
				{
					System.out.print(p);
					System.out.print(q);
					System.out.print(r);
					System.out.print("\n");
				}
				else
				{
					if (q != 0)
					{
						System.out.print(p);
						System.out.print(q);
						System.out.print("\n");
					}
					else
					{
						System.out.print(p);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

