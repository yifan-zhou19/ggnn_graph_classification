package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[5]; //??????????????????????????????
		int[] a = new int[5];
		int i;
		int num;
		for (A[0] = 1 ; A[0] <= 5 ; A[0]++)
		{
		for (A[1] = 1 ; A[1] <= 5 ; A[1]++)
		{
			if (A[0] != A[1])
			{
				for (A[2] = 1 ; A[2] <= 5 ; A[2]++)
				{
					if (A[0] != A[2] && A[1] != A[2])
					{
						for (A[3] = 1 ; A[3] <= 5 ; A[3]++)
						{
							if (A[0] != A[3] && A[1] != A[3] && A[2] != A[3])
							{
								num = 0; //????????????????????
								A[4] = 15 - A[0] - A[1] - A[2] - A[3];
								if (A[4] != 2 && A[4] != 3)
								{
									a[0] = A[4] == 1;
									a[1] = A[1] == 2;
									a[2] = A[0] == 5;
									a[3] = A[2] != 1;
									a[4] = A[3] == 1;
									for (i = 0 ; i < 5 ; i++)
									{
										if (a[i] != 0 && A[i] <= 2)
										{
											num++;
										}
										if (a[i] == 0 && A[i] >= 3)
										{
											num++;
										}
									}
								}
								if (num == 5)
								{
									for (i = 0 ; i < 4 ; i++)
									{
										System.out.print(A[i]);
										System.out.print(" ");
									}
									System.out.print(A[i]);
								}
							}
						}
					}
				}
			}
		}
		}
		return 0;
	}
}
