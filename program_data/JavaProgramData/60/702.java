package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i < n - 1;i = i + 2)
		{
			for (j = 3;j < Math.sqrt(i);j = j + 2)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j > Math.sqrt(i))
			{
				for (k = 3;k < Math.sqrt(i + 2);k = k + 2)
				{
					if ((i + 2) % k == 0)
					{
						break;
					}
				}
				if (k > Math.sqrt(i + 2))
				{
					System.out.printf("%d %d\n",i,i + 2);

					num++;
				}
			}
		}
		if (num == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}

}

