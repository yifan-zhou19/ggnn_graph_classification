package <missing>;

public class GlobalMembers
{
	//**********************************
	//****       ??????      *****
	//****        1200012718       *****
	//**        ???????        **
	//**********************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] x = new int[11]; //??????xyz?????????????
		int[] y = new int[11];
		int[] z = new int[11];
		double[] x1 = new double[11]; //?????
		double[] y1 = new double[11];
		double[] z1 = new double[11];
		double[] d = new double[46]; //d??????10????45???
		int[] begin = new int[46]; //??????????????
		int[] end = new int[46];
		for (int i = 1;i <= n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			x1[i] = x[i];
			y1[i] = y[i];
			z1[i] = z[i];
		} //??????????
		int k = 1; //???k?????d??????????
		for (int i = 1;i <= n;i++)
		{
			for (int j = i + 1;j <= n;j++)
			{
				d[k] = Math.sqrt((x1[i] - x1[j]) * (x1[i] - x1[j]) + (y1[i] - y1[j]) * (y1[i] - y1[j]) + (z1[i] - z1[j]) * (z1[i] - z1[j]));
				begin[k] = i;
				end[k] = j;
				k++;
			} //???????begin end??????
		}
			for (int i = 1;i <= n * (n - 1) / 2 - 1;i++) //????
			{
				for (int j = 1;j <= n * (n - 1) / 2 - i;j++)
				{
					if (d[j] < d[j + 1])
					{
						double m = d[j];
						d[j] = d[j + 1];
						d[j + 1] = m; //??????????????????????
						int t = begin[j];
						begin[j] = begin[j + 1];
						begin[j + 1] = t;
						t = end[j];
						end[j] = end[j + 1];
						end[j + 1] = t;
					}
				}
			}
				for (int i = 1;i <= n * (n - 1) / 2;i++)
				{
					System.out.print("(");
					System.out.print(x[begin[i]]);
					System.out.print(",");
					System.out.print(y[begin[i]]);
					System.out.print(",");
					System.out.print(z[begin[i]]);
					System.out.print(")-(");
					System.out.print(x[end[i]]);
					System.out.print(",");
					System.out.print(y[end[i]]);
					System.out.print(",");
					System.out.print(z[end[i]]);
					System.out.print(")=");
					System.out.printf("%.2f\n",d[i]); //?????
				}

				return 0;
	}

}

