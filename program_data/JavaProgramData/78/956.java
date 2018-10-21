package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int A;
		int B;
		int C;
		int D;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if ((z != q) && (z != s) && (z != l) && (q != s) && (q != l) && (s != l))
						{
							A = ((z + q) == (s + l));
							B = ((z + l) > (s + q));
							C = ((z + s) < q);
							D = A + B + C;
							if (D == 3)
							{
								if (z == 5)
								{
									System.out.print("z 50\n");
								}
								else
								{
									if (q == 5)
									{
										System.out.print("q 50\n");
									}
									else
									{
										if (s == 5)
										{
											System.out.print("s 50\n");
										}
										else
										{
											if (l == 5)
											{
												System.out.print("l 50\n");
											}
										}
									}
								}
								if (z == 4)
								{
									System.out.print("z 40\n");
								}
								else
								{
									if (q == 4)
									{
										System.out.print("q 40\n");
									}
									else
									{
										if (s == 4)
										{
											System.out.print("s 40\n");
										}
										else
										{
											if (l == 4)
											{
												System.out.print("l 40\n");
											}
										}
									}
								}
								if (z == 3)
								{
									System.out.print("z 30\n");
								}
								else
								{
									if (q == 3)
									{
										System.out.print("q 30\n");
									}
									else
									{
										if (s == 3)
										{
											System.out.print("s 30\n");
										}
										else
										{
											if (l == 3)
											{
												System.out.print("l 30\n");
											}
										}
									}
								}
								if (z == 2)
								{
									System.out.print("z 20\n");
								}
								else
								{
									if (q == 2)
									{
										System.out.print("q 20\n");
									}
									else
									{
										if (s == 2)
										{
											System.out.print("s 20\n");
										}
										else
										{
											if (l == 2)
											{
												System.out.print("l 20\n");
											}
										}
									}
								}
								if (z == 1)
								{
									System.out.print("z 10\n");
								}
								else
								{
									if (q == 1)
									{
										System.out.print("q 10\n");
									}
									else
									{
										if (s == 1)
										{
											System.out.print("s 10\n");
										}
										else
										{
											if (l == 1)
											{
												System.out.print("l 10\n");
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
