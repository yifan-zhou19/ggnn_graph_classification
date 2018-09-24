package <missing>;

public class GlobalMembers
{
	public static int point(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		else
		{
			if (num % 2 == 0)
			{
				return num / 2;
			}
			else
			{
				return (num - 1) / 2;
			}
		}
	}
	public static int Main()
	{
		int point = int num;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		int[] X = {x, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] Y = {y, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int i;
		int j;
		for (i = 1;i < 11;i++)
		{
			X[i] = point(X[i - 1]);
			Y[i] = point(Y[i - 1]);
		}
		for (i = 0;i < 11;i++)
		{
			int signal = 0;
			for (j = 0;j < 11;j++)
			{
				if (X[i] == Y[j])
				{
					System.out.printf("%d\n",X[i]);
					signal = 1;
					break;
				}
			}
			if (signal == 1)
			{
				break;
			}
		}
		return 0;
	}

}

