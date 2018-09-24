package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int x;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= x;i++,i++)
		{
			for (j = 3;j <= x;j++,j++)
			{
				for (m = 2;m <= Math.sqrt(j);m++)
				{
					if (j % m == 0)
					{
						break;
					}
				}
				if (m > Math.sqrt(j))
				{
					for (k = 2;k <= Math.sqrt(i - j);k++)
					{
						if ((i - j) % k == 0)
						{
						break;
						}
					}
					if (k > Math.sqrt(i - j))
					{
						break;
					}
				}
			}
			System.out.printf("%d=%d+%d\n",i,j,i - j);
		}
	}


}

