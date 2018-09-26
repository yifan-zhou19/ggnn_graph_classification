package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i += 2)
		{
			System.out.printf("%d=",i);
			for (j = 3;j <= (i / 2);j += 2)
			{
				b = 1;
				for (l = 2;l <= Math.sqrt(j);l++)
				{
					if (j % l == 0)
					{
						b = 0;
					}
				}
				if (b != 0)
				{
					for (k = 2;k <= Math.sqrt(i - j);k++)
					{
						if ((i - j) % k == 0)
						{
							b = 0;
						}
					}
				}
				if (b != 0)
				{
					break;
				}
			}
			if (b != 0)
			{
				System.out.printf("%d+%d\n",j,i - j);
			}
		}
	}


}

