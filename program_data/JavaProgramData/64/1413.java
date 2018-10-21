package <missing>;

public class GlobalMembers
{
	/*
	*12-1
	*??? 1200012851
	*2012.12.11
	*????
	**/


	public static double dis(int x, int y, int z)
	{
		double s;
		s = Math.sqrt(x * x + y * y + z * z);
		return s;
	}

	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct distance
	//	{
	//		double d;
	//		int yi;
	//		int er;
	//	}
	//	d12[45], temp;
		int n;
		int i;
		int j;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			z[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n; j++)
			{
				d12[k].d = dis(x[i] - x[j], y[i] - y[j], z[i] - z[j]);
				d12[k].yi = i;
				d12[k].er = j;
				k++;
			}
		}
		for (i = 1; i <= k - 1; i++)
		{
			for (j = 0; j < k - i; j++)
			{
				if (d12[j].d < d12[j + 1].d)
				{
					temp = d12[j + 1];
					d12[j + 1] = d12[j];
					d12[j] = temp;
				}
			}
		}
		for (i = 0; i < k; i++)
		{
			System.out.print("(");
			System.out.print(x[d12[i].yi]);
			System.out.print(",");
			System.out.print(y[d12[i].yi]);
			System.out.print(",");
			System.out.print(z[d12[i].yi]);
			System.out.print(")-(");
			System.out.print(x[d12[i].er]);
			System.out.print(",");
			System.out.print(y[d12[i].er]);
			System.out.print(",");
			System.out.print(z[d12[i].er]);
			System.out.print(")=");
			System.out.printf("%.2f", d12[i].d);
			System.out.printf("%.2f", "\n");
		}
		return 0;
	}

}

