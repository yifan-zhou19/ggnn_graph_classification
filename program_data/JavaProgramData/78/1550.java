package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] weight = new int[4]; //weight[i]??????????c2,c3,c4???????????????
		int c2;
		int c3;
		int c4;
		int sum;
		int i;
		int j;
		int t;
		char[] name = {'z', 'q', 's', 'l'}; //name[i]?????????
		char c;
		for (weight[0] = 10;weight[0] <= 50;weight[0] += 10)
		{
			for (weight[1] = 10;weight[1] <= 50;weight[1] += 10)
			{
				if (weight[1] == weight[0]) //?q???=z????????????,?????????z,q,s,l?????????
				{
					continue;
				}
				for (weight[2] = 10;weight[2] <= 50;weight[2] += 10)
				{
					if (weight[2] == weight[0] || weight[2] == weight[1])
					{
						continue;
					}
					for (weight[3] = 10;weight[3] <= 50;weight[3] += 10)
					{
						if (weight[3] == weight[0] || weight[3] == weight[1] || weight[3] == weight[2])
						{
							continue;
						}
						c2 = (weight[0] + weight[1] == weight[2] + weight[3]); //?z?q??????s?l??????c2???1?
						c3 = (weight[0] + weight[3] > weight[1] + weight[2]); //?z?l??????q?s??????c3???1?
						c4 = (weight[0] + weight[2] < weight[1]); //?z?s??????q?????c4???1?
						sum = c2 + c3 + c4; //??????????sum=3?
						if (sum == 3)
						{
							for (i = 0;i < 4;i++) //????????????????????
							{
								for (j = 3;j > i;j--)
								{
									if (weight[j] > weight[j - 1])
									{
										t = weight[j - 1];
										weight[j - 1] = weight[j];
										weight[j] = t;
										c = name[j - 1];
										name[j - 1] = name[j];
										name[j] = c;
									}
								}
								System.out.print(name[i]);
								System.out.print(" ");
								System.out.print(weight[i]);
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
