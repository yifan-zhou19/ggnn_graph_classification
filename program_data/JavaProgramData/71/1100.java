package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	// struct
	// {
	//	int y,m1,m2;
	// }
	// p[200];
	 int n;
	 int i;
	 int j;
	 int t;
	 int[] day = new int[13];
	 int sum = 0;
	 day[1] = 31;
	 day[3] = 31;
	 day[4] = 30;
	 day[5] = 31;
	 day[6] = 30;
	 day[7] = 31;
	 day[8] = 31;
	 day[9] = 30;
	 day[10] = 31;
	 day[11] = 30;
	 day[12] = 31;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p[i].y = tempVar2;
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  p[i].m1 = tempVar3;
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  p[i].m2 = tempVar4;
	  }

	  if (p[i].y % 4 == 0 && p[i].y % 100 != 0 || p[i].y % 400 == 0)
	  {
	  day[2] = 29;
	  }
	  else
	  {
		  day[2] = 28;
	  }

	  if (p[i].m1 > p[i].m2)
	  {
		 t = p[i].m1;
		 p[i].m1 = p[i].m2;
		 p[i].m2 = t;
	  }
	  for (j = p[i].m1;j < p[i].m2;j++)
	  {
	   sum += day[j];
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

	 return 0;
	}



}

