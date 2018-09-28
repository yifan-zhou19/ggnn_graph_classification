package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[8][8];
	public static int x;
	public static int y;

	public static int judge(int m,int n)
	{
		int a = 1;
		int b = 1;
		int ii;
		int jj;
		for (jj = 0;jj < y;jj++)
		{
			if (s[m][n] < s[m][jj])
			{
				a = 0;
			}
		}
		for (ii = 0;ii < x;ii++)
		{
			if (s[m][n] > s[ii][n])
			{
				b = 0;
			}
		}
		return a * b;
	}

	public static int Main()
	{
		int i;
		int j;
		int tj = 0;
		char d;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = ConsoleInput.readToWhiteSpace(true).charAt(0);
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//cout<<x<<y<<endl;
		for (i = 0;i < x;i++)
		{
			for (j = 0;j < y;j++)
			{
				//cout<<"cs"<<s[i][j]<<judge(i,j)<<endl;
				if (judge(i, j) > 0)
				{
					System.out.print(i);
					System.out.print("+");
					System.out.print(j);
					System.out.print("\n");
					tj++;
				}
			}
		}
		if (tj == 0)
		{
			System.out.print("No");
			System.out.print("\n");
		}
		return 0;
	}

}

