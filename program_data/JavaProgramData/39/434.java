public class points
  {
	   public String name = new String(new char[30]);
	   public int score1;
	   public int score2;
	   public char west;
	   public char leader;
	   public int essay;
	   public int money;
  }

package <missing>;

public class GlobalMembers
{
		public static points[] points = tangible.Arrays.initializeWithDefaultpointsInstances(100);
	   public static int Main()
	   {
		  int n;
		  int i;
		  int max = 0;
		  int m = 0;
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
			  points[i].name = tempVar2.charAt(0);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  points[i].score1 = Integer.parseInt(tempVar3);
		  }
		  String tempVar4 = ConsoleInput.scanfRead(" ");
		  if (tempVar4 != null)
		  {
			  points[i].score2 = Integer.parseInt(tempVar4);
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  points[i].leader = tempVar5.charAt(0);
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  points[i].west = tempVar6.charAt(0);
		  }
		  String tempVar7 = ConsoleInput.scanfRead(" ");
		  if (tempVar7 != null)
		  {
			  points[i].essay = Integer.parseInt(tempVar7);
		  }
		  points[i].money = 0;
		  }
	  for (i = 0;i < n;i++)
	  {
			if (points[i].score1 > 90)
			{
				points[i].money = points[i].money + 2000;
			}
			if (points[i].score1 > 85 && points[i].score2 > 80)
			{
				  points[i].money = points[i].money + 4000;
			}
			if (points[i].score1 > 85 && points[i].west == 'Y')
			{
				points[i].money = points[i].money + 1000;
			}
			if (points[i].score2 > 80 && points[i].leader == 'Y')
			{
				points[i].money = points[i].money + 850;
			}
			if (points[i].score1 > 80 && points[i].essay >= 1)
			{
				points[i].money = points[i].money + 8000;
			}
	  }
		String p = points[0].name;

	  for (i = 0;i < n;i++)
	  {
			if (points[i].money > max)
			{
				max = points[i].money;
				p = points[i].name;
			}
	  }
	   for (i = 0;i < n;i++)
	   {
		   m = m + points[i].money;
	   }
	   System.out.printf("%s\n",p);
	   System.out.printf("%d\n",max);
	   System.out.printf("%d\n",m);
	   return 0;
	   }

}

