package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int w;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			w = Integer.parseInt(tempVar);
		}
		mon[0] = 13;
		for (i = 1; i < 13; i++)
		{
		   mon[i] = mon[i - 1] + month[i - 1];
		   a = ((mon[i] % 7) + w - 1) % 7;
		   if (a == 5)
		   {
			   System.out.printf("%d\n",i);
		   }
		}
		return 0;
	}
}

