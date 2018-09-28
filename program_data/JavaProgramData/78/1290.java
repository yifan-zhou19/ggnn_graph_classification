package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4]; //a[0] == z    a[1] == q       a[2] == s       a[3] == l
		int g = 0;
		int i;
		int max = 0;
		int temp;
		int max1 = 0;
		int max2 = 0;
		int max3 = 0;
		char[] b = {'z', 'q', 's', 'l'};
		for (a[0] = 10; a[0] <= 50; a[0] += 10)
		{
			for (a[1] = 10; a[1] <= 50; a[1] += 10)
			{
				for (a[2] = 10; a[2] <= 50; a[2] += 10)
				{
					for (a[3] = 10; a[3] <= 50; a[3] += 10)
					{
						if (a[0] != a[1] && a[0] != a[2] && a[0] != a[3] && a[1] != a[2] && a[1] != a[3] && a[2] != a[3] && (a[0] + a[1] == a[2] + a[3]) && (a[0] + a[3] > a[1] + a[2]) && (a[0] + a[2] < a[1]))
						{
							g = 1;
							break;
						}
					}
					if (g == 1)
					{
						break;
					}
				}
				if (g == 1)
				{
					break;
				}
			}
			if (g == 1)
			{
				break;
			}
		}
		for (i = 0; i < 4; i++)
		{
			if (a[i] > max)
			{
				max = a[i];
				temp = i;
			}
		}
		System.out.print(b[temp]);
		System.out.print(" ");
		System.out.print(max);
		System.out.print("\n");
		for (i = 0; i < 4; i++)
		{
			if (a[i] == max)
			{
				continue;
			}
			if (a[i] > max1)
			{
				max1 = a[i];
				temp = i;
			}
		}
		System.out.print(b[temp]);
		System.out.print(" ");
		System.out.print(max1);
		System.out.print("\n");
		for (i = 0; i < 4; i++)
		{
			if (a[i] == max || a[i] == max1)
			{
				continue;
			}
			if (a[i] > max2)
			{
				max2 = a[i];
				temp = i;
			}
		}
		System.out.print(b[temp]);
		System.out.print(" ");
		System.out.print(max2);
		System.out.print("\n");
		for (i = 0; i < 4; i++)
		{
			if (a[i] == max || a[i] == max1 || a[i] == max2)
			{
				continue;
			}
			if (a[i] > max3)
			{
				max3 = a[i];
				temp = i;
			}
		}
		System.out.print(b[temp]);
		System.out.print(" ");
		System.out.print(max3);
		System.out.print("\n");
		return 0;
	}
}
