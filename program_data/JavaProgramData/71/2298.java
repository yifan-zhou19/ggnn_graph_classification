package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int a = 0;

		int year;
		int month1;
		int month2;

		int[] mi = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int[] mj = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}



		for (i = 1;i <= n;i++)
		{
			a = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}

			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{

				if (month2 < month1)
				{
					m = month1;
					month1 = month2;
					month2 = m;
				}

				for (j = month1 - 1;j < month2 - 1;j++)
				{
					a = a + mj[j];

				}
				if (a % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}

			}
			else
			{
				if (month2 < month1)
				{
					m = month1;
					month1 = month2;
					month2 = m;


				}
					for (j = month1 - 1;j < month2 - 1;j++)
					{
					a = a + mi[j];

					}
				if (a % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{
					System.out.print("NO\n");
				}


			}



		}
		return 0;

	}
}

