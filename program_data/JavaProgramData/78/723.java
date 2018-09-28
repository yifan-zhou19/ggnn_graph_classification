package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z = 0; //???????????????z,q,s,l
		int q = 0;
		int s = 0;
		int l = 0;
		for (z = 1;z <= 5;z++)
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							break;
						}
					}
					if (z + q == s + l && z + l > s + q && z + s < q)
					{
						break;
					}
				}
				if (z + q == s + l && z + l > s + q && z + s < q)
				{
					break;
				}
			}
			if (z + q == s + l && z + l > s + q && z + s < q)
			{
				break;
			}
		} //???????z,q,s,l
		int[] v = {z, q, s, l};
		int vm = 0; //???????
		char[] c = {'z', 'q', 's', 'l'};
		char cm = 'a'; //???????
		for (int i = 0;i < 4;i++)
		{
			for (int j = 0;j < 4;j++)
			{
				if (v[i] > v[j])
				{
						vm = v[i];
						v[i] = v[j];
						v[j] = vm;
						cm = c[i];
						c[i] = c[j];
						c[j] = cm;
				}
			}
		} //?????????????????????????
		for (int k = 0;k < 4;k++)
		{
			System.out.print(c[k]);
			System.out.print(" ");
			System.out.print(v[k] * 10);
			System.out.print("\n");
		}
		return 0;
	}

}
