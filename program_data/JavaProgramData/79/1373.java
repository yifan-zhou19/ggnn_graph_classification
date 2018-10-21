package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int i;
		int j;
		int k;
		int l;
		int x;
		int y;
		int[] bh = new int[400];
		int jishu = 0;

		for (k = 0;;k++)
		{

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}
			else
			{
				for (i = 0;i < 400;i++)
				{
					bh[i] = 0;
				}





				jishu = n;
				for (i = 0;i < n;i++)
				{
					bh[i] = 1;
				}



				for (i = 0;jishu > 1;)
				{
					if (bh[(i % n)] == 0)
					{
						/*printf("%djiji\n",i);*/
						i = (i + 1) % n;

					}
					else
					{

						for (x = 0,y = 0;x < m;)
						{
							if (bh[((i + x + y) % n)] != 0)
							{
								x++;

							}
							else
							{
								y++;
							}
						}
						bh[((i + x + y - 1) % n)] = 0;
						i = (i + x + y - 1) % n;
						jishu--;
						/*printf("%d\n",i);*/
					}
				}

				for (i = 0;i < n;i++)
				{
					if (bh[i] != 0)
					{
						System.out.printf("%d\n",i + 1);
					}
				}




			}
		}



		return 0;
	}




}

