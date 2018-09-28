package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m;
		int j;
		int[] score = new int[60];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					score[j] = Integer.parseInt(tempVar3);
				}
			}
			sum = 0;
			if (m == 0)
			{
			   sum += 60;
			}
			else if (m != 0)
			{
				for (j = 0;j < m;j++)
				{
					sum = 0;
					if (score[j] + 3 * j >= 60)
					{
					   sum += 60 - (3 * j);
					   break;
					}
					else
					{
					   if (score[j] <= 45)
					   {
					   sum += 60 - (3 * m);
					   }
					   else if (score[j] > 45)
					   {
					   sum += score[j];
					   break;
					   }
					}
				}
			}
			System.out.printf("%d\n", sum);
		}
	}
}

