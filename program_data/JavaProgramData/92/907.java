package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//



	public static int pk(int a,int b)
	{
		if (a > b)
		{
			return 200;
		}
		if (a < b)
		{
			return -200;
		}
		if (a == b)
		{
			return 0;
		}
	}

	public static int Main() //(int argc, _TCHAR* argv[])
	{
		int q = 1;
		for (;;q++)
		{
			int n;
			int[] qw = new int[1000];
			int[] tj = new int[1000];
			int k;
			int K;
			int money = 0;
			int i;
			int j;
			int max = -1000000;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 0;i <= n - 1;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tj[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i <= n - 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					qw[i] = Integer.parseInt(tempVar3);
				}
			}
			//if(n==180){printf("12000\n");continue;}
			for (j = 1;j <= n - 1;j++)
			{
				for (i = 0;i <= n - j - 1;i++)
				{
					if (tj[i] < tj[i + 1])
					{
						k = tj[i];
						tj[i] = tj[i + 1];
						tj[i + 1] = k;
					}
					if (qw[i] < qw[i + 1])
					{
						K = qw[i];
						qw[i] = qw[i + 1];
						qw[i + 1] = K;
					}
				}
			}
			int[] b = new int[1000];
			//b[0]=0;
			for (i = 0;i <= n - 1;i++) //?i?
			{
				money = 0;
				for (j = 0;j <= n - i - 1;j++) //??????j+1??????j+i+1?????????
				{
					money = money + pk(tj[j], qw[j + i]);
				}
				b[i] = money - i * 200;
			}
			for (i = n;i <= 999;i++)
			{
				b[i] = 0;
			}
			for (i = 0;i <= n - 1;i++)
			{
				if (b[i] > max)
				{
					max = b[i];
				}
			}
			System.out.printf("%d\n",max);
		}
	//		j=0;
	//		//if(tj[0]<qw[0])money=-200;
	//		for(i=0;i<=n-1;i++)
	//		{
	//			for(;j<=n-1;)
	//			{
	//				if(tj[i]<qw[j]){money=money-200;j=j+1;}
	//				if(tj[i]>qw[j]){money=money+200;j=j+1;break;}
	//				if(tj[i]==qw[j])
	//				{
	//					if(j==n-1){j=j+1;break;}
	//					if(tj[i+1]>qw[j+1]){j=j+1;break;}
	//					else {money=money-200;j=j+1;}
	//					
	///				}
	//			}
	//			
	//		}
	//		printf("%d\n",money);


	}


}

