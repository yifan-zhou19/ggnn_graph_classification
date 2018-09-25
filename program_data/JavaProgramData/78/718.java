package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 10;
		int q = 10;
		int s = 10;
		int l = 10;
		int a;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							break;
						}
					}
					if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
					{
						break;
					}
				}
				if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
				{
					break;
				}
			}
			if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
			{
				break;
			}
		} //???????????????????????
		for (a = 50;a >= 10;a = a - 10)
		{
			if (z == a)
			{
				System.out.print("z ");
				System.out.print(a);
				System.out.print("\n");
			}
			if (q == a)
			{
				System.out.print("q ");
				System.out.print(a);
				System.out.print("\n");
			}
			if (s == a)
			{
				System.out.print("s ");
				System.out.print(a);
				System.out.print("\n");
			}
			if (l == a)
			{
				System.out.print("l ");
				System.out.print(a);
				System.out.print("\n");
			}
		} //???????
		return 0;
	}

}
