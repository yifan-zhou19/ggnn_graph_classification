package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] m = new int[3];
		for (int a = 1;a <= 3;a++)
		{
			for (int b = 1;b <= 3;b++)
			{
				for (int c = 1;c <= 3;c++)
				{
					m[0] = (b > a) + (c == a);
					m[1] = (a > b) + (a > c);
					m[2] = (c > b) + (b > a);
					if (((a - b) * (m[0] - m[1]) < 0) || (((a == b) && (m[0] == m[1]))) == 1)
					{
						if (((a - c) * (m[0] - m[2]) < 0) || (((a == c) && (m[0] == m[2]))) == 1)
						{
							if (((c - b) * (m[2] - m[1]) < 0) || (((c == b) && (m[2] == m[1]))) == 1)
							{
								if (a <= b)
								{
									if (a <= c)
									{
									System.out.print("A");
									if (b <= c)
									{
										System.out.print("B");
										System.out.print("C");
									}
									else
									{
										System.out.print("C");
										System.out.print("B");
									}
									}
									else
									{
										System.out.print("C");
										System.out.print("A");
										System.out.print("B");
									}

								}
								if (b < a)
								{
																if (a <= c)
																{

																System.out.print("B");
																System.out.print("A");
																System.out.print("C");
																}
																else if (b >= c)
																{
																	System.out.print("C");
																	System.out.print("B");
																	System.out.print("A");
																}
																else
																{
																	System.out.print("B");
																	System.out.print("C");
																	System.out.print("A");
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
