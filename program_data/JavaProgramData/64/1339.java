package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[10]; //????x,y,z?num?????
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int num = 0;
		double[][] a = new double[10][10]; //???????????????????????????????????????
		double[] b = new double[45];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????????
			for (int i = 0;i < n;i++)
			{
				for (int j = i + 1;j < n;j++)
				{
					a[i][j] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
					b[num] = a[i][j];
					num++;
				} //?????????????????????
			}
				double p;
				for (int i = 0;i < num - 1;i++)
				{
					for (int j = 0;j < num - 1 - i;j++)
					{
						if (b[j] < b[j + 1])
						{
							p = b[j];
							b[j] = b[j + 1];
							b[j + 1] = p;
						}
					}
				} //?????????????
					for (int k = 0;k < num;k++)
					{
						if (b[k] == b[k + 1])
						{
							continue; //??????????????????
						}
						else
						{
							for (int i = 0;i < n;i++)
							{
								for (int j = 0;j < n;j++)
								{
									if (a[i][j] == b[k])
									{ //?????????????????
										System.out.print("(");
										System.out.print(x[i]);
										System.out.print(",");
										System.out.print(y[i]);
										System.out.print(",");
										System.out.print(z[i]);
										System.out.print(")");
										System.out.print("-");
										System.out.print("(");
										System.out.print(x[j]);
										System.out.print(",");
										System.out.print(y[j]);
										System.out.print(",");
										System.out.print(z[j]);
										System.out.print(")=");
										System.out.printf("%.2lf",b[k]); //??????
										System.out.print('\n');
									}
								}
							}
						}
					}

						return 0;
	}

}

