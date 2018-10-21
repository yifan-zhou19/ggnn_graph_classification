package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[10001];
	public static int Main()
	{
	   int i;
	   int n;
	   int m = 0;
	   int t = 0;
	   int x;
	   int y;
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
			x = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		if (x >= 90 && x <= 140 && y <= 90 && y >= 60)
		{
			t++;
			m = m > t != 0?m:t;
		}
		else
		{
			t = 0;
		}
		}
		System.out.printf("%d",m);
		return 0;
	}

}

