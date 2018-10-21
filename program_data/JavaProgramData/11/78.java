package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int[] data1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] data2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int in = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		if (year % 4 == 0 || year % 100 == 0 && year % 400 == 0)
		{
			int i = month - 1;
			for (; i >= 0; i--)
			{
				in += data2[i];
			}
			in += day;
		}
		else
		{
			int i = month - 1;
			for (; i >= 0; i--)
			{
				in += data1[i];
			}
			in += day;
		}
		System.out.printf("%d\n",in);
		return 0;
	}
}

