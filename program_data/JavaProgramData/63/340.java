package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1; //???????????
		int b1;
		int a2;
		int b2;
		int[][] num1 = new int[100][100]; //??????
		int[][] num2 = new int[100][100];
		int[][] num3 = new int[100][100];
		for (int i = 0;i < 100;i++) //????0
		{
				for (int j = 0;j < 100;j++)
				{
						num1[i][j] = 0;
						num2[i][j] = 0;
						num3[i][j] = 0;
				}
		}
		a1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < a1;i++)
		{
				for (int j = 0;j < b1;j++)
				{
						num1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		a2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < a2;i++)
		{
				for (int j = 0;j < b2;j++)
				{
						num2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (int i = 0;i < a1;i++) //??????????
		{
				for (int j = 0;j < b2;j++)
				{
						for (int k = 0;k < b1;k++)
						{
								num3[i][j] = num3[i][j] + num1[i][k] * num2[k][j];
						}
				}
		}
		for (int i = 0;i < a1;i++)
		{
				for (int j = 0;j < b2;j++)
				{
						System.out.print(num3[i][j]);
						if (j < b2 - 1)
						{
								  System.out.print(' ');
						}
				}
				System.out.print("\n");
		}
		return 0;
	}


}

