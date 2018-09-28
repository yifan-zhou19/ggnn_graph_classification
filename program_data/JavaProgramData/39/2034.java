package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//  {
	//	  char name[20];
	//	int jun;
	//	int ping;
	//	char gan;
	//	char xi;
	//	int lun;
	//	};
	  student[] s = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	  int n;
	  int i;
	  int j;
	  int t;
	  int[] g = new int[100];
	  int m;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i].name = tempVar2;
			}
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  s[i].jun = tempVar3;
		  }
		  String tempVar4 = ConsoleInput.scanfRead();
		  if (tempVar4 != null)
		  {
			  s[i].ping = tempVar4;
		  }
		  String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar5 != null)
		  {
			  s[i].gan = tempVar5;
		  }
		  String tempVar6 = ConsoleInput.scanfRead(" ", 1);
		  if (tempVar6 != null)
		  {
			  s[i].xi = tempVar6;
		  }
		  String tempVar7 = ConsoleInput.scanfRead();
		  if (tempVar7 != null)
		  {
			  s[i].lun = tempVar7;
		  }
	  }
	  for (i = 0;i <= (n - 1);i++)
	  {
		   g[i] = 0;
		 if (s[i].jun > 80 && s[i].lun >= 1)
		 {
			 g[i] = g[i] + 8000;
		 }
		 if (s[i].jun > 85 && s[i].ping > 80)
		 {
			 g[i] = g[i] + 4000;
		 }
		 if (s[i].jun > 90)
		 {
			 g[i] = g[i] + 2000;
		 }
		 if (s[i].xi == 'Y' && s[i].jun > 85)
		 {
			 g[i] = g[i] + 1000;
		 }
		 if (s[i].gan == 'Y' && s[i].ping > 80)
		 {
			 g[i] = g[i] + 850;
		 }
	  }
	  m = g[0];
	  j = 0;
	  t = 0;
	  for (i = 0;i <= (n - 1);i++)
	  {
		   t = t + g[i];
		 if (m < g[i])
		 {
			 m = g[i];
			 j = i;
		 }
	  }
	  System.out.printf("%s\n%d\n%ld",s[j].name,m,t);
	}
}

