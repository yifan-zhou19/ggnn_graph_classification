package <missing>;

public class GlobalMembers
{
	public static int yuanshi(int a,int b)
	{
		if (a > 80 && b >= 1)
		{
			return (8000);
		}
		else
		{
			return (0);
		}
	}
	public static int wusi(int a,int b)
	{
		if (a > 85 && b > 80)
		{
			return (4000);
		}
		else
		{
			return (0);
		}
	}
	public static int chengji(int a)
	{
		if (a > 90)
		{
			return (2000);
		}
		else
		{
			return (0);
		}
	}
	public static int xibu(int a,char b)
	{
		if (a > 85 && b == 'Y')
		{
			return (1000);
		}
		else
		{
			return (0);
		}
	}
	public static int gongxian(int a,char b)
	{
		if (a > 80 && b == 'Y')
		{
			return (850);
		}
		else
		{
			return (0);
		}
	}

	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct award
	//	{
	//		char name[20];
	//		int qimocj;
	//		int banpingcj;
	//		char ynganbu;
	//		char ynxibu;
	//		int lunwen;
	//		int jiangjin;
	//	}
	//	aw[100],temp;
		int N;
		int i;
		int j;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			aw[i].jiangjin = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				aw[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				aw[i].qimocj = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				aw[i].banpingcj = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				aw[i].ynganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				aw[i].ynxibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				aw[i].lunwen = tempVar7;
			}
			aw[i].jiangjin = yuanshi(aw[i].qimocj, aw[i].lunwen) + wusi(aw[i].qimocj, aw[i].banpingcj) + chengji(aw[i].qimocj) + xibu(aw[i].qimocj, aw[i].ynxibu) + gongxian(aw[i].banpingcj, aw[i].ynganbu);

		}
		for (k = 0;k < N - 1;k++)
		{
			for (j = 0;j < N - 1 - k;j++)
			{
				if (aw[j].jiangjin < aw[j + 1].jiangjin)
				{
					temp = aw[j];
					aw[j] = aw[j + 1];
					aw[j + 1] = temp;
				}
			}
		}
		sum = 0;
		for (i = 0;i < N;i++)
		{
			sum = sum + aw[i].jiangjin;
		}
			System.out.printf("%s\n%d\n%d",aw[0].name,aw[0].jiangjin,sum);

	}
}

