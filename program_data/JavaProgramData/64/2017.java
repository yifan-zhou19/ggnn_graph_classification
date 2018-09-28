package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] x = new float[n];
		float[] y = new float[n];
		float[] z = new float[n];
		float[] a = new float[(n - 1) * n / 2];
		float va;
		for (int i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			y[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			z[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0,k = 0;i < n - 1;i++)
		{
			for (int j = i + 1;j < n;j++)
			{
				a[k] = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j]));
				k = k + 1;
			}
		}
		for (int i = 0;i < (n - 1) * n / 2 - 1;i++)
		{
			for (int j = 0;j < (n - 1) * n / 2 - 1 - i;j++)
			{
				if (a[j] <= a[j + 1])
				{
					va = a[j];
					a[j] = a[j + 1];
					a[j + 1] = va;
				}
			}
		}
		for (int i = 0;i < (n - 1) * n / 2;i++)
		{
			if ((a[i] == a[i + 1]) && (i != (n - 1) * n / 2 - 1))
			{
			continue;
			}
			else
			{
				for (int j = 0;j < n - 1;j++)
				{
					for (int k = j + 1;k < n;k++)
					{
						if (a[i] == Math.sqrt((x[j] - x[k]) * (x[j] - x[k]) + (y[j] - y[k]) * (y[j] - y[k]) + (z[j] - z[k]) * (z[j] - z[k])))
						{
							if (i == 0)
							{
							System.out.printf("(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f",x[j],y[j],z[j],x[k],y[k],z[k],a[i]);
							}
							else
							{
							System.out.printf("\n(%.0f,%.0f,%.0f)-(%.0f,%.0f,%.0f)=%.2f",x[j],y[j],z[j],x[k],y[k],z[k],a[i]);
							}
						}
					}
				}
			}
		}

		return 0;
	}

}

