package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int a;
		int b;
		int c;
		int d;
		int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
		if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
		{
			days[2]++;
		}
		d = c;
		for (j = 1;j < b;j++)
		{
					d += days[j];
		}

			System.out.printf("%d\n",d);
	if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
	{


		return 0;
	}
	}


}

