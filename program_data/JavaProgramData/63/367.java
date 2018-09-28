package <missing>;

public class GlobalMembers
{
	public static int Main() //?????
	{ //?????
		int[][] a = new int[100][100]; //????a
		int[][] b = new int[100][100]; //????b
		int[][] c = new int[100][100]; //????c
		int i; //????
		int j;
		int k;
		int l;
		int m;
		int n;
		int o;
		int num = 0; //????
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < i;m++) //a?????
		{
			for (n = 0;n < j;n++)
			{
				a[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < k;m++) //b?????
		{
			for (n = 0;n < l;n++)
			{
				b[m][n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (m = 0;m < i;m++) //????
		{
			for (n = 0;n < l;n++)
			{
				for (o = 0;o < j;o++)
				{
					c[m][n] = c[m][n] + a[m][o] * b[o][n];
				}
			}
		}
		for (m = 0;m < i;m++) //????
		{
			for (n = 0;n < l;n++)
			{
				if (num < l - 1)
				{
					System.out.print(c[m][n]);
					System.out.print(" ");
					num++;
				}
				else if (num < l)
				{
					System.out.print(c[m][n]);
					System.out.print("\n");
					num = 0;
				}
			}
		}
		return 0; //?????
	}


}

