package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????                  *
	//*??????                  *
	//*2012-10-19                    *
	//********************************
	public static int Main()
	{
		int z; //?????????????
		int q;
		int s;
		int l;
		int[] m = {1, 2, 3, 4};
		final String n = "zqsl"; //???????????
		char r;
		int i = 1; //???????
		int j = 1;
		int p;
		for (z = 1;z <= 5;z++) //??????????????
		{
			for (q = 1;q <= 5;q++)
			{
				if (q == z)
				{
					continue; //?????
				}
				for (s = 1;s <= 5;s++)
				{
					if (s == z || s == q)
					{
						continue;
					}
					for (l = 1;l <= 5;l++)
					{
						if (l == z || l == q || l == s)
						{
							continue;
						}
						if ((z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q) //???????????
						{
							m[0] = z,m[1] = q,m[2] = s,m[3] = l; //???m????n???
							for (i = 1;i <= 3;i++) //?????????3?
							{
								for (j = 0;j <= 3 - i;j++) //????????????
								{
									if (m[j] < m[j + 1]) //???????
									{
										p = m[j],r = n.charAt(j); //????????????????
										m[j] = m[j + 1],n[j] = n.charAt(j + 1);
										m[j + 1] = p,n[j + 1] = r;
									}
								}

							}
							for (i = 0;i <= 3;i++) //????????
							{
								System.out.print(n.charAt(i));
								System.out.print(" ");
								System.out.print(m[i] * 10);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
