package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
		int[][] x = new int[100][100];
		int a;
		int b;
		int sum;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < num;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < 100;j++)
			{
				for (int k = 0;k < 100;k++)
				{
				x[j][k] = 0;
				}
			}
			sum = 0;
			for (int j = 0;j < a;j++)
			{
				for (int k = 0;k < b;k++)
				{
					x[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (j == 0 || j == a - 1)
					{
						sum += x[j][k];
					}
					else
					{
						if (k == 0 || k == b - 1)
						{
						sum += x[j][k];
						}
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

