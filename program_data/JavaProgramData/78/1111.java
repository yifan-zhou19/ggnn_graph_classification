package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int a;
		int b;
		int c;
		int d;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						a = (z + q) == (s + l);
						b = (z + l) > (s + q);
						c = (z + s) < q;
					if (a == 1 && b == 1 && c == 1)
					{
						if (a != 0)
						{
						System.out.print("l ");
						System.out.print(l);
						System.out.print("\n");
						}
						System.out.print("q ");
						System.out.print(q);
						System.out.print("\n");
						System.out.print("z ");
						System.out.print(z);
						System.out.print("\n");
						System.out.print("s ");
						System.out.print(s);
						System.out.print("\n");
						break;
					}
					}
				}
			}
		}
		return 0;
	}





}
