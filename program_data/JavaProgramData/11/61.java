package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int j = 0;
		int y;
		int i;
		int m;
		int d;
		int[] number = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < m;i++)
		{
			j += number[i - 1];
		}
		k = j + d;
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			if (m > 1)
			{
				System.out.printf("%d",k + 1);
			}
		}
		else
		{
			System.out.printf("%d",k);
		}
		return 0;
	}


}

