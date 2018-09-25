package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] n = new int[1000][1000];
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int zuoi = 0;
		int zuoj = 0;
		int youi = 0;
		int youj = 0;
		int jump1 = 0;
		int jump2 = 0;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < a;j++)
			{
				if (n[i][j] == 0)
				{
					zuoi = i;
					zuoj = j;
					jump2 = 1;
					break;
				}
			}
			if (jump2 == 1)
			{
				break;
			}
		}
		for (i = a - 1;i >= 0;i--)
		{
			for (j = a - 1;j >= 0;j--)
			{
				if (n[i][j] == 0)
				{
					youi = i;
					youj = j;
					jump1 = 1;
					break;
				}
			}
			if (jump1 == 1)
			{
				break;
			}
		}
		int num;
		if (youi == zuoi || youj == zuoj)
		{
			num = 0;
		}
		else
		{
			num = (youi - zuoi - 1) * (youj - zuoj - 1);
		}
		System.out.printf("%d",num);
		return 0;
	}

}

