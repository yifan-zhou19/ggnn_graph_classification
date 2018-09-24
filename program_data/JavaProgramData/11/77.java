package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int md = 0;
		int d;
		int day;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < m - 1;i++)
		{
			md = md + month[i];
		}
		day = md + d;
		System.out.printf("%d",day);
		return 0;
	}
}

