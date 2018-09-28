package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum;
		int[] a = {0, 0, 0, 0, 0, 0, 0};
		int i;
		sum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = sum / 100;
		sum = sum - a[1] * 100;
		a[2] = sum / 50;
		sum -= a[2] * 50;
		a[3] = sum / 20;
		sum -= a[3] * 20;
		a[4] = sum / 10;
		sum -= a[4] * 10;
		a[5] = sum / 5;
		sum -= a[5] * 5;
		a[6] = sum;
		for (i = 1;i <= 6;i++)
		{
			System.out.print(a[i]);
			System.out.print("\n");
		}

		return 0;
	}
}

