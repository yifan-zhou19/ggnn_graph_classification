package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i;
		int[][] b = new int[2][3];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b[0][0] = 3;
		b[0][1] = 5;
		b[0][2] = 7;
		for (i = 0;i < 3;i++)
		{
			if (a % b[0][i] == 0)
			{
				b[1][i] = 1;
			}
			else
			{
				b[1][i] = 0;
			}
		}
		if (b[1][0] == 0 && b[1][1] == 0 && b[1][2] == 0)
		{
			System.out.print("n");
		}
		else
		{
			if (b[1][0] == 1 && b[1][1] == 1 && b[1][2] == 1)
			{
				System.out.print("3 5 7");
			}
			else
			{
				if (b[1][0] == 0 && b[1][1] == 1 && b[1][2] == 1)
				{
					System.out.print("5 7");
				}
				else
				{
					if (b[1][0] == 0 && b[1][1] == 0 && b[1][2] == 1)
					{
						System.out.print("7");
					}
					else
					{
						if (b[1][0] == 1 && b[1][1] == 1 && b[1][2] == 0)
						{
							System.out.print("3 5");
						}
						else
						{
							if (b[1][0] == 1 && b[1][1] == 0 && b[1][2] == 0)
							{
								System.out.print("3");
							}
							else
							{
								if (b[1][0] == 1 && b[1][1] == 0 && b[1][2] == 1)
								{
									System.out.print("3 7");
								}
								else
								{
									if (b[1][0] == 0 && b[1][1] == 1 && b[1][2] == 0)
									{
										System.out.print("5");
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

