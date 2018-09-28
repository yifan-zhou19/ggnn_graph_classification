package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[13];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a[1] = 31;
		a[2] = 0;
		a[3] = 31;
		a[4] = 30;
		a[5] = 31;
		a[6] = 30;
		a[7] = 31;
		a[8] = 31;
		a[9] = 30;
		a[10] = 31;
		a[11] = 30;
		a[12] = 31;
		int i;
		int year;
		int y1;
		int y2;
		int tmp;
		int sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				y2 = Integer.parseInt(tempVar4);
			}
			if (y1 > y2)
			{
				tmp = y1;
				y1 = y2;
				y2 = tmp;
			}
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				a[2] = 29;
				for (;y1 < y2;y1++)
				{
					sum += a[y1];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}

				sum = 0;
			}

			else
			{
				a[2] = 28;
				for (;y1 < y2;y1++)
				{
					sum += a[y1];
				}
				if (sum % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}

				sum = 0;
			}
		}
		return 0;
	}






}

