package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[5];
		int[] b = new int[5];
		int i;
		int j;
		int k;
		for (a[0] = 1; a[0] <= 5; a[0]++)
		{
			for (a[1] = 1; a[1] <= 5; a[1]++)
			{
				for (a[2] = 1; a[2] <= 5; a[2]++)
				{
					for (a[3] = 1; a[3] <= 5; a[3]++)
					{
						for (a[4] = 1; a[4] <= 5; a[4]++)
						{
							if (a[0] == a[1] || a[0] == a[2] || a[0] == a[3] || a[0] == a[4] || a[2] == a[1] || a[3] == a[1] || a[4] == a[1] || a[2] == a[3] || a[2] == a[4] || a[3] == a[4] || a[4] == 2 || a[4] == 3)
							{
								continue;
							}
							b[0] = (a[4] == 1);
							b[1] = (a[1] == 2);
							b[2] = (a[0] == 5);
							b[3] = (a[2] != 1);
							b[4] = (a[3] == 1);
							for (i = 0; i < 5;i++)
							{
								if (a[i] == 1)
								{
									j = i;
								}
								if (a[i] == 2)
								{
									k = i;
								}
							}
							if (b[j] == 1 && b[k] == 1 && ((b[0] + b[1] + b[2] + b[3] + b[4]) == 2))
							{
								System.out.print(a[0]);
								System.out.print(" ");
								System.out.print(a[1]);
								System.out.print(" ");
								System.out.print(a[2]);
								System.out.print(" ");
								System.out.print(a[3]);
								System.out.print(" ");
								System.out.print(a[4]);
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
