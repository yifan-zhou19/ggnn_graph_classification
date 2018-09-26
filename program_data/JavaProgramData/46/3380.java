package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[h][l];
		for (int i = 0;i < h;i++)
		{
			for (int j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int qs_h = 0;
		int qs_l = 0;
		int zz_h = h - 1;
		int zz_l = l - 1;
		while (qs_h <= zz_h != 0 && qs_l <= zz_l)
		{
			if (qs_h != zz_h && qs_l != zz_l)
			{
				for (int i = qs_l;i <= zz_l;i++)
				{
					System.out.printf("%d\n",sz[qs_h][i]);
				}
				for (int i = qs_h + 1;i <= zz_h;i++)
				{
					System.out.printf("%d\n",sz[i][zz_l]);
				}
				for (int i = zz_l - 1;i >= qs_l;i--)
				{
					System.out.printf("%d\n",sz[zz_h][i]);
				}
				for (int i = zz_h - 1;i >= qs_h + 1;i--)
				{
					System.out.printf("%d\n",sz[i][qs_l]);
				}
			} //???????
			if (qs_h == zz_h && qs_l != zz_l)
			{
				if (h % 2 == 1)
				{
					for (int i = qs_l;i <= zz_l;i++)
					{
						System.out.printf("%d\n",sz[qs_h][i]);
					}
				} //???
				if (h % 2 == 0)
				{
					for (int i = zz_l;i >= qs_l;i--)
					{
						System.out.printf("%d\n",sz[qs_h][i]);
					}
				} //???
			} //????
			if (qs_h != zz_h && qs_l == zz_l)
			{
				for (int i = qs_h;i <= zz_h;i++)
				{
					System.out.printf("%d\n",sz[i][qs_l]);
				}
			} //????
			if (qs_h == zz_h && qs_l == zz_l)
			{
				System.out.printf("%d\n",sz[qs_h][zz_h]);
			} //????
			qs_h++;
			qs_l++;
			zz_l--;
			zz_h--;
		}
		return 0;
	}


}

