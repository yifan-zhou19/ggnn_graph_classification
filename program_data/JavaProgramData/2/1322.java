package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		char[][] zuozhe = new char[100][100];
		int[] shuhao = new int[100];
		int[] zuo = new int[200];
		int[][] shu = new int[200][200];
		int n = 0;
		int p;
		int i;
		int j;
		int[] m = new int[200];

		for (i = 0;i < 200;i++)
		{
			zuo[i] = 0;
		   m[i] = 0;
		}

		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				shuhao[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				zuozhe[i] = tempVar3.charAt(0);
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;(zuozhe[i][j]) != '\0';j++)
			{
				zuo[(zuozhe[i][j])] = zuo[(zuozhe[i][j])] + 1;
				shu[(zuozhe[i][j])][(m[(zuozhe[i][j])])] = shuhao[i];
				m[(zuozhe[i][j])] = m[(zuozhe[i][j])] + 1;
			}
		}
		for (i = 65;i <= 90;i++)
		{
			if (zuo[i] > n)
			{
				n = zuo[i];
				p = i;
			}
		}
		System.out.printf("%c\n",p);
		System.out.printf("%d\n",zuo[p]);
		for (i = 0;i < m[p];i++)
		{
			System.out.printf("%d\n",shu[p][i]);
		}

		return 0;
	}



}

