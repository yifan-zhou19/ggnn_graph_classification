package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[32]; //???????????i?????j????????
		float[][] c = new float[12][12];
		int i;
		int j;
		int m = 0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= 3 * n;i++)
		{
			a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i < n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				c[i][j] = Math.sqrt((a[i * 3 - 1] - a[j * 3 - 1]) * (a[i * 3 - 1] - a[j * 3 - 1]) + (a[i * 3 - 2] - a[j * 3 - 2]) * (a[i * 3 - 2] - a[j * 3 - 2]) + (a[i * 3] - a[j * 3]) * (a[i * 3] - a[j * 3])); //????
			}
		}
		int e;
		int f;
		int z = 0;
		int y;
		int g;
		y = n * (n - 1) / 2; //????????
		for (g = y;g >= 1;g--) //???????????
		{
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					z = 0;
					for (e = 1;e < n;e++)
					{
						for (f = e+1;f <= n;f++)
						{
							if (c[i][j] >= c[e][f]) //????
							{
								z = z + 1;
							}
						}
					}
					if (z == g)
					{
						System.out.print("(");
						System.out.print(a[i * 3 - 2]);
						System.out.print(",");
						System.out.print(a[i * 3 - 1]);
						System.out.print(",");
						System.out.print(a[i * 3]);
						System.out.print(")-(");
						System.out.print(a[j * 3 - 2]);
						System.out.print(",");
						System.out.print(a[j * 3 - 1]);
						System.out.print(",");
						System.out.print(a[j * 3]);
						System.out.print(")=");
						System.out.printf("%0.2f", c[i][j]);
						System.out.print("\n");
					}
				}

			}
		}
			return 0;
	}

}

