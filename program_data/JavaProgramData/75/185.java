package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int tmax = 0;
		int[][] a = new int[3][1001];
		a[1][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int tmin = a[1][1];
		int sum = 1;
		while (System.in.read() == ',')
		{
			a[1][sum + 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[1][sum + 1] < tmin)
			{
				tmin = a[1][sum + 1];
			}
			sum++;
		}
		for (int i = 1;i < sum;i++)
		{
			a[2][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[2][i] > tmax)
			{
				tmax = a[2][i];
			}
			System.in.read();
		}
		a[2][sum] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a[2][sum] > tmax)
		{
			tmax = a[2][sum];
		}
		System.out.print(sum);
		System.out.print(" ");
		int ren = 0;
		for (int t = tmin;t <= tmax;t++)
		{
			int temp = 0;
			for (int i = 1;i <= sum;i++)
			{
				if (t >= a[1][i] != 0 && t < a[2][i])
				{
					temp++;
				}
			}
			if (ren < temp)
			{
				ren = temp;
			}
		}
		System.out.print(ren);

		return 0;
	}


}

