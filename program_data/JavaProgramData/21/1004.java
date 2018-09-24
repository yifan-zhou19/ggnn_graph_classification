package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int add = 0;
		int temp1 = 0;
		int k = 0;
		double ave;
		double[] c = new double[300];
		double[] b = new double[300];
		double temp = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			add = add + a[i];
		}
		ave = (double)add / (double)n;
		for (int j = 0;j < n - 1;j++)
		{
			for (int i = 0;i < n - j - 1;i++)
			{
				if (a[i] > a[i + 1])
				{
					temp1 = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp1;
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			b[i] = Math.abs((double)a[i] - ave); //b[i]????????????
			if (b[i] > temp)
			{
				temp = b[i]; //?temp??????
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (b[i] == temp)
			{
				c[k] = a[i];
				k++;
			}
		}
		System.out.print(c[0]);
		if (k >= 1)
		{
			for (int q = 1;q < k;q++)
			{
				System.out.print(',');
				System.out.print(c[q]);
			}
		}
		return 0;
	}
}

