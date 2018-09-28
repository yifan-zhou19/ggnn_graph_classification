package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int max;
		int zong;
		char[][] name = new char[200][30];
		int[] qimo = new int[200];
		int[] ban = new int[200];
		int[] sum = new int[200];
		String gan = new String(new char[200]);
		String xi = new String(new char[200]);
		int[] lun = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		zong = 0;
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
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				ban[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				gan = tangible.StringFunctions.changeCharacter(gan, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tangible.StringFunctions.changeCharacter(xi, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				lun[i] = Integer.parseInt(tempVar7);
			}
			sum[i] = 0;
			if (qimo[i] > 80)
			{
				if (lun[i] >= 1)
				{
					sum[i] += 8000;
				}

			}
			if (gan.charAt(i) == 'Y' && ban[i] > 80)
			{
				sum[i] += 850;
			}
			if (qimo[i] > 85)
			{
				if (ban[i] > 80)
				{
					sum[i] += 4000;
				}
				if (xi.charAt(i) == 'Y')
				{
					sum[i] += 1000;
				}

			}
			if (qimo[i] > 90)
			{
				sum[i] += 2000;
			}
		   zong += sum[i];
		}
		max = 0;
		for (i = 0;i < n;i++)
		{
			if (sum[max] < sum[i])
			{
				max = i;
			}
		}
		System.out.printf("%s\n%d\n",name[max],sum[max]);
		System.out.printf("%d",zong);

		return 0;
	}



}

