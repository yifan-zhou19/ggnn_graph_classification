void InsertSort(int[],int);
int SaiMa = new int(int[],int[],int);
void main()
{
	int[] horse_n = new int[100]; //??
	int[][] horseTian = new int[100][1000];
	int[][] horseQi = new int[100][1000];
	int horse_i = 0; //??(???+1)
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		horse_n[horse_i] = Integer.parseInt(tempVar);
	}
	do
	{
		for (i = 0;i < horse_n[horse_i];i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				horseTian[horse_i][i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < horse_n[horse_i];i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				horseQi[horse_i][i] = Integer.parseInt(tempVar3);
			}
		}
		horse_i++;
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			horse_n[horse_i] = Integer.parseInt(tempVar4);
		}
	}while (horse_n[horse_i] != 0);

	for (i = 0;i < horse_i;i++)
	{
	InsertSort(horseTian[i],horse_n[i]);
	InsertSort(horseQi[i],horse_n[i]);
	}
	for (i = 0;i < horse_i;i++)
	{
		System.out.printf("%d\n",SaiMa(horseTian[i],horseQi[i],horse_n[i]));
	}


}
void InsertSort(int Ptr[],int length) //??????
{
	int i;
	int j;
	int key;
	for (i = 1;i < length;i++)
	{
		key = Ptr[i];
		j = i - 1;
		while (j >= 0 && Ptr[j] < key)
		{
			Ptr[j + 1] = Ptr[j];
			j = j - 1;
		}
		Ptr[j + 1] = key;
	}
}
int SaiMa(int Tian[],int Qi[],int length)
{
	int[][] l = new int[1000][1000];
	int i;
	int j;
	for (i = 0;i < length;i++)
	{
		if (Qi[i] < Tian[0])
		{
			l[i][0] = 1;
		}
		else
		{
		if (Qi[i] == Tian[0])
		{
			l[i][0] = 0;
		}
		else
		{
			l[i][0] = -1;
		}
		}
	}
	for (i = length - 2;i >= 0;i--)
	{
		for (j = 1;j < length - i;j++) //???????????????
		{
			if (Qi[i + j] < Tian[j]) //???????
			{
				l[i][j] = l[i][j - 1] + 1; //????????
			}
			else
			{
				if (Qi[i + j] > Tian[j]) //???????
				{
					l[i][j] = l[i + 1][j - 1] - 1; //????????
				}
				else //?????????
				{
					if (l[i + 1][j - 1] - 1 > l[i][j - 1]) //?????????????????
					{
						l[i][j] = l[i + 1][j - 1] - 1; //?????????????????
					}
					else //??????????????
					{
						l[i][j] = l[i][j - 1]; //?????
					}
				}
			}
		}
	}
return 200 * l[0][length - 1];
}


