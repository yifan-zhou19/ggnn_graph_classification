package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[4];
	int[] b = new int[4];
	char c;
	for (a[1] = 10;a[1] <= 50;a[1] = a[1] + 10)
	{
		for (a[2] = 10;a[2] <= 50;a[2] = a[2] + 10)
		{
			for (a[3] = 10;a[3] <= 50;a[3] = a[3] + 10)
			{
				for (a[4] = 10;a[4] <= 50;a[4] = a[4] + 10)
				{
					if ((a[1] + a[2] == a[3] + a[4]) && (a[1] + a[4] > a[2] + a[3] && (a[1] + a[3] < a[2])))
					{
						b[1] = 10000 * a[1] + 'z';
						b[2] = 10000 * a[2] + 'q';
						b[3] = a[3] * 10000 + 's';
						b[4] = a[4] * 10000 + 'l';
						System.out.print("l ");
						System.out.print(a[4]);
						System.out.print("\n");
					for (int k = 40;k >= 10;k = k - 10)
					{
						for (int i = 1;i <= 4;i++)
						{
							if (a[i] == k)
							{
								c = (b[i] % 10000);
								System.out.print(c);
								System.out.print(" ");
								System.out.print(a[i]);
								System.out.print("\n");
							}
						}
					}
					}
				}
			}
		}
	}
	return 0;
	}
}
