package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count;
		int il;
		int jl;
		int[][] a = new int[10][3];
		double m;
		double[] b = new double[45];
		int[][] c = new int[45][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		count = 0;


		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i][2] = Integer.parseInt(tempVar4);
			}
		} //????





		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++) //????????
			{
				m = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]) + (a[i][2] - a[j][2]) * (a[i][2] - a[j][2]));

				b[count] = m;
				c[count][0] = i;
				c[count][1] = j;
				count = count + 1;
			}
		}




		for (i = 0;i < (n - 1) * n / 2;i++)
		{
			for (j = 0;j < (n - 1) * n / 2 - 1;j++)
			{

				if (b[j] < b[j + 1])
				{
					m = b[j + 1];
					b[j + 1] = b[j];
					b[j] = m;


					il = c[j + 1][0];
					c[j + 1][0] = c[j][0];
					c[j][0] = il;


					jl = c[j + 1][1];
					c[j + 1][1] = c[j][1];
					c[j][1] = jl;
				}
				if (b[j] == b[j + 1])
				{

					m = b[j + 1];
					b[j + 1] = b[j];
					b[j] = m;


					il = c[j + 1][0];
					c[j + 1][0] = c[j][0];
					c[j][0] = il;


					jl = c[j + 1][1];
					c[j + 1][1] = c[j][1];
					c[j][1] = jl;
				}
			}
		}



		for (i = 0;i < (n - 1) * n / 2;i++)
		{
			for (j = 0;j < (n - 1) * n / 2 - 1;j++)
			{
				if (b[j] == b[j + 1])
				{
					if (c[j][0] > c[j + 1][0] || (c[j][0] == c[j + 1][0] && c[j][1] > c[j + 1][1]))
					{
						m = b[j + 1];
						b[j + 1] = b[j];
						b[j] = m;


						il = c[j + 1][0];
						c[j + 1][0] = c[j][0];
						c[j][0] = il;


						jl = c[j + 1][1];
						c[j + 1][1] = c[j][1];
						c[j][1] = jl;
					}
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			il = c[i][0];
			jl = c[i][1];
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",a[il][0],a[il][1],a[il][2],a[jl][0],a[jl][1],a[jl][2],b[i]);
		}






		return 0;
	}
}

