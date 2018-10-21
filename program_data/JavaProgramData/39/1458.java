package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int max;
		int n;
		int i;
		int g = 0;
		int sum;
		int qimo;
		int banji;
		int lunwen;
		int[] zong = new int[200];
		char[][] name = new char[200][20];
		char ganbu;
		char xibu;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				banji = Integer.parseInt(tempVar4);
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
			zong[i] = 0;
			if (qimo > 80 && lunwen >= 1)
			{
					zong[i] = zong[i] + 8000;
			}
				if (banji > 80 && qimo > 85)
				{
					zong[i] = zong[i] + 4000;
				}
					if (qimo > 90)
					{
					zong[i] = zong[i] + 2000;
					}
						if (qimo > 85 && xibu == 'Y')
						{
					zong[i] = zong[i] + 1000;
						}
							if (banji > 80 && ganbu == 'Y')
							{
					zong[i] = zong[i] + 850;
							}
		}

	max = zong[0];
	sum = zong[0];
	for (i = 1;i < n;i++)
	{
	if (zong[i] > max)
	{
	max = zong[i];
	g = i;
	}
		sum = sum + zong[i];
	}
	for (i = 0;i < String.valueOf(name[g]).length();i++)
	{
		System.out.printf("%c",name[g][i]);
	}
	System.out.printf("\n%d\n%d",zong[g],sum);
	}

}

