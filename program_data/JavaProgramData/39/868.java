package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] count = new int[100];
		int[] score1 = new int[100];
		int[] score2 = new int[100];
		int[] num = new int[100];
		int i;
		char[][] name = new char[100][30];
		char[][] a = new char[100][2];
		char[][] b = new char[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				name[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				score1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				score2[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				a[i] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				b[i] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				num[i] = Integer.parseInt(tempVar7);
			}
			if (score1[i] > 80 && num[i] >= 1)
			{
				count[i] += 8000;
			}
			if (score1[i] > 85 && score2[i] > 80)
			{
				count[i] += 4000;
			}
			if (score1[i] > 90)
			{
				count[i] += 2000;
			}
			if (score1[i] > 85 && strcmp(b[i],"Y") == 0)
			{
				count[i] += 1000;
			}
			if (score2[i] > 80 && strcmp(a[i],"Y") == 0)
			{
				count[i] += 850;
			}
		}
		int max = count[0];
		int m = 0;
		int sum = count[0];
		for (i = 1;i < n;i++)
		{
			sum += count[i];
			if (count[i] > max)
			{
				max = count[i];
				m = i;
			}
		}
		System.out.printf("%s\n%d\n%d",name[m],count[m],sum);
		return 0;
	}

}

