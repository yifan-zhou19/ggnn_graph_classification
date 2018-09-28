package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int[] a = new int[1000];
		int i = 0;
		int j = 0;
		double[] b = new double[1000]; //n?????????a?????b????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum = 0; //sum???????????max?????????
		double max = 0;
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = sum + a[i];
		}
		sum = sum / n; //???????
		for (i = 0; i < n - 1; i++)
		{
			for (j = 0; j < n - i - 1; j++)
			{
				if (a[j] > a[j + 1])
				{
					int temp = 0;
					temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				} //??
			}
		}
		for (i = 0; i < n; i++)
		{
			b[i] = Math.abs(a[i] - sum); //?????????
		}
		for (i = 0; i < n; i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		for (i = 0; i < n; i++) //????????
		{
			if (b[i] == max)
			{
				System.out.print(a[i]);
				break;
			}
		}
		for (i = i + 1; i < n ; i++)
		{
			if (b[i] == max)
			{
				System.out.print(',');
				System.out.print(a[i]);
			}
		}

		return 0;
	}
}

