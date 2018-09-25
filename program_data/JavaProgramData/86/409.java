package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] time = new int[100];
		int[][] fail = new int[100][20];
		int[] m = new int[100];
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (m[i] != 0)
			{

				for (j = 0;j < m[i];j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						fail[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
			else
			{
				continue;
			}


		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 100;j++)
			{
				time[j] = 1;
			}
			if (m[i] != 0)
			{

				for (j = 0;j < m[i];j++)
				{
					time[fail[i][j] + j * 3] = time[fail[i][j] + 1 + j * 3] = time[fail[i][j] + 2 + j * 3] = 0;
				}


				sum = 0;
				for (j = 0;j < 60;j++)
				{

					sum += time[j];

				}
				System.out.printf("%d\n",sum);
			}
			else
			{
				System.out.print("60\n");
			}

		}
		return 0;
	}

}

