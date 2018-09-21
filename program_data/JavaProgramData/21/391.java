package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[300];
		int flag = 0;
		int i;
		double ave;
		double sum = 0;
		double max = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum += a[i];
		}
		ave = sum / n;
		for (i = 0; i < n; i++)
		{
			if (Math.abs(a[i] - ave) - max > 1e-5)
			{
				max = Math.abs(a[i] - ave);
			}
		}
		for (i = 0; i < n; i++)
		{
			if (Math.abs(Math.abs(a[i] - ave) - max) < 1e-5 && flag == 0)
			{
				System.out.print(a[i]);
				flag = 1;
			}
			else if (Math.abs(Math.abs(a[i] - ave) - max) < 1e-5 && flag == 1)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}
		return 0;
	}

}

