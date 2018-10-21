package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] time = new int[100][60];
		int[] d = new int[20];
		int i;
		int m;
		int j;
		int b;
		int sum;


		int[][] data = new int[100][60];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{

			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 d[i] = Integer.parseInt(tempVar2);
			 }
			 if (d[i] != 0)
			 {
			 for (j = 0;j < d[i];j++)
			 {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					data[i][j] = Integer.parseInt(tempVar3);
				}

			 }
			 }
			 else
			 {
				 continue;
			 }


		}


		for (i = 0;i < m;i++)
		{
				for (j = 0;j < 1000;j++)
				{
				 time[i][j] = 1;
				}
			if (d[i] != 0)
			{
			b = 0;
			for (j = 0;j < d[i];j++)
			{

				time[i][b + data[i][j]] = 0;
				time[i][b + data[i][j] + 1] = 0;
				time[i][b + data[i][j] + 2] = 0;
				b = b + 3;
			}
			sum = 0;
			for (j = 0;j < 60;j++)
			{
				sum += time[i][j];

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

