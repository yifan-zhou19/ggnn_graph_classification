package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[400];
		int small = 0;
		int smalln = 0;
		int big = 0;
		int bign = 0;
		int i;
		float sum = 0F;
		float average;
		float flag = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		average = sum / n;
		for (i = 1;i <= n;i++)
		{

			if ((a[i] - average >= flag) || (a[i] - average <= (-flag)))
			{
				if ((a[i] - average) > 0)
				{
					big = a[i];
					bign = 1;
					flag = a[i] - average;
				}
				else
				{
					small = a[i];
					smalln = 1;
					flag = average - a[i];
				}
			}
		}
		if (smalln == 1 && bign == 0)
		{
			System.out.printf("%d",small);
		}
		if (smalln == 0 && bign == 1)
		{
			System.out.printf("%d",big);
		}
		if (smalln == 1 && bign == 1)
		{
			if ((big - average) > (average - small))
			{
				System.out.printf("%d",big);
			}
			else if ((big - average) < (average - small))
			{
				System.out.printf("%d",small);
			}
			else
			{
				System.out.printf("%d,%d",small,big);
			}
		}
	}
}

