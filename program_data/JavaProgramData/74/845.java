package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			j = i;
			for (k = 0;j > 0;)
			{
				k = k * 10 + j % 10,j = j / 10;
			}
			if (k == i)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
					if (j == i)
					{
						if (c != 0)
						{
							System.out.printf(",%d",i);
						}
						else
						{
							System.out.printf("%d",i);
						}
						c++;
					}
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
	}


}

