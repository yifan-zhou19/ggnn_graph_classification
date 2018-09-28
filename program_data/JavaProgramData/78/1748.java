package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[] a = {'z', 'q', 's', 'l'};
		char temp1;
		int[] weight = new int[4];
		int temp;
		for (weight[0] = 10; weight[0] <= 50; weight[0] += 10)
		{
			for (weight[1] = 10; weight[1] <= 50; weight[1] += 10)
			{
				for (weight[2] = 10; weight[2] <= 50; weight[2] += 10)
				{
					weight[3] = weight[0] + weight[1] - weight [2];
					if (weight[0] + weight[3] > weight[1] + weight[2] && weight[0] + weight[2] < weight[1])
					{
							for (int i = 0; i < 4; i++)
							{
								for (int j = 0; j < 3 - i; j++)
								{
									if (weight[j] < weight[j + 1])
									{
										temp = weight[j + 1];
										weight[j + 1] = weight[j];
										weight[j] = temp;
										temp1 = a[j + 1];
										a[j + 1] = a[j];
										a[j] = temp1;
									}
								}
							}
							for (int i = 0; i < 4; i++)
							{
								System.out.print(a[i]);
								System.out.print(" ");
								System.out.print(weight[i]);
								System.out.print("\n");
							}
					}
				}
			}
		}
		return 0;
	}
}
