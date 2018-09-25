package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int year;
	  int month;
	  int day;
	  int i;
	  int sum = 0;
	  int m = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  month = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  day = Integer.parseInt(tempVar3);
	  }
	  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	  {
		int[] M = new int[13];
		M[1] = M[3] = M[5] = M[7] = M[8] = M[10] = M[12] = 31;
		M[4] = M[6] = M[9] = M[11] = 30;
		M[2] = 29;
		M[0] = 0;

		for (i = 0;i < month;i++)
		{
		  m = m + M[i];
		}
		sum = m + day;
	  }
	  else
	  {
		int[] N = new int[13];
		N[1] = N[3] = N[5] = N[7] = N[8] = N[10] = N[12] = 31;
		N[4] = N[6] = N[9] = N[11] = 30;
		N[2] = 28;
		N[0] = 0;
		for (i = 0;i < month;i++)
		{
		  m = m + N[i];
		}
		sum = m + day;
	  }
	  System.out.printf("%d",sum);
	  return 0;
	}


}

