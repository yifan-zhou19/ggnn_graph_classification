package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		int z;
		if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
	return z;
	}
	public static void Main()
	{
		int i;
		int m;
		int[][] n = new int[5][3];
		int[] total = new int[5];
		for (i = 0;i <= 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i][0] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				n[i][1] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n[i][2] = Integer.parseInt(tempVar3);
			}
		}
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i <= 4;i++)
		{
			month[1] = 28 + leap(n[i][0]);
			total[i] = 0;
			for (m = 0;m <= n[i][1] - 2;m++)
			{
				total[i] = total[i] + month[m];
			}
			total[i] = total[i] + n[i][2];
			System.out.printf("%d\n",total[i]);
		}
	}
}

