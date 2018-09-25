package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z1;
		int q1;
		int s1;
		int l1;
		int z;
		int q;
		int s;
		int l;
		for (z = 10; z <= 50; z += 10)
		{
			for (q = 10; q != z,q <= 50; q += 10)
			{
				for (s = 10;s != z,s != q,s <= 50; s += 10)
				{
					for (l = 10;l != z,l != q,l != s,l <= 50; l += 10)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							z1 = z;
							q1 = q;
							s1 = s;
							l1 = l;
						}
					}
				}
			}
		}
		for (int i = 50; i >= 10; i--)
		{
			if (z1 == i)
			{
				System.out.print("z");
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
			if (q1 == i)
			{
				System.out.print("q");
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
			if (s1 == i)
			{
				System.out.print("s");
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
			if (l1 == i)
			{
				System.out.print("l");
				System.out.print(" ");
				System.out.print(i);
				System.out.print("\n");
			}
		}
		return 0;
	}
}
