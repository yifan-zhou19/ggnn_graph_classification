package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int[] X = new int[20];
		int[] Y = new int[20];
		X[0] = x;
		Y[0] = y;
		for (i = 1;i < 20;i++)
		{
			X[i] = X[i - 1] / 2;
			Y[i] = Y[i - 1] / 2;
		}
		int flag = 0;
		for (i = 0;i < 20;i++)
		{
			for (j = 0;j < 20;j++)
			{
				if (X[i] == Y[j])
				{
				System.out.print(X[i]);
				flag = 1;
				break;
				}
			}
			if (flag != 0)
			{
				break;
			}
		}
		return 0;
	}
}

