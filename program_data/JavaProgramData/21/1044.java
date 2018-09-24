package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int n;
		int[] a = new int[300];
		int t;
		int num = 0;
		int[] re = new int[300];
		double ave = 0;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ave += a[i];
		}
		ave /= n;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < Math.abs((double)a[i] - ave))
			{
				max = Math.abs((double)a[i] - ave);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (Math.abs(max - Math.abs((double)a[i] - ave)) < 1E-5)
			{
				re[num] = a[i];
				num++;
			}
		}
		if (num == 1)
		{
			System.out.print(re[0]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(re[0]);
			for (i = 1;i < num;i++)
			{
				System.out.print(",");
				System.out.print(re[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

