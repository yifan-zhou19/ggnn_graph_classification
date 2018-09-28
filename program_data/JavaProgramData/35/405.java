package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int hang;
		int lie;
		int[][] a = new int[8][8];
		int i;
		int j;
		int n = 0;
		int h;
		int max;
		int hmax;
		int q = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hang = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			lie = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < hang;i++)
		{
			for (j = 0;j < lie;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < hang;i++)
		{
			max = a[i][0];
			hmax = 0;
			n = 0;
			for (j = 0;j < lie;j++)
			{


				if (max < a[i][j])
				{
					max = a[i][j];
					hmax = j;
				}
			}


			for (h = 0;h < hang;h++)
			{
				if (max > a[h][hmax])

				{
					break;
				}

				else
				{
					n++;
				}
			}
			if (n == hang)
			{
			System.out.printf("%d+%d",i,hmax);
			q = 1;
			break;
			}


		}


		if (q == 0)
		{
			System.out.print("No");
		}
		return 0;





	}
}

