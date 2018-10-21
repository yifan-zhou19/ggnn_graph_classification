package <missing>;

public class GlobalMembers
{
	/*
	 *????1049 ????
	 *?????
	 *??: 2010-12-15
	 */


	public static int Main()
	{
		int num; //??????
		int i;
		int m; //m???????n?????t????
		int n = 0;
		int t = 0;
		int[] j = new int[20];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (num > 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (i = 0;i < m;i++)
				{
					j[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				for (i = 0;i < m;i++)
				{
					if (j[0] > 60)
					{
						System.out.print(60);
						System.out.print("\n");
						break;
					}
					n = j[i];
					t = 3 * i + j[i];
					if (t + 3 > 60)
					{ //??????????60,????????
						System.out.print(n);
						System.out.print("\n");
						break; //??
					}
					t = t + 3;
					if (i == m - 1)
					{
						n = n + (60 - t); //????????
						System.out.print(n);
						System.out.print("\n");
						break; //??
					}
					else
					{
						if (t + j[i + 1] - j[i] > 60)
						{ //????????????????
							n = n + (60 - t);
							System.out.print(n);
							System.out.print("\n");
							break; //??
						}
					}
				}
			}
			num--;
		}
		return 0;
	}

}

