package <missing>;

public class GlobalMembers
{
	//****************************************
	//***??????**
	//***??????**
	//***???2012.10.9**
	//****************************************
	public static int Main()
	{
		int z; //??z,q,s,l?????????i,j?????w????
		int q;
		int s;
		int l;
		int i;
		int j;
		int[] w = new int[4];
		char[] n = {'z', 'q', 's', 'l'}; //???n[]????????????
		for (z = 1;z <= 5;z++)
		{
			for (q = 1; q <= 5;q++)
			{
				for (s = 1; s <= 5;s++)
				{
					for (l = 1; l <= 5;l++)
					{
						if (z != q && z != s && z != l && q != s && q != l && s != l)
						{
							if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
							{
								w[0] = z,w[1] = q,w[2] = s,w[3] = l;
							}
						}
					}
				}
			}
		}
		//??????????????????
		for (i = 5;i >= 1; i--) //???????50,40,30,20,10,??????
		{
			for (j = 0;j < 4;j++)
			{
				if (w[j] == i) //??j?????????????
				{
					System.out.print(n[j]);
					System.out.print(" ");
					System.out.print(10 * w[j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}
