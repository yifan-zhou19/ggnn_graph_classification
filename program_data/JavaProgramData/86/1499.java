package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int[][] d = new int[1000][60];
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (b = 0;b < a;b++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d[b][0] = Integer.parseInt(tempVar2);
			}
			for (c = 0;c < d[b][0];c++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					d[b][c + 1] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (b = 0;b < a;b++)
		{
				if (d[b][0] == 0)
				{
					System.out.print("60\n");
				}
				else
				{
					f = d[b][0];
					if (f == 1)
					{
						if (d[b][f] > 57)
						{
							System.out.printf("%d\n",d[b][f]);
						}
						else
						{
							System.out.print("57\n");
						}
					}
					else
					{
						for (c = 1;c <= d[b][0];c++)
						{
						g = d[b][c] + 3 * c;
						if (g > 60)
						{
							if (g > 62)
							{
								System.out.printf("%d\n",60 - 3 * (c - 1));
							}
							else
							{
								System.out.printf("%d\n",d[b][c]);
							}
							break;
						}
						if (c == d[b][0] && g <= 60)
						{
							System.out.printf("%d\n",60 - 3 * c);
						}
						}
					}
				}
		}
		return 0;
	}
}

