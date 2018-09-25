package <missing>;

public class GlobalMembers
{
	public static int[] d = new int[5];
	public static int z;
	public static int g;
	public static int i;
	public static int j;
	public static int k;
	public static int m;
	public static int n;
	public static int y;
	public static int[] out = new int[300];
	public static int num;

	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		num = 0;



			for (i = m;i <= n;i++)
			{
				if (sushu(i) == 0)
				{
					y = 0;
				}
				else
				{
					y = 1 + huiwen(i);
				}

				if (y == 2)
				{
					out[num] = i;
					num++;
				}
			}

				if (num == 0)
				{
					System.out.print("no");
				}
				else if (num == 1)
				{
					System.out.printf("%d",out[0]);
				}
				else
				{
					System.out.printf("%d",out[0]);
					for (i = 1;i < num;i++)
					{
						System.out.printf(",%d",out[i]);
					}
				}


	}

	public static int sushu(i UnnamedParameter)
	{
		if (i < 10)
		{
			if (i == 2)
			{
				z = 1;
			}
			else if (i == 3)
			{
				z = 1;
			}
			else if (i == 5)
			{
				z = 1;
			}
			else if (i == 7)
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
		else
		{
			g = 1;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					g = 0;
				}
			}

			if (g == 1)
			{
				z = 1;
			}
			else
			{
				z = 0;
			}
		}
		return (z);
	}

	public static int huiwen(i UnnamedParameter)
	{
		if (i < 10)
		{
			z = 1;
		}
		else
		{
			d[4] = i / 10000;
			d[3] = (i - d[4] * 10000) / 1000;
			d[2] = (i - d[4] * 10000 - d[3] * 1000) / 100;
			d[1] = (i - d[4] * 10000 - d[3] * 1000 - d[2] * 100) / 10;
			d[0] = i - d[4] * 10000 - d[3] * 1000 - d[2] * 100 - d[1] * 10;

			if (d[4] != 0)
			{
				if (d[4] == d[0] && d[3] == d[1])
				{
					z = 1;
				}
				else
				{
					z = 0;
				}
			}
			else
			{
				if (d[3] != 0)
				{
					if (d[3] == d[0] && d[2] == d[1])
					{
						z = 1;
					}
					else
					{
						z = 0;
					}
				}
				else
				{
					if (d[2] != 0)
					{
						if (d[2] == d[0])
						{
							z = 1;
						}
						else
						{
							z = 0;
						}
					}
					else
					{
						if (d[1] == d[0])
						{
							z = 1;
						}
						else
						{
							z = 0;
						}
					}
				}
			}
			return (z);
		}
	}
}

