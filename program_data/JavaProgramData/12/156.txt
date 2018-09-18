package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] x = new int[100][15];
		int[] a = new int[100];
		int[] b = new int[100];
		int m;
		int i;
		int j;
		int k;
			for (i = 0;;i++)
			{
				for (j = 0;i < 15;j++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						x[i][j] = Integer.parseInt(tempVar);
					}
					if (x[i][j] == 0 || x[i][j] == -1)
					{
											 a[i] = j;
											 break;
					} //a[i]???i??????
				}
				if (x[i][j] == -1)
				{
					m = i;
					break;
				} //m??????????
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < a[i];j++)
				{
					for (k = 0;k < a[i];k++)
					{
						if ((float)x[i][k] / (float)x[i][j] == 2.0)
						{
							b[i]++; //b[i]???i???????????
						}
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				System.out.printf("%d\n",b[i]);
			}
			return;
	}
}

