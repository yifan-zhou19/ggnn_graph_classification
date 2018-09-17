package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] year = new int[5];
		int[] month = new int[5];
		int[] day = new int[5];
		int[] t = new int[5];
		int[] c = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};
		int[] b = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		for (i = 0;i <= 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				year[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				month[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				day[i] = Integer.parseInt(tempVar3);
			}
			if (year[i] % 4 == 0 && year[i] % 100 != 0 || year[i] % 400 == 0)
			{
				t[i] = c[month[i] - 1] + day[i];
			}
			else
			{
				t[i] = b[month[i] - 1] + day[i];
			}
		}
		for (i = 0;i <= 4;i++)
		{
			System.out.printf("%ld\n",t[i]);
		}
		return 0;
	}


}

