package <missing>;

public class GlobalMembers
{
	//???????
	//??????
	//?????2010-11-20
	//???????????????????????????????


	public static int Main()
	{
		int z; //a????????10KG?
		int q;
		int s;
		int l;
		int[] a = new int[5];
		int t;
		int i;
		int j;
		char[] n = {'0', 'z', 'q', 's', 'l'}; //n????
		char tt;
		for (z = 1;z <= 5;z++) //??
		{
			for (q = 1;q <= 5;q++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (((z + q) == (s + l)) && ((z + l) > (s + q)) && ((z + s) < q)) //??
						{
									a[1] = z;
									a[2] = q;
									a[3] = s;
									a[4] = l;
									for (i = 1;i <= 4;i++) //??
									{
										for (j = i + 1;j <= 4;j++)
										{
											if (a[i] < a[j])
											{
												t = a[i];
												a[i] = a[j];
												a[j] = t;
												tt = n[i];
												n[i] = n[j];
												n[j] = tt;
											}
										}
									}
									break;
						}
					}
				}
			}
		}
		for (i = 1;i <= 3;i++)
		{
			System.out.print(n[i]);
			System.out.print(" ");
			System.out.print(a[i]);
			System.out.print(0);
			System.out.print("\n");
		}
		System.out.print(n[4]);
		System.out.print(" ");
		System.out.print(a[4]);
		System.out.print(0);
		return 0;
	}

}
