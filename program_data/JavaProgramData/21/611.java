package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int he = 0;
		int temp;
		int num = 0;
		float pingjun;
		float max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			he += a[i];
		}
		pingjun = (float)he / (float)n;
		for (i = n - 1;i >= 1;i--)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (Math.abs(a[i] - pingjun) > max)
			{
				max = Math.abs(a[i] - pingjun);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (Math.abs(Math.abs(a[i] - pingjun) - max) < 0.1)
			{
				num++;
				if (num == 1)
				{
					System.out.print(a[i]);
				}
				if (num > 1)
				{
					System.out.print(",");
					System.out.print(a[i]);
				}
			}
		}
		return 0;

	}
}

