package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int yy;
		int mm;
		int dd;
		int i;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			yy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			dd = Integer.parseInt(tempVar3);
		}
		if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0)
		{
			for (i = 1;i < mm;i++)
			{
				switch (i)
				{
				case 1:
						n = n + 31;
						break;
				case 2:

						n = n + 29;
						break;
				case 3:
						n = n + 31;
						break;
				case 4:
						n = n + 30;
						break;
				case 5:
						n = n + 31;
						break;
				case 6:
						n = n + 30;
						break;
				case 7:
						n = n + 31;
						break;
				case 8:
						n = n + 31;
						break;
				case 9:
						n = n + 30;
						break;
				case 10:
						n = n + 31;
						break;
				case 11:
						n = n + 30;
						break;
				case 12:
						n = n + 31;
						break;

				}
			}

				n = n + dd;
				System.out.printf("%d",n);


		}

		else
		{
			for (i = 1;i < mm;i++)
			{
				switch (i)
				{
				case 1:
						n = n + 31;
						break;
				case 2:
						n = n + 28;
						break;
				case 3:
						n = n + 31;
						break;
				case 4:
						n = n + 30;
						break;
				case 5:
						n = n + 31;
						break;
				case 6:
						n = n + 30;
						break;
				case 7:
						n = n + 31;
						break;
				case 8:
						n = n + 31;
						break;
				case 9:
						n = n + 30;
						break;
				case 10:
						n = n + 31;
						break;
				case 11:
						n = n + 30;
						break;
				case 12:
						n = n + 31;
						break;

				}
			}

				n = n + dd;
				System.out.printf("%d",n);

		}

		return 0;
	}

}

