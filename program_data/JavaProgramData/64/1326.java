package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0; //?????????
		int k = 0;
		int j = 0;
		int count = 0;
		float[] x = new float[10]; //???????
		float[] y = new float[10];
		float[] z = new float[10];
		float[] d = new float[45];
		int[][] name = new int[45][3]; //??????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < n;k++) //????
		{
			x[k] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[k] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			z[k] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (k = 0;k < n - 1;k++) //????
		{
			for (j = k + 1;j < n;j++)
			{
				d[count] = Math.sqrt((x[k] - x[j]) * (x[k] - x[j]) + (y[k] - y[j]) * (y[k] - y[j]) + (z[k] - z[j]) * (z[k] - z[j])); //??
				name[count][1] = k; //??
				name[count][2] = j; //??
				count++;
			}
		}
		for (k = 0;k < count - 1;k++) //?????
		{
			for (j = 0;j < count - 1 - k;j++)
			{
				if (d[j] < d[j + 1])
				{
					float a;
					a = d[j];
					d[j] = d[j + 1];
					d[j + 1] = a;
					a = name[j][1];
					name[j][1] = name[j + 1][1];
					name[j + 1][1] = a;
					a = name[j][2];
					name[j][2] = name[j + 1][2];
					name[j + 1][2] = a;
				}
			}
		}
		for (k = 0;k < count;k++) //??
		{
			System.out.print("(");
			System.out.print(x[name[k][1]]);
			System.out.print(",");
			System.out.print(y[name[k][1]]);
			System.out.print(",");
			System.out.print(z[name[k][1]]);
			System.out.print(")-(");
			System.out.print(x[name[k][2]]);
			System.out.print(",");
			System.out.print(y[name[k][2]]);
			System.out.print(",");
			System.out.print(z[name[k][2]]);
			System.out.print(")=");
			System.out.printf("%.2f\n",d[k]);
		}
		return 0;
	}
}

