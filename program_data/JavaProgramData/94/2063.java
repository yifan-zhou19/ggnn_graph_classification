package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[510];
		int[] b = new int[510];
		int m = 0;
		int t = 0;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b[i] = 0;
		}
	for (int ii = 0;ii < n;ii++)
	{
			if (a[ii] % 2 == 1)
			{
				b[m] = a[ii];
		num++;
			}
		if (a[ii] % 2 == 0)
		{
		b[ii] = 100000000;
		}
	m++;
	}
	for (int ii = 0;ii < n - 1;ii++)
	{
			for (int j = 0;j < n - 1 - ii;j++)
			{
				if (b[j + 1] < b[j])
				{
						t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
	}
	System.out.print(b[0]);
	for (int ai = 1;ai < num;ai++)
	{
		System.out.print(",");
		System.out.print(b[ai]);
	}
		return 0;
	}
}

