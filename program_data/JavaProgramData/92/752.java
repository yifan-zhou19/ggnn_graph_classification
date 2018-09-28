package <missing>;

public class GlobalMembers
{
	public static int[] King = new int[1000];
	public static int[] TianJi = new int[1000];

	public static int Partition(int[] A, int p, int q)
	{
		int i;
		int j;
		int x = A[p];
		int temp;
		i = p;
		for (j = p + 1;j <= q;j++)
		{
			if (A[j] >= x)
			{
					i += 1;
					temp = A[j];
					A[j] = A[i];
					A[i] = temp;
			}
		}
		 temp = A[i];
		 A[i] = A[p];
		 A[p] = temp;
		 return i;
	}


	public static int QuikSort(int[] A, int p, int r) //????
	{
		int q;
		if (p < r)
		{
		q = Partition(A, p, r);
		QuikSort(A, p, q - 1);
		QuikSort(A, q + 1, r);
		}
		return 0;
	}

	public static int score(int[] A, int[] B, int n) //A?B?????????????A??????????B?????????
	{
	 int Money = 0;
	 int i;
	 int j;
	 int k;
	 int m;
	 i = 0;
	 m = 0;
				 while (i + m != n - 1) //?????????????
				 {

				   if (i == 0 && m == 0)
				   {
				   j = 0;
				   k = 0;
				   }
				  // printf("\n%d %d %d %d",i,m,j,k);
				   if (A[j] > B[i]) //????????????????????????
				   {
				   Money += 1;
				   j++;
				   i++;
				   }
				   else if (A[n - k - 1] > B[n - m - 1]) //????????????????????????
				   {
				   Money += 1;
				   k++;
				   m++;
				   }
				   else //??????????????????
				   {
					   if (A[n - k - 1] < B[i])
					   {
					   Money -= 1;
					   }
					   k++;
					   i++;
				   }
				 }
				if (A[j] > B[i]) //?????????????
				{
				   Money += 1;
				}
				   else if (A[j] < B[i])
				   {
				   Money -= 1;
				   }

	 return Money;
	}

	public static int Main()
	{
		int n;
		int i;
		int Money;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (true)
		{
				Money = 0;
				for (i = 0;i < n;i++)
				{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					TianJi[i] = Integer.parseInt(tempVar2);
				}
				}
				for (i = 0;i < n;i++)
				{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					King[i] = Integer.parseInt(tempVar3);
				}
				}
				QuikSort(TianJi, 0, n - 1);
			   // for(i=0;i<n;i++)
				//printf("%d ",TianJi[i]);
				QuikSort(King, 0, n - 1);
			  //  printf("%d \n",score(TianJi,King,n));
				Money = score(TianJi, King, n);
				System.out.printf("%d\n",Money * 200);
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					n = Integer.parseInt(tempVar4);
				}
				if (n == 0)
				{
					break;
				}
		}
	}

}

