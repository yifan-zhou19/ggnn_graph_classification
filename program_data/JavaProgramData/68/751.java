package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 6;i <= n;i = i + 2)
		{
			System.out.printf("%d=",i);
			for (j = 3;j <= i / 2;j = j + 2)
			{
				for (k = 3;k <= Math.sqrt(i);k = k + 2)
				{
					if (j % k == 0 && j != k)
					{
					break;
					}
					else if ((i - j) % k == 0 && (i - j) != k)
					{
					break;
					}
				}
				if (k >= Math.sqrt(i))
				{
					System.out.printf("%d+%d\n",j,i - j);
					break;
				}
			}
		}
	}
}

