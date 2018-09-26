package <missing>;

public class GlobalMembers
{
	/*???*/
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				if (q != z)
				{
					for (s = 1;s <= 5;s++)
					{
						if (s != q && s != z)
						{
							for (l = 1;l <= 5;l++)
							{
								if ((l != z) && (l != q) && (l != s))
								{
									if ((z + q) == (s + l) && ((z + l) > (s + q)) && ((z + s) < q))
									{
										 if (l > q)
										 {
											System.out.print("l ");
											System.out.print(l * 10);
											System.out.print("\n");
											System.out.print("q ");
											System.out.print(q * 10);
											System.out.print("\n");
											System.out.print("z ");
											System.out.print(z * 10);
											System.out.print("\n");
											System.out.print("s ");
											System.out.print(s * 10);
											System.out.print("\n");
										 }
										if (l < q)
										{
											if ((z < s) && (l> s))
											{
												System.out.print("q ");
												System.out.print(q * 10);
												System.out.print("\n");
												System.out.print("l ");
												System.out.print(l * 10);
												System.out.print("\n");
												System.out.print("s ");
												System.out.print(s * 10);
												System.out.print("\n");
												System.out.print("z ");
												System.out.print(z * 10);
												System.out.print("\n");
											}
											else
											{
												System.out.print("q ");
												System.out.print(q * 10);
												System.out.print("\n");
												System.out.print("z ");
												System.out.print(z * 10);
												System.out.print("\n");
												System.out.print("s ");
												System.out.print(s * 10);
												System.out.print("\n");
												System.out.print("l ");
												System.out.print(l * 10);
												System.out.print("\n");
											}
										}

									}
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
