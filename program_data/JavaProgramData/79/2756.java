package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y)
	{
	   int i;
	   int k = 0;
	   for (i = 2;i <= x;i++)
	   {
		   k = ((y % i) + k) % i;
	   }
	  return k + 1;
	}
	public static int Main()
	{
		int i;
		int a;
		int d;
		int m;
		int n;
		int[] ad = new int[999];
		int[] sd = new int[999];
		for (i = 1;i > 0;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ad[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sd[i] = Integer.parseInt(tempVar2);
			}
			if (ad[i] == 0 && sd[i] == 0)
			{
				break;
			}

			 System.out.printf("%d\n",f(ad[i], sd[i]));
		}
		return 0;
	}
}

