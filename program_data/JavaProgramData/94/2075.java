package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[500];
		int[] ji = new int[500];
		int num = 0;
		int i;
		int j;
		int t;
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 == 1)
			{
				ji[num] = a[i];
				num = num + 1;
			}
		}
		for (i = num - 1;i >= 1;i--)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (ji[j] > ji[j + 1])
				{
					t = ji[j];
					ji[j] = ji[j + 1];
					ji[j + 1] = t;
				}
			}
		}
		System.out.print(ji[0]);
		for (i = 1;i <= num - 1;i++)
		{
			System.out.print(",");
			System.out.print(ji[i]);
		}
	}
}

