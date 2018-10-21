package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int num1;
		int num2;
		double sum = 0;
		int[] a = new int[300];
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		sum = sum / n;
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		num1 = 0;
		i = 0;
		while (a[i] == a[0])
		{
			num1++;
			i++;
		}
		num2 = 0;
		i = n - 1;
		while (a[i] == a[n - 1])
		{
			num2++;
			i--;
		}
		if (2 * sum - a[0] - a[n - 1] < 0.000001 && a[0] + a[n - 1] - 2 * sum < 0.000001)
		{
			for (i = 0;i < num1;i++)
			{
				System.out.print(a[0]);
				System.out.print(",");
			}
			for (i = 0;i < num2 - 1;i++)
			{
				System.out.print(a[n - 1]);
				System.out.print(",");
			}
			System.out.print(a[n - 1]);
		}
		else if (2 * sum - a[0] - a[n - 1] >= 0.000001)
		{
			for (i = 0;i < num1 - 1;i++)
			{
				System.out.print(a[0]);
				System.out.print(",");
			}
		System.out.print(a[0]);
		}
		else
		{
			for (i = 0;i < num2 - 1;i++)
			{

				System.out.print(a[n - 1]);
				System.out.print(",");
			}
				System.out.print(a[n - 1]);
		}
		return 0;

	}
}

