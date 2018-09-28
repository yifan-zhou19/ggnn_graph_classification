package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] result = new int[SCALE][SCALE]; //??
		int[][] temp = new int[SCALE][SCALE]; //??
		int i;
		int j;
		int day;
		int m;
		int n;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		result[SCALE / 2][SCALE / 2] = m; //????????
		for (day = 0;day < n;day++) //????????
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,(Integer.SIZE / Byte.SIZE)); //??????????
			for (i = 0;i < SCALE;i++)
			{
				for (j = 0;j < SCALE;j++)
				{
					temp[i][j] += result[i][j];
					//???????????
					for (x = -1;x <= 1;x++)
					{
						for (y = -1;y <= 1;y++) //???+1????+1
						{
							if ((i + x >= 0) && (i + x < SCALE) && (j + y >= 0) && (j + y < SCALE))
							{
								temp[i + x][j + y] += result[i][j];
							}
						}
					}
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			memcpy(result,temp,(Integer.SIZE / Byte.SIZE));
		}
		for (i = 0;i < SCALE;i++)
		{
			for (j = 0;j < SCALE-1;j++)
			{
				System.out.printf("%d ",result[i][j]);
			}
			System.out.printf("%d\n",result[i][SCALE-1]);
		}
		return 0;
	}
}

