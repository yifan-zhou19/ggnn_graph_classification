package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int year;
	  int mon1;
	  int mon2;
	  int[] day = new int[12];
	  for (a = 0;a < n;a++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			year = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			mon1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			mon2 = Integer.parseInt(tempVar4);
		}
		int i;
		int j;
		int sum;
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
		 int[] month1 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		 for (i = 1;i <= 12;i++)
		 {
		   sum = 0;
		   for (j = 0;j < i;j++)
		   {
			   sum += month1[j];
		   }
		   day[i] = sum + 1;
		 }
		}
		else
		{
		 int[] month2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		 for (i = 1;i <= 12;i++)
		 {
		   sum = 0;
		   for (j = 0;j < i;j++)
		   {
			   sum += month2[j];
		   }
		   day[i] = sum + 1;
		 }
		}
		 if ((day[mon2] - day[mon1]) % 7 == 0 || (day[mon1] - day[mon2]) % 7 == 0)
		 {
			 System.out.print("YES\n");
		 }
		 else
		 {
			 System.out.print("NO\n");
		 }
	  }
	}
}

