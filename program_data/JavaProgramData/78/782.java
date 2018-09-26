package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		int m = 0;
		int n = 0;
		int x = 0;
			 //?????z,q,s,l???????????
		for (i = 1;i <= 5;i++) //?????,???????
		{
			z = 10 * i;
			for (j = 1;j <= 5;j++)
			{
				q = 10 * j;
				if (q == z)
				{
										continue;
				}
				for (k = 1;k <= 5;k++)
				{
					s = 10 * k;
					if (s == z || s == q)
					{
							  continue;
					}
					for (m = 1;m <= 5;m++)
					{
							 l = 10 * m;
						if (l == z || l == q || l == s)
						{
								 continue;
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q)) //????????
						{
							for (n = 5;n >= 1;n--) //?????,?????????
							{
								x = n * 10;
								if (z == x)
								{

			 System.out.print("z ");
			 System.out.print(x);
			 System.out.print("\n");
								}
																	else if (q == x)
																	{
									System.out.print("q ");
									System.out.print(x);
									System.out.print("\n");
																	}
																	else if (s == x)
																	{
									System.out.print("s ");
									System.out.print(x);
									System.out.print("\n");
																	}
																	else if (l == x)
																	{
									System.out.print("l ");
									System.out.print(x);
									System.out.print("\n");
																	}
							}
						}
					}
				}
			}
		} //?????,??,??????????grids?????
		return 0;
	}

}
