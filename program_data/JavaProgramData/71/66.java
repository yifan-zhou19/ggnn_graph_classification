package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum;
		int year;
		int month1;
		int month2;
		int[] nor = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						sum = 0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							year = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							month1 = Integer.parseInt(tempVar3);
						}
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							month2 = Integer.parseInt(tempVar4);
						}
						if ((((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0))) && (month1 < month2))
						{
																			  for (j = month1;j < month2;j++)
																			  {
																										sum += run[j];
																			  }
						}
						else if ((((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0))) && (month1 > month2))
						{
							 for (j = month2;j < month1;j++)
							 {
																										sum += run[j];
							 }
						}
						else if (((year % 4 == 0) && (year % 400 != 0)) && (month1 < month2))
						{
							 for (j = month1;j < month2;j++)
							 {
																										sum += nor[j];
							 }
						}
						else if (((year % 4 == 0) && (year % 400 != 0)) && (month1 > month2))
						{
							for (j = month2;j < month1;j++)
							{
																										sum += nor[j];
							}
						}
						else if ((year % 4 != 0) && (month1 < month2))
						{
							 for (j = month1;j < month2;j++)
							 {
																										sum += nor[j];
							 }
						}
						else if ((year % 4 != 0) && (month1 > month2))
						{
							for (j = month2;j < month1;j++)
							{
																										sum += nor[j];
							}
						}
						if (sum % 7 == 0)
						{
						System.out.print("YES\n");
						}
						else
						{
						System.out.print("NO\n");
						}
		}
		return 0;
	}

}

