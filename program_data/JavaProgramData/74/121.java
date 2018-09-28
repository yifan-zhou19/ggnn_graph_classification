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
		int t;
		int len;
		int x;
		int y;
		int num = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = m;i <= n;i++)
		{
			for (j = 2;j < i && i % j != 0;j++)
			{
				;
			}
			if (j == i)
			{
				len = (int)Math.log10(i) + 1;
				for (k = 1;k <= len;k++)
				{
					x = (i % (int)Math.pow(10,k)) / (int)Math.pow(10,k - 1);
					y = (i / (int)Math.pow(10,len - k)) % 10;
					if (x != y)
					{
						break;
					}
				}
				if (k == len + 1)
				{
					System.out.printf("%d",i);
					num = num + 1;
					break;
				}
			}
		}
		for (t = i + 1;t <= n;t++)
		{
			for (j = 2;j < t && t % j != 0;j++)
			{
				;
			}
			if (j == t)
			{
				len = (int)Math.log10(t) + 1;
				for (k = 1;k <= len;k++)
				{
					x = (t % (int)Math.pow(10,k)) / (int)Math.pow(10,k - 1);
					y = (t / (int)Math.pow(10,len - k)) % 10;
					if (x != y)
					{
						break;
					}
				}
				if (k == len + 1)
				{
					System.out.printf(",%d",t);
					num = num + 1;
				}
			}
		}
		if (num == 0)
		{
			System.out.print("no");
		}


	}


}

