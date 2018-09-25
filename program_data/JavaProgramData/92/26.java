package <missing>;

public class GlobalMembers
{
	public static int Compare(Object a, Object b)
	{
		return *(int)b - (int)a;
	}
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int WinCount(tangible.RefObject<int> Q, tangible.RefObject<int> T, int n);
	public static int max(int a, int b)
	{
		return (a > b)? a: b;
	}

	// infoSource = Keyboard(0) or File(1)


	// reference from http://zhidao.baidu.com/question/38869821.html
	/*
	??????????????????a?????????????b??
	???????????????????????????????????? 
	???????????????? 
	????????????????????? 
	?????????????????????????????????????? 
	??????l(i?j)??????i?????j?????????j????????????????
	*/

	public static int Main()
	{
		int n;
		int[] TianJi = new int[1000];
		int[] QiWang = new int[1000];
		int i;
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *pwin[1000];
		int[] pwin = new int[1000];
	//	int win[100][100];

	/*
	win[i][j]??????i??????i?j???j+1?????????j+1????????????????
	*(pwin[i]+j) = win[i][j];
	?????l[i][0]??????i??????????????? 
	*/

		FILE fp;
		fp = fopen("horse.txt", "r");

		for (i = 0; i < 1000; i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			if ((pwin[i] = (int)malloc((Integer.SIZE / Byte.SIZE) * 1000)) == null)
			{
				System.out.print("Error: memory out!");
			return 1;
			}
		}

		while (true)
		{
			fscanf(fp, "%d", n);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}


			for (i = 0; i < n; i++)
			{
				fscanf(fp, "%d", TianJi[i]);
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					TianJi[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0; i < n; i++)
			{
				fscanf(fp, "%d", QiWang[i]);
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					QiWang[i] = Integer.parseInt(tempVar3);
				}
			}


			qsort((Object) TianJi[0], n, (Integer.SIZE / Byte.SIZE), Compare);
			qsort((Object) QiWang[0], n, (Integer.SIZE / Byte.SIZE), Compare);


			for (i = 0; i < n; i++)
			{
				if (TianJi[0] > QiWang[i])
				{
					*(pwin[i] + 0) = 1;
				}
				else if (TianJi[0] < QiWang[i])
				{
					*(pwin[i] + 0) = -1;
				}
				else
				{
					*(pwin[i] + 0) = 0;
				}
			}

	//		for(i=n-2;i>=0;i--){
	//			for(j=1;j<n-i;j++){

			for (j = 1; j < n; j++)
			{
				for (i = n - 1 - j; i >= 0; i--)
				{

					//	Calculate win[i][j]
					if (TianJi[j] > QiWang[i + j])
					{
						*(pwin[i] + j) = *(pwin[i] + j - 1) + 1;
					}
					else if (TianJi[j] < QiWang[i + j])
					{
						*(pwin[i] + j) = *(pwin[i + 1] + j - 1) - 1;
					}
					else
					{
						*(pwin[i] + j) = max(*(pwin[i] + j - 1), *(pwin[i + 1] + j - 1) - 1);
					}
				}
			}

	//	download and modified from http://zhidao.baidu.com/question/38869821.html
	/*
			for(i=n-2;i>=0;i--)
				for(j=1;j<n-i;j++)
					if(QiWang[i+j]<TianJi[j])
						*(pwin[i]+j)=*(pwin[i]+j-1)+1;
					else if(QiWang[i+j]>TianJi[j])
						*(pwin[i]+j)=*(pwin[i+1]+j-1)-1;
					else
						*(pwin[i]+j)=max(*(pwin[i+1]+j-1)-1,*(pwin[i]+j-1));
	*/

			System.out.printf("%d\n", *(pwin[0] + n - 1) * 200);


		}
		fclose(fp);


		return 0;
	}

}

