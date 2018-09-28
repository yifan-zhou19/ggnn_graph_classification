package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[4];
		int i = 0;
		char[] A = {'z', 'q', 's', 'l'}; //??????????
		for (a[0] = 1;a[0] <= 5;a[0]++)
		{
			for (a[1] = 1;a[1] <= 5;a[1]++)
			{
				for (a[2] = 1;a[2] <= 5;a[2]++)
				{
					for (a[3] = 1;a[3] <= 5;a[3]++) //????????????
					{
						if (((a[0] + a[1]) == (a[2] + a[3])) + ((a[0] + a[3]) > (a[2] + a[1])) + ((a[0] + a[2]) < a[1]) + (a[0] != a[2]) + (a[0] != a[3]) + (a[1] != a[3]) + (a[2] != a[3]) == 7) //??????
						{
							for (i = 0;i < 5;i++)
							{
								if (a[i] == 5)
								{
									System.out.print(A[i]);
									System.out.print(' ');
									System.out.print("50");
									System.out.print("\n");
									break;
								}
							}
							for (i = 0;i < 5;i++)
							{
								if (a[i] == 4)
								{
									System.out.print(A[i]);
									System.out.print(' ');
									System.out.print("40");
									System.out.print("\n");
									break;
								}
							}
							for (i = 0;i < 5;i++)
							{
								if (a[i] == 3)
								{
									System.out.print(A[i]);
									System.out.print(' ');
									System.out.print("30");
									System.out.print("\n");
									break;
								}
							}
							for (i = 0;i < 5;i++)
							{
								if (a[i] == 2)
								{
									System.out.print(A[i]);
									System.out.print(' ');
									System.out.print("20");
									System.out.print("\n");
									break;
								}
							}
							for (i = 0;i < 5;i++)
							{
								if (a[i] == 1)
								{
									System.out.print(A[i]);
									System.out.print(' ');
									System.out.print("10");
									System.out.print("\n");
									break;
								}
							} //??a[i]???????????A[i]
						}
					}
				}
			}
		}
		return 0;
	}
}
