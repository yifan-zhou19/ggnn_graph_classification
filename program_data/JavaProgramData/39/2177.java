package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] name = new char[100][100];
		char[][] student = new char[100][5];
		char[][] west = new char[100][5];
		int[] final = new int[100];
		int[] clas = new int[100];
		int[] essay = new int[100];
		int[] scholarship = new int[100];
		int n;
		int total = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
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
				final[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				clas[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				student[i] = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				west[i] = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				essay[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (final[i] > 80 && essay[i] >= 1)
			{
				scholarship[i] = scholarship[i] + 8000;
			}
			if (final[i] > 85 && clas[i] > 80)
			{
				scholarship[i] = scholarship[i] + 4000;
			}
			if (final[i] > 90)
			{
				scholarship[i] = scholarship[i] + 2000;
			}
			if (west[i][0] == 'Y' && final[i] > 85)
			{
				scholarship[i] = scholarship[i] + 1000;
			}
			if (student[i][0] == 'Y' && clas[i] > 80)
			{
				scholarship[i] = scholarship[i] + 850;
			}
			total = total + scholarship[i];
		}
		int max = 0;
		int k;
		for (i = 0;i < n;i++)
		{
			if (scholarship[i] > max)
			{
				max = scholarship[i];
				k = i;
			}
		}
		System.out.printf("%s\n",name[k]);
		System.out.printf("%d\n%d\n",scholarship[k],total);
	}

}

