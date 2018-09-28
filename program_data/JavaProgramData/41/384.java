package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //???????abcde????????????iTruth??????????????
		int b;
		int c;
		int d;
		int e;
		int[] iTruth = new int[6];
		for (a = 1;a <= 5;a++)
		{ //?????????????????????????????e??????????
			for (b = 1;b <= 5;b++)
			{
				if (a != b)
				{
					for (c = 1;c <= 5;c++)
					{
						if ((c != a) && (c != b))
						{
							for (d = 1;d <= 5;d++)
							{
								if ((d != a) && (d != b) && (d != c))
								{
									for (e = 1;e <= 5;e++)
									{
										if ((e != a) && (e != b) && (e != c) && (e != d) && (e != 2) && (e != 3))
										{
											iTruth[a] = (e == 1); //?????????????????????
											iTruth[b] = (b == 2);
											iTruth[c] = (a == 5);
											iTruth[d] = (c != 1);
											iTruth[e] = (d == 1);
											if ((iTruth[1] + iTruth[2] == 2) && (iTruth[3] + iTruth[4] + iTruth[5] == 0))
											{ //???????????
												System.out.print(a);
												System.out.print(" ");
												System.out.print(b);
												System.out.print(" ");
												System.out.print(c);
												System.out.print(" ");
												System.out.print(d);
												System.out.print(" ");
												System.out.print(e);
												a = b = c = d = e = 6; //????
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
