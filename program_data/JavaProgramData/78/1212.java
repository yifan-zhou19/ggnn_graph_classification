package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int sum = 0;
		for (z = 1; z <= 5; z++)
		{
			for (q = 1; q <= 5; q++)
			{
				if (q != z)
				{
					for (s = 1; s <= 5; s++)
					{
						if (s != z && s != q)
						{
							l = z + q - s;
							if (l != z && l != q && l != s && l <= 5 && l > 0)
							{
								sum = (z + l > q + s) + (z + s < q);
								if (sum == 2)
								{
									if (q > l)
									{
											if (s > l)
											{
												System.out.print("q");
												System.out.print(" ");
												System.out.print(q * 10);
												System.out.print("\n");
												System.out.print("s");
												System.out.print(" ");
												System.out.print(s * 10);
												System.out.print("\n");
												System.out.print("l");
												System.out.print(" ");
												System.out.print(l * 10);
												System.out.print("\n");
												System.out.print("z");
												System.out.print(" ");
												System.out.print(z * 10);
												System.out.print("\n");
											}
											else
											{
												System.out.print("q");
												System.out.print(" ");
												System.out.print(q * 10);
												System.out.print("\n");
												System.out.print("l");
												System.out.print(" ");
												System.out.print(l * 10);
												System.out.print("\n");
												System.out.print("s");
												System.out.print(" ");
												System.out.print(s * 10);
												System.out.print("\n");
												System.out.print("z");
												System.out.print(" ");
												System.out.print(z * 10);
												System.out.print("\n");
											}
									}
									else
									{
										System.out.print("l");
										System.out.print(" ");
										System.out.print(l * 10);
										System.out.print("\n");
										System.out.print("q");
										System.out.print(" ");
										System.out.print(q * 10);
										System.out.print("\n");
										System.out.print("z");
										System.out.print(" ");
										System.out.print(z * 10);
										System.out.print("\n");
										System.out.print("s");
										System.out.print(" ");
										System.out.print(s * 10);
										System.out.print("\n");
									}
									break;
								}
							}
						}
					}
				}
			}
		}

		return 0;
	}


}
