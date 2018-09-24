package <missing>;

public class GlobalMembers
{
	//**********************************
	//*?????????.cpp          *
	//*?  ?????                  *
	//*?  ??2013.12.4               *
	//**********************************
	public static void judge(int m, int n, int[] p)
	{
		int[][] str = new int[9][9];
		int i;
		int j;
		if (n == 0) //??n??0??????n???????
		{
			return;
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		memcpy(str,p,(Integer.SIZE / Byte.SIZE)); //?p???str??????????????
		for (i = 0 ; i <= 8 ; i++)
		{
			for (j = 0 ; j <= 8 ; j++)
			{
				if (str[i][j] != 0)
				{
					if (i != 0) //???????????????p???
					{
						if (j != 0)
						{
							p[i - 1][j - 1] += str[i][j];
						}
						if (j != 8)
						{
							p[i - 1][j + 1] += str[i][j];
						}
						p[i - 1][j] += str[i][j];
					}
					if (i != 8)
					{
						if (j != 0)
						{
							p[i + 1][j - 1] += str[i][j];
						}
						if (j != 8)
						{
							p[i + 1][j + 1] += str[i][j];
						}
						p[i + 1][j] += str[i][j];
					}
					if (j != 0)
					{
						p[i][j - 1] += str[i][j];
					}
					if (j != 8)
					{
						p[i][j + 1] += str[i][j];
					}
					p[i][j] += str[i][j];
				}
			}
		}
		judge(m, n - 1, p); //?????
	}
	public static void output(int[] p)
	{
		int i;
		int j;
		for (i = 0 ; i <= 8 ; i++)
		{
			for (j = 0 ; j <= 8 ; j++)
			{
				System.out.print(p[i][j]);
				if (j != 8)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] p = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p[4][4] = m;
		judge(m, n, p); //????
		output(p); //????
		return 0;
	}
}

