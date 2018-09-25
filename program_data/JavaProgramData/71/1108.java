package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int allday1 = 1;
	int[] month1 = new int[1000];
	int[] month2 = new int[1000];
	int allday2 = 1;
	int[] monthday11 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] monthday22 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int i;
	int[] year = new int[1000];
	int k;
				 String tempVar = ConsoleInput.scanfRead();
				 if (tempVar != null)
				 {
					 n = Integer.parseInt(tempVar);
				 }
				 for (k = 0;k < n;k++)
				 {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   year[k] = Integer.parseInt(tempVar2);
			   }
			   String tempVar3 = ConsoleInput.scanfRead(" ");
			   if (tempVar3 != null)
			   {
				   month1[k] = Integer.parseInt(tempVar3);
			   }
			   String tempVar4 = ConsoleInput.scanfRead(" ");
			   if (tempVar4 != null)
			   {
				   month2[k] = Integer.parseInt(tempVar4);
			   }
				 }
				 for (k = 0;k < n;k++)
				 {
				 if (year[k] % 4 == 0 && year[k] % 100 != 0 || year[k] % 400 == 0)
				 {
			allday1 = 1;
					   allday2 = 1;
					   for (i = 0;i < month1[k] - 1;i++)
					   {
				  allday1 += monthday22[i];
					   }
			for (i = 0;i < month2[k] - 1;i++)
			{
				  allday2 += monthday22[i];
			}
			if ((allday1 - allday2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else if ((allday1 - allday2) % 7 != 0)

			{
				System.out.print("NO\n");
			}
				 }
		else if (year[k] % 4 != 0 || year[k] % 100 == 0 && year[k] % 400 != 0)
		{
			allday1 = 1;
						allday2 = 1;
					  for (i = 0;i < month1[k] - 1;i++)
					  {
				allday1 += monthday11[i];
					  }
			for (i = 0;i < month2[k] - 1;i++)
			{
				allday2 += monthday11[i];
			}
			if ((allday1 - allday2) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else if ((allday1 - allday2) % 7 != 0)
			{
				System.out.print("NO\n");
			}
		}
				 }
	return 0;
	}
}

