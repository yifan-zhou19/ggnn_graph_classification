package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] renren = new int[100000][2];
		int n;
		int i = 0;
		int j;
		int[] qun = new int[100000];
		int[] ming = new int[100000];
		int flag = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			for (j = 0; j < 2; j++)
			{
				renren[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			i++;
		}while (renren[i - 1][0] != 0 || renren[i - 1][1] != 0);

		for (j = 0; j < i - 1; j++)
		{
			qun[renren[j][0]]++;
			ming[renren[j][1]]++;
		}

		for (j = 0; j < i - 1; j++)
		{
			if (qun[j] == 0 && ming[j] == n - 1)
			{
				System.out.print(j);
				flag = 0;
			}
		}
		if (j == i - 1 && flag == 1)
		{
				System.out.print("NOT FOUND");
		}
			return 0;
	}
}

