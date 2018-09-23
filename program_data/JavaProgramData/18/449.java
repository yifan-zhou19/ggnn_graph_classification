package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] arr = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int min;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					arr[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			} //??
			for (l = n;l > 1;l--)
			{
				for (i = 0;i < l;i++)
				{
					min = arr[i][0];
					for (j = 1;j < l;j++)
					{
						if (arr[i][j] < min)
						{
							min = arr[i][j];
						}
					}
					for (j = 0;j < l;j++)
					{
						arr[i][j] = arr[i][j] - min;
					}
				}
				for (j = 0;j < l;j++)
				{
					min = arr[0][j];
					for (i = 1;i < l;i++)
					{
						if (arr[i][j] < min)
						{
							min = arr[i][j];
						}
					}
					for (i = 0;i < l;i++)
					{
						arr[i][j] = arr[i][j] - min;
					}
				} //??
				sum = sum + arr[1][1]; //?????arr[1][1]
				for (i = 1;i < l;i++)
				{
					for (j = 0;j < l;j++)
					{
						arr[i][j] = arr[i + 1][j];
					}
				}
				for (j = 1;j < l;j++)
				{
					for (i = 0;i < l - 1;i++)
					{
						arr[i][j] = arr[i][j + 1];
					}
				} //??
			}
			System.out.print(sum);
			System.out.print("\n");
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(arr,0,(Integer.SIZE / Byte.SIZE));
			sum = 0;
		}
		return 0;
	}
}

