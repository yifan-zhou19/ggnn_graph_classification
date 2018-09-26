package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int[] year = new int[200];
	 int[] mouth1 = new int[200];
	 int[] mouth2 = new int[200];
	 int[] result = new int[200];
	 int djt = new int(int year, int mouth);
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
		  year[i] = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  mouth1[i] = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  mouth2[i] = Integer.parseInt(tempVar4);
	  }
	  result[i] = djt(year[i], mouth1[i]) - djt(year[i], mouth2[i]);
	 }
	for (i = 0;i < n;i++)
	{
	 if (result[i] % 7 == 0)
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


	public static int djt(int year, int mouth)
	{
	 int i;
	 int djt = 0;
		for (i = 0;i < mouth;i++)
		{
	 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	 {
	  djt += 31;
	 }
	 if (i == 4 || i == 6 || i == 9 || i == 11)
	 {
	  djt += 30;
	 }
	 if (i == 2)
	 {
	  if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	  {
	   djt += 29;
	  }
	  else
	  {
	   djt += 28;
	  }
	 }
		}
	 return (djt);
	}


}

