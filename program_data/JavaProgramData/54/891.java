package <missing>;

public class GlobalMembers
{
	public static int sum(int x, int y)
	{
		int m;
		int i;
		for (m = 1,i = 1;i <= x;i++)
		{
			m *= x;
		}
		m -= (x - 1) * y;
		return m;
	}
	public static void Main()
	{
	   int n;
	   int k;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   k = Integer.parseInt(tempVar2);
	   }
	   System.out.printf("%d\n",sum(n, k));
	}
}

