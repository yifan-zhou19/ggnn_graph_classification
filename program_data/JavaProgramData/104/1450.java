package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int j;
		int[] X = new int[11];
		int[] Y = new int[11];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;x >= 1;i++)
		{
			X[i] = x;
			x = x / 2;
		}
		for (j = 1;y >= 1;j++)
		{
			Y[j] = y;
			y = y / 2;
		}
		for (j = j - 1,i = i - 1;;j--,i--)
		{
			if (X[i] != Y[j])
			{
				System.out.print(X[i + 1]);
				System.out.print("\n");
				break;
			}
		}
		return 0;
	}

}

