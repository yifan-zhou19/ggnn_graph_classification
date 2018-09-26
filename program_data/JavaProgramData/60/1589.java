package <missing>;

public class GlobalMembers
{
	public static int issushu(int x)
	{
		int k;
		int half;
		int issushu = 1;
		if (x == 1)
		{
			issushu = 0;
			return issushu;
		}
		else if (x % 2 == 0)
		{
			if (x == 2)
			{
				return issushu;
			}
			else
			{
				issushu = 0;
				return issushu;
			}
		}
		half = x / 2;
		for (k = 3;k <= half;k = k + 2)
		{
			if (x % k == 0)
			{
				issushu = 0;
				break;
			}
		}
		return issushu;
	}
	public static int Main()
	{
	   int n;
	   int i;
	   int issushu1;
	   int issushu2;
	   int a = 0;
	   int[] sz = new int[10000];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   sz[i] = i + 1;
	   }
	   for (i = 0;i < n;i++)
	   {
		   issushu1 = issushu(sz[i]);
		   issushu2 = issushu(sz[i + 2]);
		   if (issushu1 != 0 && issushu2 != 0)
		   {
			   System.out.printf("%d %d\n",sz[i],sz[i + 2]);
			   a++;
		   }
	   }
	   if (a == 0)
	   {
		   System.out.print("empty");
	   }
	   return 0;
	}
}

