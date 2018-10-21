package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //n?????p????????s??????????m??????????
		int p = 0;
		int s = 0;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double t = 0; //t???????????????????double?
		int[][] a = new int[10][3]; //a????????b?????????????d???b?????
		int[][] b = new int[45][6];
		int[] d = new int[45];
		double[] c = new double[45]; //c????????

		for (int i = 0;i < n;i++) //????????
		{
			for (int j = 0;j < 3;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < n - 1;i++) //????????????b
		{
			for (int j = i + 1;j < n;j++)
			{
					for (int k = 0;k < 3;k++)
					{
						b[p][k] = a[i][k];
						b[p][k + 3] = a[j][k];
					}
					c[p] = Math.sqrt((double)((b[p][0] - b[p][3]) * (b[p][0] - b[p][3]) + (b[p][1] - b[p][4]) * (b[p][1] - b[p][4]) + (b[p][2] - b[p][5]) * (b[p][2] - b[p][5]))); //?????????c
					d[p] = p; //???d??b????
					p = p + 1;
			}
		}

		for (int i = 0;i < p - 1;i++)
		{
			for (int j = 0;j < p - 1 - i;j++)
			{
			  if (c[j] < c[j + 1])
			  {
					t = c[j];
					c[j] = c[j + 1];
					c[j + 1] = t;
					s = d[j];
					d[j] = d[j + 1];
					d[j + 1] = s; //?????????????????????????????????
			  }
			}
		}

		for (int i = 0;i < p;i++)
		{
				m = d[i];
				System.out.print("(");
				System.out.print(b[m][0]);
				System.out.print(",");
				System.out.print(b[m][1]);
				System.out.print(",");
				System.out.print(b[m][2]);
				System.out.print(")-(");
				System.out.print(b[m][3]);
				System.out.print(",");
				System.out.print(b[m][4]);
				System.out.print(",");
				System.out.print(b[m][5]);
				System.out.print(")=");
				System.out.printf("%.2f",c[i]);
				System.out.print("\n");
		}

		return 0;
	}


}

