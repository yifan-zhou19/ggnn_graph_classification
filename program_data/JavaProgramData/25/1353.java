package <missing>;

public class GlobalMembers
{
	//**********************
	//*?????2?N??
	//*?????? 1300012850
	//*???2013/11/19
	//***********************
	public static int Main()
	{
		int[] a = new int[10000];
		int n;
		int sum = 1;
		int i;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i < 10000; i++)
		{
			a[i] = 0;
		}
		a[0] = 1;
		for (k = 1; k <= n; k++)
		{
			for (i = 0; i < sum; i++)
			{
				a[i] *= 2;
			}
			for (i = 0; i < sum; i++)
			{
				if (a[i] >= 10)
				{
					a[i + 1] = a[i + 1] + a[i] / 10;
				if (i + 1 == sum)
				{
					sum++;
				}
				a[i] = a[i] % 10;
				}
			}
		}
		for (i = sum - 1;i >= 0;i--)
		{
			System.out.print(a[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

