package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;

		for (q = 30 ; q <= 50 ; q += 10)
		{
			for (z = 10 ; z <= 30 ; z += 10)
			{
				for (s = 10 ; s <= 30 ; s += 10)
				{
					for (l = 10 ; l <= 50 ; l += 10)
					{
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{
							if (l >= q)
							{
								System.out.print("l ");
								System.out.print(l);
								System.out.print("\n");
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
								if (z >= s)
								{
									System.out.print("z ");
									System.out.print(z);
									System.out.print("\n");
									System.out.print("s ");
									System.out.print(s);
									System.out.print("\n");
								}
								else
								{
									System.out.print("s ");
									System.out.print(s);
									System.out.print("\n");
									System.out.print("z ");
									System.out.print(z);
									System.out.print("\n");
								}
							}
							else
							{
								System.out.print("q ");
								System.out.print(q);
								System.out.print("\n");
								if ((z >= s) && (z >= l))
								{
									System.out.print("z ");
									System.out.print(z);
									System.out.print("\n");
									if (s >= l)
									{
										System.out.print("s ");
										System.out.print(s);
										System.out.print("\n");
										System.out.print("l ");
										System.out.print(l);
										System.out.print("\n");
									}
									else
									{
										System.out.print("l ");
										System.out.print(l);
										System.out.print("\n");
										System.out.print("s ");
										System.out.print(s);
										System.out.print("\n");
									}
								}
								else
								{
									if (s >= l)
									{
										System.out.print("s ");
										System.out.print(s);
										System.out.print("\n");
										if (z >= l)
										{
											System.out.print("z ");
											System.out.print(z);
											System.out.print("\n");
											System.out.print("l ");
											System.out.print(l);
											System.out.print("\n");
										}
										else
										{
											System.out.print("l ");
											System.out.print(l);
											System.out.print("\n");
											System.out.print("z ");
											System.out.print(z);
											System.out.print("\n");
										}
									}
									else
									{
										System.out.print("l ");
										System.out.print(l);
										System.out.print("\n");
										if (z >= s)
										{
											System.out.print("z ");
											System.out.print(z);
											System.out.print("\n");
											System.out.print("s ");
											System.out.print(s);
											System.out.print("\n");
										}
										else
										{
											System.out.print("s ");
											System.out.print(s);
											System.out.print("\n");
											System.out.print("z ");
											System.out.print(z);
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


		return 0;
	}


}
