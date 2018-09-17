package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int[] a = new int[3];
		int CC1 = (a[1] > a[0]) + (a[2] == a[0]);
		int CC2 = (a[0] > a[1]) + (a[0] > a[2]);
		int CC3 = (a[2] > a[1]) + (a[2] > a[0]);
		int[] b = {CC1, CC2, CC3};
		int temp;
		char[] c = {'A', 'B', 'C'};
		char t;
		for (a[0] = 0;a[0] < 3;a[0]++)
		{
			for (a[1] = 0;a[1] < 3;a[1]++)
			{
				for (a[2] = 0;a[2] < 3;a[2]++)
				{
					if ((b[0] + a[0] == 2) && (b[1] + a[1] == 2) && (b[2] + a[2] == 2))
					{
						for (i = 0;i < 3;i++)
						{
							for (j = 0;j < 3 - i - 1;j++)
							{
								if (a[j] < a[j + 1])
								{
									temp = a[j];
										t = c[j];
										a[j] = a[j + 1];
										c[j] = c[j + 1];
										a[j + 1] = temp;
										c[j + 1] = t;
								}
							}
						}
						for (i = 2;i >= 0;i--)
						{
							System.out.print(c[i]);
						}
					}
				}
			}
		}
		return 0;
	}
}
