package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nian;
		int yue1;
		int yue2;
		int turn;
		int i;
		int j;
		int days = 0;
		int temp;
		int[] szp = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] szr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			turn = Integer.parseInt(tempVar);
		}


		for (i = 0;i < turn;i++)
		{
							String tempVar2 = ConsoleInput.scanfRead();
							if (tempVar2 != null)
							{
								nian = Integer.parseInt(tempVar2);
							}
							String tempVar3 = ConsoleInput.scanfRead();
							if (tempVar3 != null)
							{
								yue1 = Integer.parseInt(tempVar3);
							}
							String tempVar4 = ConsoleInput.scanfRead();
							if (tempVar4 != null)
							{
								yue2 = Integer.parseInt(tempVar4);
							}
							if (yue1 > yue2)
							{
										   temp = yue1;
										   yue1 = yue2;
										   yue2 = temp;
							}
							if ((nian % 4 != 0) || ((nian % 400 != 0) && (nian % 100 == 0)))
							{
										 days = szp[yue1 - 1];
										 for (j = yue1;j < yue2 - 1;j++)
										 {
															   days += szp[j];
										 }
										 if (days % 7 == 0)
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
								   days = szr[yue1 - 1];
								   for (j = yue1;j < yue2 - 1;j++)
								   {
															   days += szr[j];
								   }
										 if (days % 7 == 0)
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

