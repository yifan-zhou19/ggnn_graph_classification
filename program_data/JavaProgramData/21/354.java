package <missing>;

public class GlobalMembers
{
	public static int bubble_sort(float[][] a, float[][] b, int n)
	{
		int i;
		int j = 0;
		int count;
		float temp1;
		float temp2;
		for (j = 1; j < n; j++)
		{
			for (i = 0; i < n - j; i++)
			{
				if (a[i][1] < a[i + 1][1])
				{
					temp1 = a[i][0];
					temp2 = a[i][1];
					a[i][0] = a[i + 1][0];
					a[i][1] = a[i + 1][1];
					a[i + 1][0] = temp1;
					a[i + 1][1] = temp2;
				}
			}
		}
		j = 0;
		for (i = 0; i < n; i++)
		{
			if (a[0][1] == a[i][1])
			{
				b[j][0] = a[i][0];
				b[j][1] = a[i][1];
				j++;
			}
			if (a[0][1] != a[i][1])
			{
				break;
			}
		}
		count = i;
		for (j = 1; j < count; j++)
		{
			if (b[0][1] == 0F)
			{
				break;
			}
			else
			{
			for (i = 0; i < count - j; i++)
			{
				if (b[i][0] > b[i + 1][0] && b[i + 1][0] != 0F)
				{
					temp1 = b[i][0];
					temp2 = b[i][1];
					b[i][0] = b[i + 1][0];
					b[i][1] = b[i + 1][1];
					b[i + 1][0] = temp1;
					b[i + 1][1] = temp2;
				}
			}
			}
		}
		return (count);
	}


	public static int Main()
	{
		float[][] a = new float[300][2];
		float sum = 0F;
		float[][] b = new float[300][2];
		int n;
		int i;
		int count;
		float average;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Float.parseFloat(tempVar2);
			}
			sum = sum + a[i][0];
		}
		average = (float)sum / n;
		for (i = 0; i < n; i++)
		{
			if (a[i][0] - average > 0F)
			{
				a[i][1] = a[i][0] - average;
			}
			else
			{
				a[i][1] = average - a[i][0];
			}
		}
		count = bubble_sort(a, b, n);
		for (i = 0; i < count; i++)
		{
			if (i == 0)
			{
				System.out.printf("%.0f", b[i][0]);
			}
			else
			{
				System.out.printf(",%.0f", b[i][0]);
			}
		}
		System.out.print("\n");
		return 0;
	}

}

