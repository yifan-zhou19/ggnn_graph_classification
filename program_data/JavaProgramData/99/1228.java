package <missing>;

public class GlobalMembers
{
	public static int[] t = new int[4];
	public static int Main()
	{
	   int i;
	   int n;
	   int m;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
		for (i = 0;i < m;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		if (n < 19)
		{
			t[0]++;
		}
		else if (n < 36)
		{
			t[1]++;
		}
		else if (n < 61)
		{
			t[2]++;
		}
		else
		{
			t[3]++;
		}
		}
		System.out.printf("1-18: %.2f%%\n",(double)t[0] / m * 100);
		System.out.printf("19-35: %.2f%%\n",(double)t[1] / m * 100);
		System.out.printf("36-60: %.2f%%\n",(double)t[2] / m * 100);
		System.out.printf("Over60: %.2f%%",(double)t[3] / m * 100);
		return 0;
	}

}

