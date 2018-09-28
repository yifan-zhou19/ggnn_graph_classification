package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][3];
		double[] ss = new double[200];
		int[][] s = new int[200][7];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < 3;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		int x;
		int y;
		int z;
		int count = 0;

		for (int i = 0;i < n;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
					x = a[i][0] - a[j][0];
					y = a[i][1] - a[j][1];
					z = a[i][2] - a[j][2];

					ss[count] = Math.sqrt(x * x + y * y + z * z);
					s[count][1] = a[i][0];
					s[count][2] = a[i][1];
					s[count][3] = a[i][2];
					s[count][4] = a[j][0];
					s[count][5] = a[j][1];
					s[count][6] = a[j][2];
					count++;
			}
		}

		int temp;
		for (int i = 0;i < count;i++)
		{
			for (int j = 0;j < count - 1;j++)
			{
					if (ss[j] < ss[j + 1])
					{
							double temp2 = ss[j];
							ss[j] = ss[j + 1];
							ss[j + 1] = temp2;
							temp = s[j][1];
							s[j][1] = s[j + 1][1];
							s[j + 1][1] = temp;
							temp = s[j][2];
							s[j][2] = s[j + 1][2];
							s[j + 1][2] = temp;
							temp = s[j][3];
							s[j][3] = s[j + 1][3];
							s[j + 1][3] = temp;
							temp = s[j][4];
							s[j][4] = s[j + 1][4];
							s[j + 1][4] = temp;
							temp = s[j][5];
							s[j][5] = s[j + 1][5];
							s[j + 1][5] = temp;
							temp = s[j][6];
							s[j][6] = s[j + 1][6];
							s[j + 1][6] = temp;
					}
			}
		}
		for (int i = 0;i < count;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",s[i][1],s[i][2],s[i][3],s[i][4],s[i][5],s[i][6],ss[i]);
		}


		return 0;
	}

}

