package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int[] g = new int[101];
	 int[] c = new int[101];
	 int[] e = new int[101];
	 int i;
	 int m;
	 int n;
	 int[] mon = new int[101];
	 int max = 0;
	 int sum = 0;
	 int j;
	 char[][] name = new char[101][20];
	 String west = new String(new char[101]);
	 String leader = new String(new char[101]);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;;j++)
	   {
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				name[i][j] = tempVar2.charAt(0);
			}
		 if (name[i][j] == ' ')
		 {
			 break;
		 }
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   g[i] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   c[i] = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar5 != null)
	   {
		   leader = tangible.StringFunctions.changeCharacter(leader, i, tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar6 != null)
	   {
		   west = tangible.StringFunctions.changeCharacter(west, i, tempVar6);
	   }
	   String tempVar7 = ConsoleInput.scanfRead();
	   if (tempVar7 != null)
	   {
		   e[i] = Integer.parseInt(tempVar7);
	   }
	   mon[i] = 0;
	   if (g[i] > 80 && e[i] >= 1)
	   {
		   mon[i] = mon[i] + 8000;
	   }
	   if (g[i] > 85 && c[i] > 80)
	   {
		   mon[i] = mon[i] + 4000;
	   }
	   if (g[i] > 90)
	   {
		   mon[i] = mon[i] + 2000;
	   }
	   if (g[i] > 85 && west.charAt(i) == 'Y')
	   {
		   mon[i] = mon[i] + 1000;
	   }
	   if (c[i] > 80 && leader.charAt(i) == 'Y')
	   {
		   mon[i] = mon[i] + 850;
	   }
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (mon[i] > max)
	  {
		  max = mon[i];
		  m = i;
	  }
	  sum = sum + mon[i];
	 }
	 for (j = 0;;j++)
	 {
		 if (name[m][j] != ' ')
		 {
	   System.out.printf("%c",name[m][j]);
		 }
	   else
	   {
		   System.out.print("\n");
		   break;
	   }
	 }
	 System.out.printf("%d\n%d",mon[m],sum);
	 return 0;
	}

}

