package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String rank = new String(new char[6]);
		int[] state = new int[6];
		int i;
		int r = 1;
		for (rank[1] = 'a'; rank.charAt(1) != 'e' + 1; rank.charAt(1)++)
		{
			for (rank[2] = 'a'; rank.charAt(2) != 'e' + 1; rank.charAt(2)++)
			{
				if (rank.charAt(1) == rank.charAt(2))
				{
					continue;
				}
				for (rank[3] = 'a'; rank.charAt(3) != 'e' + 1; rank.charAt(3)++)
				{
					if (rank.charAt(1) == rank.charAt(3) || rank.charAt(2) == rank.charAt(3))
					{
						continue;
					}
					for (rank[4] = 'a'; rank.charAt(4) != 'e' + 1; rank.charAt(4)++)
					{
						if (rank.charAt(1) == rank.charAt(4) || rank.charAt(2) == rank.charAt(4) || rank.charAt(3) == rank.charAt(4))
						{
							continue;
						}
						for (rank[5] = 'a'; rank.charAt(5) != 'e' + 1; rank.charAt(5)++)
						{
							if (rank.charAt(1) == rank.charAt(5) || rank.charAt(2) == rank.charAt(5) || rank.charAt(3) == rank.charAt(5) || rank.charAt(4) == rank.charAt(5))
							{
								continue;
							}
							state[1] = (rank.charAt(1) == 'e');
							state[2] = (rank.charAt(2) == 'b');
							state[3] = (rank.charAt(5) == 'a');
							state[4] = (rank.charAt(1) != 'c');
							state[5] = (rank.charAt(1) == 'd');
							if (rank.charAt(2) == 'e' || rank.charAt(3) == 'e')
							{
								break;
							}
							if (state[rank.charAt(1) - 'a' + 1] == 1 && state[rank.charAt(2) - 'a' + 1] == 1)
							{
									if (state[1] + state[2] + state[3] + state[4] + state[5] == 2)
									{
										for (i = 1; i != 6; i++)
										{
											if (rank.charAt(i) == 'a')
											{
												System.out.print(i);
												System.out.print(" ");
											}
										}
										for (i = 1; i != 6; i++)
										{
											if (rank.charAt(i) == 'b')
											{
												System.out.print(i);
												System.out.print(" ");
											}
										}
										for (i = 1; i != 6; i++)
										{
											if (rank.charAt(i) == 'c')
											{
												System.out.print(i);
												System.out.print(" ");
											}
										}
										for (i = 1; i != 6; i++)
										{
											if (rank.charAt(i) == 'd')
											{
												System.out.print(i);
												System.out.print(" ");
											}
										}
										for (i = 1; i != 6; i++)
										{
											if (rank.charAt(i) == 'e')
											{
												System.out.print(i);
											}
										}
										r = 0;
										break;
									}
							}
						}
						if (r == 0)
						{
							break;
						}
					}
					if (r == 0)
					{
						break;
					}
				}
				if (r == 0)
				{
						break;
				}
			}
			if (r == 0)
			{
						break;
			}
		}

		return 0;
	}






}
