package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int nanshu = 0;
		int nvshu = 0;
		int k;
		int zongrenshu;
		double shengao;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zongrenshu = Integer.parseInt(tempVar);
		}
		double[] nanshengao = new double[zongrenshu];
		double[] nvshengao = new double[zongrenshu];
		double zhongjianliang;
		String xingbie = new String(new char[7]);
		final String nv = "female";
		final String nan = "male";
		for (i = 0;i < zongrenshu;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xingbie = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shengao = Double.parseDouble(tempVar3);
			}
			if (strcmp(xingbie,nv) == 0)
			{
				nvshengao[nvshu] = shengao;
				nvshu++;
			}
			else
			{
				nanshengao[nanshu] = shengao;
				nanshu++;
			}
		}
		for (i = 1;i <= nanshu;i++)
		{
			for (k = 0;k < (nanshu - i);k++)
			{
				if (nanshengao[k] > nanshengao[k + 1])
				{
					zhongjianliang = nanshengao[k + 1];
					nanshengao[k + 1] = nanshengao[k];
					nanshengao[k] = zhongjianliang;
				}
			}
		}
		for (i = 1;i <= nvshu;i++)
		{
			for (k = 0;k < (nvshu - i);k++)
			{
				if (nvshengao[k] < nvshengao[k + 1])
				{
					zhongjianliang = nvshengao[k + 1];
					nvshengao[k + 1] = nvshengao[k];
					nvshengao[k] = zhongjianliang;
				}
			}
		}
		for (i = 0;i < nanshu;i++)
		{
			System.out.printf("%.2lf ",nanshengao[i]);
		}
		for (i = 0;i < (nvshu - 1);i++)
		{
			System.out.printf("%.2lf ",nvshengao[i]);
		}
		System.out.printf("%.2lf",nvshengao[nvshu - 1]);
		return 0;
	}

}

