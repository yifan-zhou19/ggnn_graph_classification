package <missing>;

public class GlobalMembers
{
	//***************************************************
	//* ???: ???                                  *
	//* ????????????????                *
	//* ??????                                    *
	//* ?? ?2010?11?20?                           *
	//***************************************************
	public static int Main()
	{
		char[] name = {'z', 'q', 's', 'l'}; //???????????????????
		int[] weight = new int[4]; //??????????????
		int i;
		int j;
		for (weight[0] = 1; weight[0] <= 5; weight[0]++)
		{
			for (weight[1] = 1; weight[1] <= 5; weight[1]++)
			{
				for (weight[2] = 1; weight[2] <= 5; weight[2]++)
				{
					for (weight[3] = 1; weight[3] <= 5; weight[3]++) //??????????????????
					{
						if (weight[0] + weight[1] == weight[3] + weight[2] && weight[0] + weight[3] > weight[1] + weight[2] && weight[0] + weight[2] < weight[1]) //??????
						{
							for (j = 5; j >= 1; j--)
							{
								for (i = 0; i < 4; i++) //????????? ???????50???10
								{
									if (weight[i] == j)
									{
										System.out.print(name[i]);
										System.out.print(' ');
										System.out.print(j * 10);
										System.out.print("\n");
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
