package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] name = new char[100][20];
		char[] g = {'Y', 'N'};
		char[] x = {'Y', 'N'};
		char gg;
		char xx;
		int n;
		int score;
		int pscore;
		int article;
		int b;
		int[] num = new int[100];
		int i;
		int maxnum;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			num[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				score = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				pscore = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gg = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xx = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				article = Integer.parseInt(tempVar7);
			}
			if (score > 80 && article >= 1)
			{
				num[i] += 8000;
			}
			if (score > 85 && pscore > 80)
			{
				num[i] += 4000;
			}
			if (score > 90)
			{
				num[i] += 2000;
			}
			if (score > 85 && xx == x[0])
			{
				num[i] += 1000;
			}
			if (pscore > 80 && gg == g[0])
			{
				num[i] += 850;
			}
			sum += num[i];
		}
		b = 0;
		maxnum = num[0];
		for (i = 1;i < n;i++)
		{
			if (num[i] > maxnum)
			{
				maxnum = num[i];
				b = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n", name[b],maxnum,sum);
		return 0;
	}







}

