package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		for (z = 1;z < 6;z++)
		{
			for (q = 1;q < 6;q++)
			{
				for (s = 1;s < 6;s++)
				{
					for (l = 1;l < 6;l++)
					{
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							if (q > l)
							{
								System.out.printf("q %d\n",q * 10);
								if (s > l)
								{
									System.out.printf("s %d\n",s * 10);
									System.out.printf("l %d\n",l * 10);
									System.out.printf("z %d\n",z * 10);
								}
								else
								{
									System.out.printf("l %d\n",l * 10);
									System.out.printf("s %d\n",s * 10);
									System.out.printf("z %d\n",z * 10);
								}
							}
							else
							{
								System.out.printf("l %d\n",l * 10);
								System.out.printf("q %d\n",q * 10);
								System.out.printf("z %d\n",z * 10);
								System.out.printf("s %d\n",s * 10);
							}
						}
					}
				}
			}
		}
		return 0;
	}
}
