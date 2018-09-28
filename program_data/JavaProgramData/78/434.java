package <missing>;

public class GlobalMembers
{
	public static void doublesort(int a,int b,int c,int d)
	{
		int[] result = {a, b, c, d};
		char[] name = {'z', 'q', 's', 'l'};

		for (int i = 0;i < 4;i++)
		{
			for (int j = i;j < 4;j++)
			{
				if (result[i] < result[j])
				{
					swap(result[i],result[j]);
					swap(name[i],name[j]);
				}
			}
		}

		for (int i = 0;i < 4;i++)
		{
			System.out.print(name[i]);
			System.out.print(" ");
			System.out.print(10 * result[i]);
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q && z != q != s != l)
						{
							doublesort(z, q, s, l);
						}
					}
				}
			}
		}
		return 0;
	}
}
