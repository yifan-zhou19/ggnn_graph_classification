package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] pingjun = new int[100];
		int[] pingyi = new int[100];
		int[] jiangjin = new int[100];
		int lunwen;
		char[][] xingming = new char[100][21];
		char ganbu;
		char xibu;
		int jiangjinzongshu = 0;
		for (int i = 0;i < n;i++)
		{
			jiangjin[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xingming[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pingjun[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pingyi[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				ganbu = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xibu = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lunwen = Integer.parseInt(tempVar7);
			}
			if (pingjun[i] > 80 && lunwen >= 1)
			{
				jiangjin[i] += 8000;
			}
			if (pingjun[i] > 85 && pingyi[i] > 80)
			{
				jiangjin[i] += 4000;
			}
			if (pingjun[i] > 90)
			{
				jiangjin[i] += 2000;
			}
			if (pingjun[i] > 85 && xibu == 'Y')
			{
				jiangjin[i] += 1000;
			}
			if (pingyi[i] > 80 && ganbu == 'Y')
			{
				jiangjin[i] += 850;
			}
			jiangjinzongshu += jiangjin[i];
		}
		int m = 0;
		for (int r = 0;r < n;r++)
		{
			if (jiangjin[r] > jiangjin[m])
			{
				m = r;
			}
		}
		System.out.printf("%s\n%d\n%d\n",xingming[m],jiangjin[m],jiangjinzongshu);
		return 0;
	}
}

