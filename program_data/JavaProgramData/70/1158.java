package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		double[][] d = new double[20][2]; //????????????
		double[] jl = new double[200];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++) //?????
		{
			d[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			d[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++) //?????
		{
			for (j = i + 1;j < n;j++)
			{
				jl[k] = Math.sqrt((d[j][0] - d[i][0]) * (d[j][0] - d[i][0]) + (d[j][1] - d[i][1]) * (d[j][1] - d[i][1]));
				k++;
			}
		}
		t = jl[0]; //???????
		for (i = 0;i < k;i++)
		{
			if (jl[i] > t)
			{
				t = jl[i];
			}
		}
		System.out.printf("%.4f\n",t);
		return 0;
	}

}

