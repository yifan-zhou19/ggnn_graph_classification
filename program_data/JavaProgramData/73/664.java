package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] max = new int[6];
		int[] min = new int[6];
		int[] row = new int[6];
		int[] line = new int[6];
		int i;
		int j;
		int[][] a = new int[6][6];
		for (i = 1;i < 6;i++)
		{
			max[i] = 0;
			for (j = 1;j < 6;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] > max[i])
				{
					max[i] = a[i][j];
					row[i] = i;
					line[i] = j;
				}
			}
		}
		//for (i=1;i<6;i++)			
		  //cout<<max[i]<<endl;
		for (i = 1;i < 6;i++)
		{
				min[i] = a[1][i];
				for (j = 1;j < 6;j++)
				{
					if (min[i] > a[j][i])
					{
						min[i] = a[j][i];
					}
				}
		}
		//for (i=1;i<6;i++)
				//cout<<min[i]<<endl;
		for (i = 1;i < 6;i++)
		{
			if (a[row[i]][line[i]] == min[line[i]])
			{
				System.out.print(row[i]);
				System.out.print(' ');
				System.out.print(line[i]);
				System.out.print(' ');
				System.out.print(a[row[i]][line[i]]);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("not found");
		return 0;
	}
}

