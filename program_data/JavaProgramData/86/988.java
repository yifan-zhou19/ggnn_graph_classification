package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] m = new int[100];
		int[][] sz = new int[100][60];
		int i;
		int j;
		int time;
		int num;
		int z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			num = 0;
			z = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
			for (time = 1;time <= 60;time++)
			{
				num++;
				if (num == sz[i][z])
				{
					z++;
					if (time < 57)
					{
						num = num - 3;
					}
					else
					{
						break;
					}
				}
			}
			System.out.printf("%d\n",num);
		}
		return 0;
	}
}

