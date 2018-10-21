package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int max1;
		int max2;
		float[] x = new float[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		}
		max1 = x[0];
		max2 = x[0];
		for (i = 0;i <= n;i++)
		{
			if (x[i] > max1)
			{
				max1 = x[i];
				k = i;
			}
			else if (x[i] < max2)
			{
				max2 = x[i];
			}
		}
		if (k != 0)
		{
			for (i = 0;i < k;i++)
			{
				if (x[i] > max2)
				{
					max2 = x[i];
				}
			}
		}
		for (i = k + 1;i <= n;i++)
		{
			if (x[i] > max2)
			{
				max2 = x[i];
			}
		}
		System.out.print(max1);
		System.out.print("\n");
		System.out.print(max2);
		return 0;
	}
}

