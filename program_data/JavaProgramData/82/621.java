package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] hour = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] data = new int[100][2];
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				data[i][1] = Integer.parseInt(tempVar3);
			}
			if (data[i][0] >= 90 && data[i][0] <= 140 && data[i][1] >= 60 && data[i][1] <= 90)
			{
				hour[j]++;
			}
			else
			{
				j++;
			}
		}
		int j0 = j;
		int h = 0;
		for (j = 0;j <= j0;j++)
		{
			if (h < hour[j])
			{
				h = hour[j];
			}
		}
		System.out.printf("%d",h);
		return 0;
	}
}

