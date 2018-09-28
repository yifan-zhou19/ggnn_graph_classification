package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //??????
		int i;
		int j;
		int k;
		int[] x = new int[10]; //?????????
		int[] y = new int[10];
		int[] z = new int[10];
		float[] d = new float[90]; //?????????0
		float temp = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;++i)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i <= n - 2;++i)
		{
			for (j = i + 1;j <= n - 1;++j)
			{
				d[10 * i + j] = Math.sqrt((double)((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]))); //????
			}
		}
		for (j = 1;j <= (n - 1) * n / 2;++j) //???? ??????
		{
			for (i = 1;i <= 89;++i)
			{
				if (d[i] == 0F)
				{
					continue; //???0 ?????? continue
				}
				if (d[i] > temp)
				{
					temp = d[i]; //????
					k = i;
				}
			}
			System.out.print("(");
			System.out.print(x[k / 10]);
			System.out.print(",");
			System.out.print(y[k / 10]);
			System.out.print(",");
			System.out.print(z[k / 10]);
			System.out.print(")");
			System.out.print("-");
			System.out.print("(");
			System.out.print(x[k % 10]);
			System.out.print(",");
			System.out.print(y[k % 10]);
			System.out.print(",");
			System.out.print(z[k % 10]);
			System.out.print(")");
			System.out.print("=");
			System.out.printf("%.2f", temp);
			System.out.printf("%.2f", "\n");
			d[k] = 0F; //???0
			temp = 0F; //???0
			k = 0; //???0 ??????
		}
		return 0;
	}


}

