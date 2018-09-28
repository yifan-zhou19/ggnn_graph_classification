package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 char[][] name = new char[10000][30];
	 char[][] ganbu = new char[10000][10];
	 char[][] west = new char[10000][10];
	 String str = new String(new char[20]);
	 int[] qime = new int[10000];
	 int[] g = new int[10000];
	 int[] w = new int[10000];
	 int[] e = new int[10000];
	 int[] banji = new int[10000];
	 int sum = 0;
	 int s = 0;
	 int[] sol = new int[10000];
	 char[] yes = {'Y', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
		 sol[i] = 0;
	 g[i] = 1;
	 w[i] = 1;
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  name[i] = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  qime[i] = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  banji[i] = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  ganbu[i] = tempVar5.charAt(0);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  west[i] = tempVar6.charAt(0);
	  }
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  e[i] = Integer.parseInt(tempVar7);
	  }

	  g[i] = strcmp(ganbu[i],yes);

	  w[i] = strcmp(west[i],yes);
	 }
	 for (i = 0;i < n;i++)
	 {
		 sol[i] = 0;
	  if ((qime[i] > 80) && (e[i] > 0))
	  {
		  sol[i] += 8000;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
		 if ((qime[i] > 85) && (banji[i] > 80))
		 {
		  sol[i] += 4000;
		 }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (qime[i] > 90)
	  {
		  sol[i] += 2000;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if ((w[i] == 0) && (qime[i] > 85))
	  {
		  sol[i] += 1000;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if ((g[i] == 0) && (banji[i] > 80))
	  {
		  sol[i] += 850;
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (sol[i] > s)
	  {
		  s = sol[i];
	  str = name[i];
	  }
	  sum += sol[i];
	 }
	 System.out.printf("%s\n%d\n%d\n",str,s,sum);
	 return 0;

	}


}

