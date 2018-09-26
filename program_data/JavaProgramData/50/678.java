package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] day = new int[12];
		day[1] = 31;
		day[2] = 28;
		day[3] = 31;
		day[4] = 30;
		day[5] = 31;
		day[6] = 30;
		day[7] = 31;
		day[8] = 31;
		day[9] = 30;
		day[10] = 31;
		day[11] = 30;
		day[12] = 31;
		int n;
		int i;
		int s = 12;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			if (n + 5 > 7 && n + 5 - 7 == 5)
			{
		System.out.print("1\n");
			}
		   for (i = 2;i <= 12;i++)
		   {
			s += day[i - 1];
			a = n + s % 7;
			if (a > 7 && a - 7 == 5)
			{
				System.out.printf("%d\n",i);
			}
			if (a == 5)
			{
				System.out.printf("%d\n",i);
			}
		   }
		   return 0;
	}
}

