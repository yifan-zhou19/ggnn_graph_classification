package <missing>;

public class GlobalMembers
{
	public static int max(int x,int y)
	{
		if (x > y)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
	public static int[] dao = new int[26];
	public static int n;
	public static int fly(int high,int m)
	{
		if (m == n)
		{
			return 0;
		}
		else
		{
		if (high < dao[m])
		{
			return fly(high, m + 1);
		}
		else
		{
			return max(fly(high, m + 1), fly(dao[m], m + 1) + 1);
		}
		}
	}
	public static int Main()
	{
	   int i;
	   int j;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < n;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   dao[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   k = fly(99999, 0);
	   System.out.printf("%d",k);
	}
}

