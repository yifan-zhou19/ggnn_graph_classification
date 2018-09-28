package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int[] shu = new int[3];
		int[] pai = new int[6];
		int i;
		char[] zi = {' ', '\0', '\0', '\0', '\0', '\0'};
	for (z = 1;z <= 5;z++)
	{
		for (q = 1;q <= 5;q++)
		{
			for (s = 1;s <= 5;s++)
			{
				for (l = 1;l <= 5;l++)
				{
					shu[0] = (z + q) == (s + l);
					shu[1] = (z + l) > (s + q);
					shu[2] = (z + s) < q;
					if (shu[0] + shu[1] + shu[2] == 3 && z != q && z != s && z != l && q != s && q != l && s != l)
					{
					pai[z] = z * 10;
					pai[q] = q * 10;
					pai[s] = s * 10;
					pai[l] = l * 10;
					zi[z] = 'z';
					zi[q] = 'q';
					zi[s] = 's';
					zi[l] = 'l';
					for (i = 5;i >= 1;i--)
					{
						if (pai[i] != 0)
						{
							System.out.print(zi[i]);
							System.out.print(' ');
							System.out.print(pai[i]);
							System.out.print("\n");
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
