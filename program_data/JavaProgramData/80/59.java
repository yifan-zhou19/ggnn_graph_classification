package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int yone;
	  int monone;
	  int dayone;
	  int ytwo;
	  int montwo;
	  int daytwo;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  yone = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  monone = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  dayone = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  ytwo = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  montwo = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  daytwo = Integer.parseInt(tempVar6);
	  }
	  int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int i;
	  int j;
	  int day = 0;
	  if (yone == ytwo)
	  {
		  if (monone == montwo)
		  {
			  day = daytwo - dayone;
		  }
		  else
		  {
			  if (yone % 4 == 0 && yone % 100 != 0 || yone % 400 == 0)
			  {
				  mon[1] = 29;
			  }
			  for (i = monone;i < montwo;i++)
			  {
				  day = day + mon[i - 1];
			  }
			  day = day + daytwo;
			  day = day - dayone;
		  }
		  mon[1] = 28;
	  }
	  else
	  {
		  if (yone % 4 == 0 && yone % 100 != 0 || yone % 400 == 0)
		  {
			  mon[1] = 29;
		  }
		  for (i = monone;i <= 12;i++)
		  {
			  day = day + mon[i - 1];
		  }
		  day = day - dayone;
		  mon[1] = 28;
		  if (ytwo % 4 == 0 && ytwo % 100 != 0 || ytwo % 400 == 0)
		  {
			  mon[1] = 29;
		  }
		  for (i = 1;i < montwo;i++)
		  {
			  day = day + mon[i - 1];
		  }
		  day = day + daytwo;
		  mon[1] = 28;
		  if (yone+1 < ytwo)
		  {
			  for (j = yone+1;j < ytwo;j++)
			  {
				  day = day + 365;
				  if (j % 4 == 0 && j % 100 != 0 || j % 400 == 0)
				  {
					  day = day + 1;
				  }
			  }
		  }
	  }
	  System.out.printf("%d",day);
	}



}

