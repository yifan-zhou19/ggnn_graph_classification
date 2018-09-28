package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int max = 0;
		int min = 100000;
		int p = 0;
		for (int i = 0;i <= 4;i++)
		{
			for (int j = 0;j <= 4;j++)
			{
		a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i <= 4;i++)
		{
			max = 0;
			for (int j = 0;j <= 4;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
				}
			}
			for (int j = 0;j <= 4;j++)
			{
				if (a[i][j] == max)
				{
					b[i][j]++;
					//cout <<"b"<<i<<j<<"="<<b[i][j];
				}
			}
		}
		//cout << endl;
		for (int i = 0;i <= 4;i++)
		{
			min = 100000;
			for (int j = 0;j <= 4;j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (int j = 0;j <= 4;j++)
			{
				if (a[j][i] == min)
				{
					b[j][i]++;
					//cout <<"b"<<j<<i<<"="<<b[j][i];
				}
			}
		}
		for (int i = 0;i <= 4;i++)
		{
			for (int j = 0;j <= 4;j++)
			{
				if (b[i][j] == 2)
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

