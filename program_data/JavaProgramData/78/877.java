package <missing>;

public class GlobalMembers
{
	public static void sort(int a,int b,int c,int d)
	{
		int[] result = {a, b, c, d};
		char[] name = {'z', 'q', 's', 'l'};
		int temp;
		char tempname;
		for (int i = 0;i < 4;i++)
		{
			for (int j = i;j < 4;j++)
			{
				if (result[i] < result[j])
				{
					temp = result[i];
					result[i] = result[j];
					result[j] = temp;

					tempname = name[i];
					name[i] = name[j];
					name[j] = tempname;
				}
			}
		}

		for (int i = 0;i < 4;i++)
		{
			System.out.print(name[i]);
			System.out.print(" ");
			System.out.print(result[i] * 10);
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
							sort(z, q, s, l);
						}
					}
				}
			}
		}
			return 0;
	}

}
