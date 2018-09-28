package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//freopen("in.txt","r",stdin);
		//freopen("out.txt","w",stdout);
		int i;
		int j;
		int k;
		int column = -1;
		int[][] arr = new int[5][5];
		for (i = 0; i < 5; ++i)
		{
			for (j = 0; j < 5; ++j)
			{
				arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; ++i)
		{
			for (j = 0; j < 5; ++j)
			{
				for (k = j + 1; k < 5; ++k)
				{
					if (arr[i][j] < arr[i][k])
					{
						break;
					}
				}
				if (k == 5)
				{
					column = j;
					break;
				}
			}
			for (j = 0; j < 5; ++j)
			{
				if (arr[i][column] > arr[j][column])
				{
					break;
				}
			}
			if (j == 5)
			{
				System.out.print(i + 1);
				System.out.print(" ");
				System.out.print(column + 1);
				System.out.print(" ");
				System.out.print(arr[i][column]);
				System.out.print("\n");
				break;
			}
		}
		if (i == 5)
		{
			System.out.print("not found\n");
		}
	}

}

