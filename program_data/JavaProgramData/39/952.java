package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String name = "";
		int[] qimo = new int[100];
		int[] ban = new int[100];
		final String xue = "";
		final String xi = "";
		int[] lun = new int[100];
		int n;
		int[] sum = new int[100];
		int max = 0;
		final String ma = "";
		int i;
		int j;
		int k;
		int zong = 0;
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
				name = tangible.StringFunctions.changeCharacter(name, i, tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				qimo[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				ban[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				xue = tangible.StringFunctions.changeCharacter(xue, i, tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				xi = tangible.StringFunctions.changeCharacter(xi, i, tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				lun[i] = Integer.parseInt(tempVar7);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (qimo[i] > 80 && lun[i] >= 1)
			{
				sum[i] = sum[i] + 8000;
			}
			if (qimo[i] > 85 && ban[i] > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (qimo[i] > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (qimo[i] > 85 && xi.charAt(i) == 'Y')
			{
				sum[i] = sum[i] + 1000;
			}
			if (ban[i] > 80 && xue.charAt(i) == 'Y')
			{
				sum[i] = sum[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max < sum[i])
			{
					 max = sum[i];
					 ma = name.charAt(i);
			}
			zong = zong + sum[i];
		}
		System.out.printf("%s\n%d\n%d",ma,max,zong);
		return 0;
	}


}

