package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int max = 0;
		int[] weight = new int[4];
		int pos;
		char[] num = {'z', 'q', 's', 'l'};

		for (z = 10; z <= 50; z = z + 10)
		{
			for (q = 10; q <= 50; q = q + 10)
			{
				for (s = 10; s <= 50; s = s + 10)
				{
					for (l = 10; l <= 50; l = l + 10)
					{
						if ((z + q == l + s) && ((z + l) > (s + q)) && (z + s) < q)
						{
							weight[0] = z;
							weight[1] = q;
							weight[2] = s;
							weight[3] = l;
						}
					}
				}
			}
		}
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				if (weight[j] > max)
				{
					max = weight[j];
					pos = j;
				}
			}

			System.out.print(num[pos]);
			System.out.print(" ");
			System.out.print(max);
			System.out.print("\n");
			max = 0;
			weight[pos] = 0;
		}

		return 0;
	}

}
