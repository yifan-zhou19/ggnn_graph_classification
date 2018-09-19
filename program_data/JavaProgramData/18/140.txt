package <missing>;

public class GlobalMembers
{
	public static int min(int a,int b) //????
	{
		return a < b != 0?a:b;
	}

	public static int f(int n, int[][] number) //???????
	{
			int[] num = new int[100]; //num??????????
			int m = 10000;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					m = min(m, number[i][j]);
				}
				num[i] = m;
				m = 10000;
			}
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					number[i][j] = number[i][j] - num[i];
				}
			}
			//???
			m = 10000;
			for (int j = 0;j < n;j++)
			{
				for (int i = 0;i < n;i++)
				{
					m = min(m, number[i][j]);
				}
				num[j] = m;
				m = 10000;
			}
			for (int j = 0;j < n;j++)
			{
				for (int i = 0;i < n;i++)
				{
					number[i][j] = number[i][j] - num[j];
				}
			}
		//???
			if (n == 2)
			{
		//???2*2???,????[1][1]
			return number[1][1];
			}
			else
			{
			 int sum;
			 sum = number[1][1];
			 for (int j = 0;j < n;j++) //???????
			 {
				   for (int i = 1;i < n - 1;i++)
				   {
					number[i][j] = number[i + 1][j];
				   }
			 }
			 for (int i = 0;i < n;i++)
			 {
				for (int j = 1;j < n - 1;j++)
				{
					number[i][j] = number[i][j + 1];
				}
			 }
			 return sum + f(n - 1, number);
			}
	}

	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int n1 = n;
		while (n-- != 0)
		{
			int[][] number = new int[100][100];
			for (int i = 0;i < n1;i++)
			{
				for (int j = 0;j < n1;j++)
				{
					number[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int sum = f(n1, number);
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

