package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int fea = 0;
		int ma = 0;
		int k;
		double[] shengao = new double[50];
		double[] fe = new double[50];
		double[] m = new double[50];
		double e;
		char[][] sex = new char[50][8];
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
				sex[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shengao[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex[i],"male") == 0)
			{
				ma++;
				m[ma - 1] = shengao[i];
			}
			else
			{
				fea++;
				fe[fea - 1] = shengao[i];
			}
		}
		for (k = 1;k <= ma;k++)
		{
			for (i = 0;i < ma - k;i++)
			{
				if (m[i] > m[i + 1])
				{
					e = m[i + 1];
					m[i + 1] = m[i];
					m[i] = e;
				}
			}
		}
		for (k = 1;k <= fea;k++)
		{
			for (i = 0;i < fea - k;i++)
			{
				if (fe[i] < fe[i + 1])
				{
					e = fe[i + 1];
					fe[i + 1] = fe[i];
					fe[i] = e;
				}
			}
		}
		for (i = 0;i < ma;i++)
		{
			System.out.printf("%.2lf ",m[i]);
		}
		for (i = 0;i < fea;i++)
		{
			if (i == fea - 1)
			{
				System.out.printf("%.2lf",fe[i]);
			}
			else
			{
				System.out.printf("%.2lf ",fe[i]);
			}
		}
		return 0;
	}
}

