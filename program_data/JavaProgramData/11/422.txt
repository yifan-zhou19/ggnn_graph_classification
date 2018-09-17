package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] y = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int Y;
		int M;
		int D;
		int sum = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			D = Integer.parseInt(tempVar3);
		}
		if ((Y % 4 == 0 && Y % 100 != 0) || Y % 400 == 0)
		{
			for (i = 1;i <= M - 1;i++)
			{
				sum += y[i - 1];
			}
			sum = sum + D;
		}
		else
		{
			for (i = 1;i <= M - 1;i++)
			{
				sum += +x[i - 1];
			};
			sum = sum + D;
		}
			System.out.printf("%d",sum);
			return 0;
	}
}

