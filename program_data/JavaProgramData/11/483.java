package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int sum = 0;
		int i = 0;
		int[] n = new int[12];
		sum = 0;
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

		if ((y % 4 == 0) && (y % 100 != 0))
		{
			n[0] = 31;
			n[1] = 29;
			n[2] = 31;
			n[3] = 30;
			n[4] = 31;
			n[5] = 30;
			n[6] = 31;
			n[7] = 31;
			n[8] = 30;
			n[9] = 31;
			n[10] = 30;
			n[11] = 31;
			for (i = 0; i < m - 1;i++)
			{
				sum += n[i];
			}
			sum += d;
			System.out.printf("%d\n",sum);
		}

		if ((y % 4 == 0) && (y % 100 == 0) && (y % 400 != 0))
		{
			n[0] = 31;
			n[1] = 28;
			n[2] = 31;
			n[3] = 30;
			n[4] = 31;
			n[5] = 30;
			n[6] = 31;
			n[7] = 31;
			n[8] = 30;
			n[9] = 31;
			n[10] = 30;
			n[11] = 31;
		   for (i = 0; i < m - 1;i++)
		   {
				sum += n[i];
		   }
			sum += d;
			System.out.printf("%d\n",sum);
		}
		if ((y % 4 == 0) && (y % 100 == 0) && (y % 400 == 0))
		{
			n[0] = 31;
			n[1] = 29;
			n[2] = 31;
			n[3] = 30;
			n[4] = 31;
			n[5] = 30;
			n[6] = 31;
			n[7] = 31;
			n[8] = 30;
			n[9] = 31;
			n[10] = 30;
			n[11] = 31;
		   for (i = 0; i < m - 1;i++)
		   {
				sum += n[i];
		   }
			sum += d;
			System.out.printf("%d\n",sum);
		}

		if (y % 4 != 0)
		{
			n[0] = 31;
			n[1] = 28;
			n[2] = 31;
			n[3] = 30;
			n[4] = 31;
			n[5] = 30;
			n[6] = 31;
			n[7] = 31;
			n[8] = 30;
			n[9] = 31;
			n[10] = 30;
			n[11] = 31;
		   for (i = 0; i < m - 1;i++)
		   {
				sum = sum + n[i];
		   }
			sum = sum + d;
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

