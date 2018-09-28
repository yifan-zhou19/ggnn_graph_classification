package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
		int[] p = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		p = new int[100];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p[i] + j = tempVar3;
				}
			}
		}
		System.out.printf("%d\n",*(p[0] + 0));
		j = 1;
		i = 0;
		for (;j < col;)
		{
			k = j;
			while (j >= 0 && i < row)
			{
				System.out.printf("%d\n",*(p[i] + j));
				j = j - 1;
				i = i + 1;
			}
			j = k + 1;
			i = 0;
		}
		i = 1;
		j = col - 1;
		for (;i < row;)
		{
			k = i;
			while (i < row && j >= 0)
			{
				System.out.printf("%d\n",*(p[i] + j));
				j = j - 1;
				i = i + 1;
			}
			i = k + 1;
			j = col - 1;
		}

	}

}

