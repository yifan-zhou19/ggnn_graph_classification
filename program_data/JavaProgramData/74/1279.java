package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int r = 0;
		int x;
		int y;
		int z;
		int k;
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
			k = (int)(Math.sqrt(i));
			for (j = 2;j <= k;j++)
			{
				if (i % j == 0)
				{
				 break;
				}
			}
			if (j > k)
			{
				x = i;
				z = i;
				y = 0;
				do
				{
					x = z % 10;
					z = z / 10;

					y = 10 * y + x;
				}while (z != 0);
				if (y == i)
				{
					r = r + 1;
				   if (r == 1)
				   {
					   System.out.printf("%d",y);
				   }
				   else
				   {
					   System.out.printf(",%d",y);
				   }
				}
			}
			else
			{
				continue;
			}
		}
		if (r == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

