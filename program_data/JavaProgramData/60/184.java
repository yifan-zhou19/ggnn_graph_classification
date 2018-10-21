package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] b = new int[10000];
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 5;i <= n;i = i + 2)
			{
				for (j = 2;j < i / 2;j++)
				{
					if (i % j == 0)
					{
				b[i]++;
					}
				}
				if (b[i] == 0 && b[i - 2] == 0)
				{
					System.out.printf("%d %d\n",i - 2,i);
				}
			}
		}

		return 0;
	}


}

