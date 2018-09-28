package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[5][5];
		int i;
		int k;
		for (i = 0;i < 5;i++)
		{
			for (k = 0;k < 5;k++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					shuzu[i][k] = Integer.parseInt(tempVar);
				}
			}
		}
		int a;
		int n;
		int m;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < 5 && m < 5)
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		if (a == 0)
		{
			System.out.print("error");
		}
		if (a == 1)
		{
			int[] shu = new int[5];
			for (i = 0;i < 5;i++)
			{
				shu[i] = shuzu[n][i];
				shuzu[n][i] = shuzu[m][i];
				shuzu[m][i] = shu[i];
			}
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 4;k++)
				{
					System.out.printf("%d ",shuzu[i][k]);
				}
				 if (k == 4)
				 {
					System.out.printf("%d\n",shuzu[i][4]);
				 }
			}
		}
		return 0;
	}
}

