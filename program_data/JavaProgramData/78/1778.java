package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] weight = new int[10];
		int[] a = new int[10];
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i <= 5;i++)
		{
			weight[1] = 10 * i;
			for (j = 1;j <= 5;j++)
			{
				if (j != i)
				{
					weight[2] = j * 10;
				}
				else
				{
					continue;
				}
				for (k = 1;k <= 5;k++)
				{
					if ((k != i) && (k != j))
					{
						weight[3] = 10 * k;
					}
					else
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if ((l != i) && (l != j) && (l != k))
						{
							weight[4] = 10 * l;
						}
						else
						{
							continue;
						}
							 if ((weight[1] + weight[2] == weight[3] + weight[4]) && (weight[1] + weight[4] > weight[2] + weight[3]) && (weight[1] + weight[3] < weight[2]))
							 {
								a[1] = weight[1];
								a[2] = weight[2];
								a[3] = weight[3];
								a[4] = weight[4];
							 }

					}
				}
			}
		}

		char[] name = {0, 'z', 'q', 's', 'l', '\0', '\0', '\0', '\0', '\0'};
		char m;
		for (i = 1;i <= 3;i++)
		{
			for (j = 1;j <= 4 - i;j++)
			{
				if (a[j] < a[j + 1])
				{
					k = a[j];
					a[j] = a[j + 1];
					a[j + 1] = k;
					m = name[j];
					name[j] = name[j + 1];
					name[j + 1] = m;
				}
			}
		}
		for (l = 1;l <= 4;l++)
		{
			System.out.print(name[l]);
			System.out.print(' ');
			System.out.print(a[l]);
			System.out.print("\n");
		}


		return 0;
	}
}
