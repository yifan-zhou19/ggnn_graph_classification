package <missing>;

public class GlobalMembers
{
	public static int[][] ch = new int[9][9];
	public static int[][] ch2 = new int[9][9];

	public static int Main()
	{
		int m;
		int day;
		void d(int);

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch, 0, (Integer.SIZE / Byte.SIZE));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch[4][4] = m;

		d(day);

		return 0;
	}

	public static void d(int day)
	{
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ch2, 0, (Integer.SIZE / Byte.SIZE));

		if (day == 0)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 8; j++)
				{
					System.out.print(ch[i][j]);
					System.out.print(" ");
				}

				System.out.print(ch[i][j]);
				System.out.print("\n");
			}
		}
		else
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (ch[i][j] != 0)
					{
						ch2[i][j] = ch[i][j];
						ch[i][j] *= 2;
					}
				}
			}

			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (ch2[i][j] != 0)
					{
						if (i > 0)
						{
							ch[i - 1][j] += ch2[i][j];
						}
						if (i < 8)
						{
							ch[i + 1][j] += ch2[i][j];
						}
						if (j > 0)
						{
							ch[i][j - 1] += ch2[i][j];
						}
						if (j < 8)
						{
							ch[i][j + 1] += ch2[i][j];
						}
						if (i > 0 && j > 0)
						{
							ch[i - 1][j - 1] += ch2[i][j];
						}
						if (i > 0 && j < 8)
						{
							ch[i - 1][j + 1] += ch2[i][j];
						}
						if (i < 8 && j > 0)
						{
							ch[i + 1][j - 1] += ch2[i][j];
						}
						if (i < 8 && j < 8)
						{
							ch[i + 1][j + 1] += ch2[i][j];
						}
					}
				}
			}
			d(day - 1);
		}
	}

}

